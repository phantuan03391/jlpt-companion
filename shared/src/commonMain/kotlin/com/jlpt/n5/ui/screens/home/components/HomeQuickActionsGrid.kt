package com.jlpt.n5.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
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
import com.jlpt.n5.ui.theme.*

@Composable
fun HomeQuickActionsGrid(
    onNavigateToFlashcards: () -> Unit,
    onNavigateToKanji: () -> Unit,
    onNavigateToLessons: () -> Unit,
    onNavigateToMockTests: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = "Hành động nhanh",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            QuickActionButton(
                icon = "🗂️",
                title = "Flashcards",
                subtitle = "Lật thẻ từ vựng",
                color = MaterialTheme.colors.toriiAccent,
                bgColor = MaterialTheme.colors.toriiBg,
                modifier = Modifier.weight(1f),
                onClick = onNavigateToFlashcards
            )

            QuickActionButton(
                icon = "🈲",
                title = "Kanji N5",
                subtitle = "104 Chữ Hán",
                color = MaterialTheme.colors.matchaAccent,
                bgColor = MaterialTheme.colors.matchaBg,
                modifier = Modifier.weight(1f),
                onClick = onNavigateToKanji
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            QuickActionButton(
                icon = "📖",
                title = "25 Bài Minna",
                subtitle = "Từ vựng & Ngữ pháp",
                color = MaterialTheme.colors.toriiAccent,
                bgColor = MaterialTheme.colors.surfaceContainer,
                modifier = Modifier.weight(1f),
                onClick = onNavigateToLessons
            )

            QuickActionButton(
                icon = "📝",
                title = "Thi thử N5",
                subtitle = "Bấm giờ tính điểm",
                color = OchreAmber,
                bgColor = MaterialTheme.colors.amberBg,
                modifier = Modifier.weight(1f),
                onClick = onNavigateToMockTests
            )
        }
    }
}

@Composable
fun QuickActionButton(
    icon: String,
    title: String,
    subtitle: String,
    color: Color,
    bgColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier.clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 1.dp
    ) {
        Column(
            modifier = Modifier
                .background(bgColor)
                .padding(14.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.85f)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = icon, fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )

            Text(
                text = subtitle,
                fontSize = 11.sp,
                color = MaterialTheme.colors.textSecondary
            )
        }
    }
}
