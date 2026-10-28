package com.jlpt.n5.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.FlashcardItem
import com.jlpt.n5.ui.components.FlipCard
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun FlashcardScreen(
    initialLessonNumber: Int? = null,
    initialKanjiOnly: Boolean = false,
    onBack: (() -> Unit)? = null
) {
    var isKanjiMode by remember { mutableStateOf(initialKanjiOnly) }
    var selectedLessonNumber by remember { mutableStateOf(initialLessonNumber) }
    var filterStarredOnly by remember { mutableStateOf(false) }
    var showReadingHint by remember { mutableStateOf(true) }

    var cardList by remember(isKanjiMode, selectedLessonNumber, filterStarredOnly) {
        val base = JLPTRepository.getAllFlashcards(
            lessonNumber = if (isKanjiMode) null else selectedLessonNumber,
            kanjiOnly = isKanjiMode
        )
        val filtered = if (filterStarredOnly) base.filter { it.isStarred } else base
        mutableStateOf(filtered)
    }

    var currentIndex by remember(cardList) { mutableStateOf(0) }
    var isFlipped by remember(currentIndex) { mutableStateOf(false) }

    val currentCard = cardList.getOrNull(currentIndex)
    val totalCount = cardList.size

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (onBack != null) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colors.surfaceContainer)
                            .clickable { onBack() },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "←",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                Column {
                    Text(
                        text = "FLASHCARDS",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent,
                        letterSpacing = 1.sp
                    )
                    Text(
                        text = if (isKanjiMode) "104 Hán Tự Kanji N5" else "Từ vựng Minna",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.textPrimary
                    )
                }
            }

            // Shuffle Button & Star Filter Button
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(
                    onClick = {
                        cardList = cardList.shuffled()
                        currentIndex = 0
                        isFlipped = false
                    }
                ) {
                    Text(text = "🔀", fontSize = 18.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Mode Selector: Từ vựng vs Kanji
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colors.surfaceContainer)
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ModeSelectButton(
                text = "📖 Từ vựng Minna",
                isSelected = !isKanjiMode,
                modifier = Modifier.weight(1f),
                onClick = {
                    isKanjiMode = false
                    currentIndex = 0
                    isFlipped = false
                }
            )

            ModeSelectButton(
                text = "🈲 104 Kanji N5",
                isSelected = isKanjiMode,
                modifier = Modifier.weight(1f),
                onClick = {
                    isKanjiMode = true
                    selectedLessonNumber = null
                    currentIndex = 0
                    isFlipped = false
                }
            )
        }

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
                        onClick = { showReadingHint = !showReadingHint },
                        contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = if (showReadingHint) "👁️ Ẩn cách đọc" else "👁️ Hiện cách đọc",
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
                isFlipped = isFlipped,
                onFlip = { isFlipped = !isFlipped },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(24.dp)),
                front = {
                    FlashcardFront(card = currentCard, showReadingHint = showReadingHint)
                },
                back = {
                    FlashcardBack(card = currentCard)
                }
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Control Buttons Row (3-tier SRS: Chưa nhớ, Đang nhớ, Đã thuộc + Star + Navigation)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Previous button
                ActionButton(
                    icon = "⬅️",
                    label = "Trước",
                    bgColor = MaterialTheme.colors.surfaceContainer,
                    textColor = MaterialTheme.colors.textPrimary,
                    enabled = currentIndex > 0,
                    onClick = {
                        if (currentIndex > 0) {
                            currentIndex--
                            isFlipped = false
                        }
                    }
                )

                // ❌ Chưa nhớ
                ActionButton(
                    icon = "❌",
                    label = "Chưa nhớ",
                    bgColor = MaterialTheme.colors.toriiBg,
                    textColor = MaterialTheme.colors.toriiAccent,
                    onClick = {
                        if (currentIndex < totalCount - 1) {
                            currentIndex++
                            isFlipped = false
                        }
                    }
                )

                // ⭐ Favorite toggle
                ActionButton(
                    icon = if (currentCard.isStarred) "⭐" else "☆",
                    label = "Yêu thích",
                    bgColor = MaterialTheme.colors.amberBg,
                    textColor = OchreAmber,
                    onClick = {
                        if (currentCard.id.startsWith("vocab_")) {
                            val id = currentCard.id.removePrefix("vocab_").toIntOrNull()
                            if (id != null) JLPTRepository.toggleStarredVocab(id)
                        } else if (currentCard.id.startsWith("kanji_")) {
                            val id = currentCard.id.removePrefix("kanji_").toIntOrNull()
                            if (id != null) JLPTRepository.toggleStarredKanji(id)
                        }
                    }
                )

                // ✅ Đã thuộc (Mastered)
                ActionButton(
                    icon = "✅",
                    label = "Đã thuộc",
                    bgColor = MaterialTheme.colors.matchaBg,
                    textColor = MaterialTheme.colors.matchaAccent,
                    onClick = {
                        if (currentCard.id.startsWith("vocab_")) {
                            val id = currentCard.id.removePrefix("vocab_").toIntOrNull()
                            if (id != null) JLPTRepository.masteredVocabIds.add(id)
                        } else if (currentCard.id.startsWith("kanji_")) {
                            val id = currentCard.id.removePrefix("kanji_").toIntOrNull()
                            if (id != null) JLPTRepository.masteredKanjiIds.add(id)
                        }
                        if (currentIndex < totalCount - 1) {
                            currentIndex++
                            isFlipped = false
                        }
                    }
                )

                // Next button
                ActionButton(
                    icon = "➡️",
                    label = "Tiếp",
                    bgColor = MaterialTheme.colors.surfaceContainer,
                    textColor = MaterialTheme.colors.textPrimary,
                    enabled = currentIndex < totalCount - 1,
                    onClick = {
                        if (currentIndex < totalCount - 1) {
                            currentIndex++
                            isFlipped = false
                        }
                    }
                )
            }
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

@Composable
fun FlashcardFront(
    card: FlashcardItem,
    showReadingHint: Boolean
) {
    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 3.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                JapaneseBadge(
                    text = if (card.type == com.jlpt.n5.model.FlashcardType.KANJI) "KANJI N5" else "TỪ VỰNG MINNA",
                    backgroundColor = MaterialTheme.colors.surfaceContainer,
                    textColor = MaterialTheme.colors.toriiAccent
                )

                Spacer(modifier = Modifier.height(28.dp))

                Text(
                    text = card.frontMain,
                    fontSize = if (card.frontMain.length <= 3) 54.sp else if (card.frontMain.length <= 6) 38.sp else 28.sp,
                    fontWeight = FontWeight.Black,
                    color = MaterialTheme.colors.textPrimary,
                    textAlign = TextAlign.Center
                )

                if (showReadingHint && card.frontSub.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = card.frontSub,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colors.toriiAccent,
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(36.dp))

                Text(
                    text = "🔄 Chạm vào thẻ để lật xem nghĩa",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun FlashcardBack(card: FlashcardItem) {
    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 3.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.surfaceContainerLow)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                JapaneseBadge(
                    text = "Ý NGHĨA & VÍ DỤ",
                    backgroundColor = MaterialTheme.colors.toriiBg,
                    textColor = MaterialTheme.colors.toriiAccent
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = card.backMeaning,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colors.toriiAccent,
                    textAlign = TextAlign.Center
                )

                if (card.backDetails.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = card.backDetails,
                        fontSize = 14.sp,
                        color = MaterialTheme.colors.textSecondary,
                        textAlign = TextAlign.Center
                    )
                }

                if (card.example.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = MaterialTheme.colors.cardBackground,
                        elevation = 1.dp
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                text = "Ví dụ mẫu:",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textMuted
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = card.example,
                                fontSize = 13.sp,
                                color = MaterialTheme.colors.textPrimary,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(22.dp))

                Text(
                    text = "🔄 Chạm để lật lại mặt trước",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted
                )
            }
        }
    }
}

@Composable
fun ModeSelectButton(
    text: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(if (isSelected) MaterialTheme.colors.toriiAccent else Color.Transparent)
            .clickable { onClick() }
            .padding(vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = if (isSelected) Color.White else MaterialTheme.colors.textSecondary
        )
    }
}

@Composable
fun ActionButton(
    icon: String,
    label: String,
    bgColor: Color,
    textColor: Color,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable(enabled = enabled) { onClick() }
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(if (enabled) bgColor else MaterialTheme.colors.surfaceContainer),
            contentAlignment = Alignment.Center
        ) {
            Text(text = icon, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = label,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (enabled) textColor else MaterialTheme.colors.textMuted
        )
    }
}
