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
                            .background(Slate100)
                            .clickable { onBack() },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "←", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                Column {
                    Text(
                        text = "FLASHCARDS",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = SakuraPink
                    )
                    Text(
                        text = if (isKanjiMode) "Ôn tập 104 Kanji N5" else "Ôn từ vựng Minna",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.onBackground
                    )
                }
            }

            // Shuffle Button
            IconButton(
                onClick = {
                    cardList = cardList.shuffled()
                    currentIndex = 0
                    isFlipped = false
                }
            ) {
                Text(text = "🔀", fontSize = 20.sp)
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Mode Selector: Từ vựng vs Kanji
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colors.surface)
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

        // Progress counter
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
                    color = Slate600
                )

                Text(
                    text = "${((currentIndex + 1).toFloat() / totalCount * 100).toInt()}% hoàn thành",
                    fontSize = 12.sp,
                    color = IndigoPrimary,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            LinearProgressIndicator(
                progress = (currentIndex + 1).toFloat() / totalCount,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = SakuraPink,
                backgroundColor = Slate200
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

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
                    FlashcardFront(card = currentCard)
                },
                back = {
                    FlashcardBack(card = currentCard)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Control Buttons Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Previous button
                ActionButton(
                    icon = "⬅️",
                    label = "Trước",
                    bgColor = Slate100,
                    textColor = Slate700,
                    enabled = currentIndex > 0,
                    onClick = {
                        if (currentIndex > 0) {
                            currentIndex--
                            isFlipped = false
                        }
                    }
                )

                // Need Review (Not Mastered)
                ActionButton(
                    icon = "❌",
                    label = "Cần ôn lại",
                    bgColor = SakuraPinkLight,
                    textColor = SakuraPink,
                    onClick = {
                        if (currentIndex < totalCount - 1) {
                            currentIndex++
                            isFlipped = false
                        }
                    }
                )

                // Star Favorite Toggle
                ActionButton(
                    icon = if (currentCard.isStarred) "⭐" else "☆",
                    label = "Yêu thích",
                    bgColor = AmberLight,
                    textColor = AmberWarning,
                    onClick = {
                        // Toggle star
                        if (currentCard.id.startsWith("vocab_")) {
                            val id = currentCard.id.removePrefix("vocab_").toIntOrNull()
                            if (id != null) JLPTRepository.toggleStarredVocab(id)
                        } else if (currentCard.id.startsWith("kanji_")) {
                            val id = currentCard.id.removePrefix("kanji_").toIntOrNull()
                            if (id != null) JLPTRepository.toggleStarredKanji(id)
                        }
                    }
                )

                // Mastered Button
                ActionButton(
                    icon = "✅",
                    label = "Đã thuộc",
                    bgColor = MatchaGreenLight,
                    textColor = MatchaGreen,
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
                        color = Slate700
                    )
                    Text(
                        text = "Hãy chọn bài học khác hoặc chuyển sang chế độ Kanji",
                        fontSize = 13.sp,
                        color = Slate500
                    )
                }
            }
        }
    }
}

@Composable
fun FlashcardFront(card: FlashcardItem) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(SurfaceWhite)
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            JapaneseBadge(
                text = if (card.type == com.jlpt.n5.model.FlashcardType.KANJI) "KANJI N5" else "TỪ VỰNG",
                backgroundColor = IndigoSubtle,
                textColor = IndigoPrimary
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = card.frontMain,
                fontSize = if (card.frontMain.length <= 4) 48.sp else 32.sp,
                fontWeight = FontWeight.Black,
                color = Slate900,
                textAlign = TextAlign.Center
            )

            if (card.frontSub.isNotEmpty()) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = card.frontSub,
                    fontSize = 16.sp,
                    color = Slate500,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(36.dp))

            Text(
                text = "🔄 Chạm vào thẻ để lật xem nghĩa",
                fontSize = 12.sp,
                color = Slate400,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun FlashcardBack(card: FlashcardItem) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoSubtle)
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            JapaneseBadge(
                text = "Ý NGHĨA & VÍ DỤ",
                backgroundColor = SakuraPinkLight,
                textColor = SakuraPink
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = card.backMeaning,
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = IndigoDark,
                textAlign = TextAlign.Center
            )

            if (card.backDetails.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = card.backDetails,
                    fontSize = 13.sp,
                    color = Slate600,
                    textAlign = TextAlign.Center
                )
            }

            if (card.example.isNotEmpty()) {
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    backgroundColor = SurfaceWhite,
                    elevation = 1.dp
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(
                            text = "Ví dụ mẫu:",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Slate500
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = card.example,
                            fontSize = 13.sp,
                            color = Slate800,
                            lineHeight = 18.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "🔄 Chạm để lật lại mặt trước",
                fontSize = 12.sp,
                color = Slate400
            )
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
            .background(if (isSelected) IndigoPrimary else Color.Transparent)
            .clickable { onClick() }
            .padding(vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = if (isSelected) SurfaceWhite else Slate600
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
                .size(54.dp)
                .clip(CircleShape)
                .background(if (enabled) bgColor else Slate100),
            contentAlignment = Alignment.Center
        ) {
            Text(text = icon, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = label,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (enabled) textColor else Slate400
        )
    }
}
