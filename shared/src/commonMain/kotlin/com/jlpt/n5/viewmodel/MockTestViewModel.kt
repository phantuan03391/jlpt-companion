package com.jlpt.n5.viewmodel

import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.ExamResult
import com.jlpt.n5.model.MockTest
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ExamSessionState(
    val test: MockTest? = null,
    val remainingSeconds: Int = 0,
    val currentQuestionIndex: Int = 0,
    val userAnswers: Map<Int, Int> = emptyMap(), // questionId -> selectedOptionIndex
    val isTimeUp: Boolean = false
)

class MockTestViewModel(
    private val repository: JLPTRepository = JLPTRepository
) : BaseViewModel() {
    val tests: List<MockTest> get() = repository.mockTests
    val history: List<ExamResult> get() = repository.examHistory

    private val _examState = MutableStateFlow(ExamSessionState())
    val examState: StateFlow<ExamSessionState> = _examState.asStateFlow()

    private var timerJob: Job? = null

    fun startExam(testId: String) {
        timerJob?.cancel()
        val test = repository.getMockTest(testId)
        val initialSeconds = (test?.durationMinutes ?: 45) * 60

        _examState.value = ExamSessionState(
            test = test,
            remainingSeconds = initialSeconds,
            currentQuestionIndex = 0,
            userAnswers = emptyMap(),
            isTimeUp = false
        )

        // Launch countdown timer
        timerJob = viewModelScope.launch {
            while (_examState.value.remainingSeconds > 0) {
                delay(1000L)
                _examState.update { it.copy(remainingSeconds = it.remainingSeconds - 1) }
            }
            _examState.update { it.copy(isTimeUp = true) }
        }
    }

    fun selectAnswer(questionId: Int, optionIndex: Int) {
        _examState.update {
            val updated = it.userAnswers.toMutableMap()
            updated[questionId] = optionIndex
            it.copy(userAnswers = updated)
        }
    }

    fun nextQuestion() {
        val total = _examState.value.test?.questions?.size ?: 0
        if (_examState.value.currentQuestionIndex < total - 1) {
            _examState.update { it.copy(currentQuestionIndex = it.currentQuestionIndex + 1) }
        }
    }

    fun prevQuestion() {
        if (_examState.value.currentQuestionIndex > 0) {
            _examState.update { it.copy(currentQuestionIndex = it.currentQuestionIndex - 1) }
        }
    }

    fun jumpToQuestion(index: Int) {
        val total = _examState.value.test?.questions?.size ?: 0
        if (index in 0 until total) {
            _examState.update { it.copy(currentQuestionIndex = index) }
        }
    }

    fun submitExam(): ExamResult {
        timerJob?.cancel()
        val state = _examState.value
        val test = state.test ?: throw IllegalStateException("No test active")

        var correctCount = 0
        test.questions.forEach { q ->
            if (state.userAnswers[q.id] == q.correctIndex) {
                correctCount++
            }
        }

        val totalQuestions = test.questions.size
        val score = if (totalQuestions > 0) {
            (correctCount.toFloat() / totalQuestions * test.maxScore).toInt()
        } else 0
        val passed = score >= test.passScore

        val result = ExamResult(
            testId = test.id,
            testTitle = test.title,
            score = score,
            maxScore = test.maxScore,
            passed = passed,
            timestamp = com.jlpt.n5.data.PlatformStorage.currentTimeMillis(),
            correctCount = correctCount,
            totalQuestions = totalQuestions
        )

        repository.addExamResult(result)
        return result
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
    }
}
