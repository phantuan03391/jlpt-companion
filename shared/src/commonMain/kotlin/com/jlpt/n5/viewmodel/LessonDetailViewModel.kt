package com.jlpt.n5.viewmodel

import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Lesson
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class LessonDetailUiState(
    val lesson: Lesson? = null,
    val selectedTab: Int = 0, // 0: Vocab, 1: Grammar, 2: Practice
    val isCompleted: Boolean = false,
    val masteredVocabIds: Set<Int> = emptySet(),
    val starredVocabIds: Set<Int> = emptySet()
)

class LessonDetailViewModel(
    private val repository: JLPTRepository = JLPTRepository
) : BaseViewModel() {
    private val _uiState = MutableStateFlow(LessonDetailUiState())
    val uiState: StateFlow<LessonDetailUiState> = _uiState.asStateFlow()

    fun loadLesson(lessonNumber: Int) {
        val lesson = repository.getLesson(lessonNumber)
        val isCompleted = repository.completedLessonNumbers.contains(lessonNumber)
        _uiState.update {
            it.copy(
                lesson = lesson,
                isCompleted = isCompleted,
                masteredVocabIds = repository.masteredVocabIds.toSet(),
                starredVocabIds = repository.starredVocabIds.toSet()
            )
        }
    }

    fun selectTab(tabIndex: Int) {
        _uiState.update { it.copy(selectedTab = tabIndex) }
    }

    fun toggleLessonCompleted() {
        val currentLesson = _uiState.value.lesson ?: return
        val isNowCompleted = repository.toggleLessonCompleted(currentLesson.lessonNumber)
        _uiState.update { it.copy(isCompleted = isNowCompleted) }
    }

    fun toggleVocabMastered(vocabId: Int) {
        repository.toggleMasteredVocab(vocabId)
        _uiState.update { it.copy(masteredVocabIds = repository.masteredVocabIds.toSet()) }
    }

    fun toggleVocabStarred(vocabId: Int) {
        repository.toggleStarredVocab(vocabId)
        _uiState.update { it.copy(starredVocabIds = repository.starredVocabIds.toSet()) }
    }
}
