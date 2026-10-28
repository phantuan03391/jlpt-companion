package com.jlpt.n5.viewmodel

import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Lesson
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class LessonListUiState(
    val searchQuery: String = "",
    val selectedFilter: String = "ALL", // "ALL", "COMPLETED", "INCOMPLETE"
    val filteredLessons: List<Lesson> = emptyList(),
    val completedLessonNumbers: Set<Int> = emptySet(),
    val totalLessonsCount: Int = 0,
    val completedCount: Int = 0,
    val incompleteCount: Int = 0
)

class LessonListViewModel(
    private val repository: JLPTRepository = JLPTRepository
) : BaseViewModel() {
    private val _uiState = MutableStateFlow(LessonListUiState())
    val uiState: StateFlow<LessonListUiState> = _uiState.asStateFlow()

    init {
        refresh()
    }

    fun setSearchQuery(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
        recomputeFilteredList()
    }

    fun setSelectedFilter(filter: String) {
        _uiState.update { it.copy(selectedFilter = filter) }
        recomputeFilteredList()
    }

    fun refresh() {
        val completed = repository.completedLessonNumbers.toSet()
        val total = repository.lessons.size
        val completedCount = completed.size
        val incompleteCount = (total - completedCount).coerceAtLeast(0)

        _uiState.update {
            it.copy(
                completedLessonNumbers = completed,
                totalLessonsCount = total,
                completedCount = completedCount,
                incompleteCount = incompleteCount
            )
        }
        recomputeFilteredList()
    }

    private fun recomputeFilteredList() {
        val query = _uiState.value.searchQuery.trim()
        val filter = _uiState.value.selectedFilter
        val completed = _uiState.value.completedLessonNumbers

        val filtered = repository.lessons.filter { lesson ->
            val matchesQuery = query.isEmpty() ||
                    lesson.title.contains(query, ignoreCase = true) ||
                    lesson.description.contains(query, ignoreCase = true) ||
                    lesson.lessonNumber.toString() == query

            val isDone = completed.contains(lesson.lessonNumber)
            val matchesFilter = when (filter) {
                "COMPLETED" -> isDone
                "INCOMPLETE" -> !isDone
                else -> true
            }

            matchesQuery && matchesFilter
        }

        _uiState.update { it.copy(filteredLessons = filtered) }
    }
}
