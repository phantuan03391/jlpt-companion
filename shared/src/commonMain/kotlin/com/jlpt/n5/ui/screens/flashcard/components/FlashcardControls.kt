package com.jlpt.n5.ui.screens.flashcard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Quay lại",
                        tint = MaterialTheme.colors.textPrimary,
                        modifier = Modifier.size(20.dp)
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
            Icon(
                imageVector = Icons.Filled.Shuffle,
                contentDescription = "Trộn thẻ",
                tint = MaterialTheme.colors.toriiAccent,
                modifier = Modifier.size(22.dp)
            )
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
        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(10.dp))
                .background(if (!isKanjiMode) MaterialTheme.colors.surface else Color.Transparent)
                .clickable { onSelectVocab() }
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.MenuBook,
                    contentDescription = null,
                    tint = if (!isKanjiMode) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Từ vựng Minna",
                    fontSize = 13.sp,
                    fontWeight = if (!isKanjiMode) FontWeight.Bold else FontWeight.Medium,
                    color = if (!isKanjiMode) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                )
            }
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(10.dp))
                .background(if (isKanjiMode) MaterialTheme.colors.surface else Color.Transparent)
                .clickable { onSelectKanji() }
                .padding(vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.Translate,
                    contentDescription = null,
                    tint = if (isKanjiMode) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.textSecondary,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Kanji N5",
                    fontSize = 13.sp,
                    fontWeight = if (isKanjiMode) FontWeight.Bold else FontWeight.Medium,
                    color = if (isKanjiMode) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.textSecondary
                )
            }
        }
    }
}

@Composable
fun FlashcardBottomActionBar(
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
            icon = Icons.Filled.ArrowBack,
            label = "Trước",
            bgColor = MaterialTheme.colors.surfaceContainer,
            textColor = MaterialTheme.colors.textPrimary,
            enabled = hasPrev,
            onClick = onPrev
        )

        FlashcardActionButton(
            icon = Icons.Filled.Close,
            label = "Chưa nhớ",
            bgColor = MaterialTheme.colors.toriiBg,
            textColor = MaterialTheme.colors.toriiAccent,
            onClick = onNotRemembered
        )

        FlashcardActionButton(
            icon = if (currentCard.isStarred) Icons.Filled.Star else Icons.Filled.StarBorder,
            label = "Yêu thích",
            bgColor = MaterialTheme.colors.amberBg,
            textColor = OchreAmber,
            onClick = onToggleStar
        )

        FlashcardActionButton(
            icon = Icons.Filled.Check,
            label = "Đã thuộc",
            bgColor = MaterialTheme.colors.matchaBg,
            textColor = MaterialTheme.colors.matchaAccent,
            onClick = onMastered
        )

        FlashcardActionButton(
            icon = Icons.Filled.ArrowForward,
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
    icon: ImageVector,
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
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = if (enabled) textColor else MaterialTheme.colors.textMuted,
                modifier = Modifier.size(22.dp)
            )
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
