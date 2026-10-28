package com.jlpt.n5.viewmodel

import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Lesson
import com.jlpt.n5.model.Vocabulary
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class HomeUiState(
    val readinessPercent: Int = 0,
    val streakDays: Int = 3,
    val dailyVocab: Vocabulary? = null,
    val masteredVocabCount: Int = 0,
    val totalVocabCount: Int = 0,
    val masteredKanjiCount: Int = 0,
    val totalKanjiCount: Int = 0,
    val completedLessonsCount: Int = 0,
    val totalLessonsCount: Int = 25,
    val roadmapLessons: List<Lesson> = emptyList()
)

class HomeViewModel(
    private val repository: JLPTRepository = JLPTRepository
) : BaseViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        refresh()
    }

    fun refresh() {
        val totalVocab = repository.lessons.sumOf { it.vocabularies.size }
        val masteredVocab = repository.masteredVocabIds.size
        val totalKanji = repository.kanjiList.size
        val masteredKanji = repository.masteredKanjiIds.size
        val completedLessons = repository.completedLessonNumbers.size
        val totalLessons = repository.lessons.size

        val vocabScore = if (totalVocab > 0) (masteredVocab.toFloat() / totalVocab) * 50f else 0f
        val kanjiScore = if (totalKanji > 0) (masteredKanji.toFloat() / totalKanji) * 30f else 0f
        val lessonScore = if (totalLessons > 0) (completedLessons.toFloat() / totalLessons) * 20f else 0f
        val readiness = (vocabScore + kanjiScore + lessonScore).toInt().coerceIn(0, 100)

        _uiState.update {
            it.copy(
                readinessPercent = readiness,
                dailyVocab = repository.lessons.firstOrNull()?.vocabularies?.firstOrNull(),
                masteredVocabCount = masteredVocab,
                totalVocabCount = totalVocab,
                masteredKanjiCount = masteredKanji,
                totalKanjiCount = totalKanji,
                completedLessonsCount = completedLessons,
                totalLessonsCount = totalLessons,
                roadmapLessons = repository.lessons.take(5)
            )
        }
    }
}
