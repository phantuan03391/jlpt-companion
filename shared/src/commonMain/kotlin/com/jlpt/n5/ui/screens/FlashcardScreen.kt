package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.components.FlipCard
import com.jlpt.n5.ui.screens.flashcard.components.*
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.FlashcardViewModel

@Composable
fun FlashcardScreen(
    initialLessonNumber: Int? = null,
    initialKanjiOnly: Boolean = false,
    viewModel: FlashcardViewModel = remember { FlashcardViewModel() },
    onBack: (() -> Unit)? = null
) {
    LaunchedEffect(initialLessonNumber, initialKanjiOnly) {
        viewModel.initialize(lessonNumber = initialLessonNumber, kanjiOnly = initialKanjiOnly)
    }

    val state by viewModel.uiState.collectAsState()
    val currentCard = state.currentCard
    val totalCount = state.totalCount
    val currentIndex = state.currentIndex

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        FlashcardHeaderSection(
            isKanjiMode = state.isKanjiMode,
            onBack = onBack,
            onShuffle = { viewModel.shuffleDeck() }
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Mode Selector: Từ vựng vs Kanji
        FlashcardModeSelector(
            isKanjiMode = state.isKanjiMode,
            onSelectVocab = { viewModel.setKanjiMode(false) },
            onSelectKanji = { viewModel.setKanjiMode(true) }
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Progress counter & Hint toggle
        if (totalCount > 0) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Thẻ ${currentIndex + 1} / $totalCount",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textSecondary
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextButton(
                        onClick = { viewModel.toggleReadingHint() },
                        contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = if (state.showReadingHint) "👁️ Ẩn cách đọc" else "👁️ Hiện cách đọc",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colors.toriiAccent
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(
                        text = "${((currentIndex + 1).toFloat() / totalCount * 100).toInt()}%",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            LinearProgressIndicator(
                progress = (currentIndex + 1).toFloat() / totalCount,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = MaterialTheme.colors.toriiAccent,
                backgroundColor = MaterialTheme.colors.surfaceContainer
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Main Flashcard View
        if (currentCard != null) {
            FlipCard(
                isFlipped = state.isFlipped,
                onFlip = { viewModel.flipCard() },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(24.dp)),
                front = {
                    FlashcardFront(card = currentCard, showReadingHint = state.showReadingHint)
                },
                back = {
                    FlashcardBack(card = currentCard)
                }
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Control Buttons Row
            FlashcardActionRow(
                currentCard = currentCard,
                hasPrev = currentIndex > 0,
                hasNext = currentIndex < totalCount - 1,
                onPrev = { viewModel.prevCard() },
                onNext = { viewModel.nextCard() },
                onNotRemembered = { viewModel.nextCard() },
                onToggleStar = { viewModel.toggleCurrentStarred() },
                onMastered = { viewModel.markCurrentMasteredAndNext() }
            )
        } else {
            // Empty state
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "🎉", fontSize = 48.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Không có thẻ nào để hiển thị",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.textPrimary
                    )
                    Text(
                        text = "Hãy chọn bài học khác hoặc chuyển sang chế độ Kanji",
                        fontSize = 13.sp,
                        color = MaterialTheme.colors.textSecondary
                    )
                }
            }
        }
    }
}
