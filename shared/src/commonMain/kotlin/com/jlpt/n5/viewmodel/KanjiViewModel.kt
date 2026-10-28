package com.jlpt.n5.viewmodel

import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.KanjiItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class KanjiUiState(
    val searchQuery: String = "",
    val filteredKanji: List<KanjiItem> = emptyList(),
    val selectedKanji: KanjiItem? = null,
    val masteredKanjiIds: Set<Int> = emptySet(),
    val totalCount: Int = 104
)

class KanjiViewModel(
    private val repository: JLPTRepository = JLPTRepository
) : BaseViewModel() {
    private val _uiState = MutableStateFlow(KanjiUiState())
    val uiState: StateFlow<KanjiUiState> = _uiState.asStateFlow()

    init {
        refresh()
    }

    fun setSearchQuery(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
        recomputeFilteredList()
    }

    fun selectKanji(item: KanjiItem?) {
        _uiState.update { it.copy(selectedKanji = item) }
    }

    fun toggleMastered(id: Int) {
        repository.toggleMasteredKanji(id)
        refresh()
    }

    fun refresh() {
        val mastered = repository.masteredKanjiIds.toSet()
        _uiState.update {
            it.copy(
                masteredKanjiIds = mastered,
                totalCount = repository.kanjiList.size
            )
        }
        recomputeFilteredList()
    }

    private fun recomputeFilteredList() {
        val q = _uiState.value.searchQuery.trim().lowercase()
        val list = repository.kanjiList.filter { item ->
            q.isEmpty() ||
                    item.kanji.contains(q, ignoreCase = true) ||
                    item.hanViet.contains(q, ignoreCase = true) ||
                    item.meaning.contains(q, ignoreCase = true) ||
                    item.onyomi.any { it.contains(q, ignoreCase = true) } ||
                    item.kunyomi.any { it.contains(q, ignoreCase = true) }
        }
        _uiState.update { it.copy(filteredKanji = list) }
    }
}
