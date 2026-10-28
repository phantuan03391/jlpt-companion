package com.jlpt.n5.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.Lesson
import com.jlpt.n5.ui.theme.*

@Composable
fun HomeRoadmapHeader(
    onViewAll: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Lộ trình Minna no Nihongo (Bài 1 - 25)",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )

        Text(
            text = "Xem tất cả",
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colors.toriiAccent,
            modifier = Modifier.clickable { onViewAll() }
        )
    }
}

@Composable
fun LessonRoadmapItem(
    lesson: Lesson,
    isCompleted: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 1.dp
    ) {
        Row(
            modifier = Modifier
                .padding(14.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(if (isCompleted) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${lesson.lessonNumber}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isCompleted) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lesson.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.textPrimary
                )
                Text(
                    text = "${lesson.vocabularies.size} từ vựng • ${lesson.grammarPoints.size} ngữ pháp",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted
                )
            }

            if (isCompleted) {
                Text(text = "✅", fontSize = 14.sp)
            } else {
                Text(
                    text = "Học →",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.toriiAccent
                )
            }
        }
    }
}
