package com.jlpt.n5.viewmodel

import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.FlashcardItem
import com.jlpt.n5.model.FlashcardType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class FlashcardUiState(
    val isKanjiMode: Boolean = false,
    val selectedLessonNumber: Int? = null,
    val filterStarredOnly: Boolean = false,
    val showReadingHint: Boolean = true,
    val cards: List<FlashcardItem> = emptyList(),
    val currentIndex: Int = 0,
    val isFlipped: Boolean = false
) {
    val currentCard: FlashcardItem? get() = cards.getOrNull(currentIndex)
    val totalCount: Int get() = cards.size
}

class FlashcardViewModel(
    private val repository: JLPTRepository = JLPTRepository
) : BaseViewModel() {
    private val _uiState = MutableStateFlow(FlashcardUiState())
    val uiState: StateFlow<FlashcardUiState> = _uiState.asStateFlow()

    fun initialize(lessonNumber: Int?, kanjiOnly: Boolean) {
        _uiState.update {
            it.copy(
                selectedLessonNumber = lessonNumber,
                isKanjiMode = kanjiOnly,
                currentIndex = 0,
                isFlipped = false
            )
        }
        reloadCards()
    }

    fun setKanjiMode(enabled: Boolean) {
        _uiState.update {
            it.copy(isKanjiMode = enabled, currentIndex = 0, isFlipped = false)
        }
        reloadCards()
    }

    fun setFilterStarred(starredOnly: Boolean) {
        _uiState.update {
            it.copy(filterStarredOnly = starredOnly, currentIndex = 0, isFlipped = false)
        }
        reloadCards()
    }

    fun setLessonNumber(lessonNumber: Int?) {
        _uiState.update {
            it.copy(selectedLessonNumber = lessonNumber, currentIndex = 0, isFlipped = false)
        }
        reloadCards()
    }

    fun toggleFilterStarred() {
        _uiState.update {
            it.copy(filterStarredOnly = !it.filterStarredOnly, currentIndex = 0, isFlipped = false)
        }
        reloadCards()
    }

    fun toggleReadingHint() {
        _uiState.update { it.copy(showReadingHint = !it.showReadingHint) }
    }

    fun flipCard() {
        _uiState.update { it.copy(isFlipped = !it.isFlipped) }
    }

    fun nextCard() {
        val total = _uiState.value.cards.size
        if (_uiState.value.currentIndex < total - 1) {
            _uiState.update {
                it.copy(currentIndex = it.currentIndex + 1, isFlipped = false)
            }
        }
    }

    fun prevCard() {
        if (_uiState.value.currentIndex > 0) {
            _uiState.update {
                it.copy(currentIndex = it.currentIndex - 1, isFlipped = false)
            }
        }
    }

    fun shuffleDeck() {
        _uiState.update {
            it.copy(
                cards = it.cards.shuffled(),
                currentIndex = 0,
                isFlipped = false
            )
        }
    }

    fun toggleCurrentStarred() {
        val card = _uiState.value.currentCard ?: return
        val rawId = card.id.removePrefix("vocab_").removePrefix("kanji_").toIntOrNull() ?: return
        if (card.type == FlashcardType.KANJI) {
            repository.toggleStarredKanji(rawId)
        } else {
            repository.toggleStarredVocab(rawId)
        }
        reloadCards()
    }

    fun markCurrentMasteredAndNext() {
        val card = _uiState.value.currentCard ?: return
        val rawId = card.id.removePrefix("vocab_").removePrefix("kanji_").toIntOrNull() ?: return
        if (card.type == FlashcardType.KANJI) {
            repository.masteredKanjiIds.add(rawId)
        } else {
            repository.masteredVocabIds.add(rawId)
        }
        reloadCards()
        nextCard()
    }

    fun reloadCards() {
        val state = _uiState.value
        val base = repository.getAllFlashcards(
            lessonNumber = if (state.isKanjiMode) null else state.selectedLessonNumber,
            kanjiOnly = state.isKanjiMode
        )
        val filtered = if (state.filterStarredOnly) base.filter { it.isStarred } else base
        _uiState.update {
            it.copy(
                cards = filtered,
                currentIndex = it.currentIndex.coerceIn(0, (filtered.size - 1).coerceAtLeast(0))
            )
        }
    }
}
