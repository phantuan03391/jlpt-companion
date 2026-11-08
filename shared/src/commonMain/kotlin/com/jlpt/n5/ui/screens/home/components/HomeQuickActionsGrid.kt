package com.jlpt.n5.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Translate
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
    onNavigateToListening: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = "Hành động nhanh",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Featured Listening Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .clickable { onNavigateToListening() },
            shape = RoundedCornerShape(16.dp),
            backgroundColor = MaterialTheme.colors.cardBackground,
            elevation = 2.dp
        ) {
            Row(
                modifier = Modifier.padding(14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.toriiBg),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Headphones,
                        contentDescription = "Luyện nghe",
                        tint = MaterialTheme.colors.toriiAccent,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Luyện Nghe N5",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Surface(
                            shape = CircleShape,
                            color = MaterialTheme.colors.toriiBg
                        ) {
                            Text(
                                text = "MỚI",
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                    Text(
                        text = "Phản xạ âm thanh & trắc nghiệm 25 bài",
                        fontSize = 12.sp,
                        color = MaterialTheme.colors.textMuted
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "Luyện ngay",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = MaterialTheme.colors.toriiAccent
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            QuickActionButton(
                icon = Icons.Filled.Layers,
                title = "Flashcards",
                subtitle = "Lật thẻ từ vựng",
                color = MaterialTheme.colors.toriiAccent,
                bgColor = MaterialTheme.colors.toriiBg,
                modifier = Modifier.weight(1f),
                onClick = onNavigateToFlashcards
            )

            QuickActionButton(
                icon = Icons.Filled.Translate,
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
                icon = Icons.Filled.MenuBook,
                title = "25 Bài Minna",
                subtitle = "Từ vựng & Ngữ pháp",
                color = MaterialTheme.colors.toriiAccent,
                bgColor = MaterialTheme.colors.surfaceContainer,
                modifier = Modifier.weight(1f),
                onClick = onNavigateToLessons
            )

            QuickActionButton(
                icon = Icons.Filled.Assignment,
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
    icon: ImageVector,
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
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = color,
                    modifier = Modifier.size(20.dp)
                )
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
