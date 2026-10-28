package com.jlpt.n5.ui.screens.flashcard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.FlashcardItem
import com.jlpt.n5.ui.theme.*

@Composable
fun FlashcardHeaderSection(
    isKanjiMode: Boolean,
    onBack: (() -> Unit)?,
    onShuffle: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
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

        IconButton(onClick = onShuffle) {
            Text(text = "🔀", fontSize = 18.sp)
        }
    }
}

@Composable
fun FlashcardModeSelector(
    isKanjiMode: Boolean,
    onSelectVocab: () -> Unit,
    onSelectKanji: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
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
            onClick = onSelectVocab
        )

        ModeSelectButton(
            text = "🈲 104 Kanji N5",
            isSelected = isKanjiMode,
            modifier = Modifier.weight(1f),
            onClick = onSelectKanji
        )
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
fun FlashcardActionRow(
    currentCard: FlashcardItem,
    hasPrev: Boolean,
    hasNext: Boolean,
    onPrev: () -> Unit,
    onNext: () -> Unit,
    onNotRemembered: () -> Unit,
    onToggleStar: () -> Unit,
    onMastered: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FlashcardActionButton(
            icon = "⬅️",
            label = "Trước",
            bgColor = MaterialTheme.colors.surfaceContainer,
            textColor = MaterialTheme.colors.textPrimary,
            enabled = hasPrev,
            onClick = onPrev
        )

        FlashcardActionButton(
            icon = "❌",
            label = "Chưa nhớ",
            bgColor = MaterialTheme.colors.toriiBg,
            textColor = MaterialTheme.colors.toriiAccent,
            onClick = onNotRemembered
        )

        FlashcardActionButton(
            icon = if (currentCard.isStarred) "⭐" else "☆",
            label = "Yêu thích",
            bgColor = MaterialTheme.colors.amberBg,
            textColor = OchreAmber,
            onClick = onToggleStar
        )

        FlashcardActionButton(
            icon = "✅",
            label = "Đã thuộc",
            bgColor = MaterialTheme.colors.matchaBg,
            textColor = MaterialTheme.colors.matchaAccent,
            onClick = onMastered
        )

        FlashcardActionButton(
            icon = "➡️",
            label = "Tiếp",
            bgColor = MaterialTheme.colors.surfaceContainer,
            textColor = MaterialTheme.colors.textPrimary,
            enabled = hasNext,
            onClick = onNext
        )
    }
}

@Composable
fun FlashcardActionButton(
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
