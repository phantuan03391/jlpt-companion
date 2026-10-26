package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Lesson
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun LessonListScreen(
    onNavigateToDetail: (Int) -> Unit,
    onNavigateToFlashcard: (Int) -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf("ALL") } // ALL, COMPLETED, INCOMPLETE

    val filteredLessons = remember(searchQuery, selectedFilter) {
        JLPTRepository.lessons.filter { lesson ->
            val matchesQuery = searchQuery.isEmpty() ||
                    lesson.title.contains(searchQuery, ignoreCase = true) ||
                    lesson.description.contains(searchQuery, ignoreCase = true) ||
                    lesson.lessonNumber.toString() == searchQuery.trim()

            val isDone = JLPTRepository.completedLessonNumbers.contains(lesson.lessonNumber)
            val matchesFilter = when (selectedFilter) {
                "COMPLETED" -> isDone
                "INCOMPLETE" -> !isDone
                else -> true
            }

            matchesQuery && matchesFilter
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        // Title
        Text(
            text = "Giáo trình Minna no Nihongo",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "25 bài học trọng tâm chuẩn cấu trúc JLPT N5",
            fontSize = 13.sp,
            color = Slate500
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Search Input
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Tìm kiếm bài học, chủ đề...") },
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = MaterialTheme.colors.surface,
                focusedBorderColor = IndigoPrimary,
                unfocusedBorderColor = Slate300
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Filter Tabs
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                text = "Tất cả (25)",
                isSelected = selectedFilter == "ALL",
                onClick = { selectedFilter = "ALL" }
            )
            FilterChip(
                text = "Đã học (${JLPTRepository.completedLessonNumbers.size})",
                isSelected = selectedFilter == "COMPLETED",
                onClick = { selectedFilter = "COMPLETED" }
            )
            FilterChip(
                text = "Chưa học (${25 - JLPTRepository.completedLessonNumbers.size})",
                isSelected = selectedFilter == "INCOMPLETE",
                onClick = { selectedFilter = "INCOMPLETE" }
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Lesson List
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(filteredLessons) { lesson ->
                LessonFullCard(
                    lesson = lesson,
                    onOpenDetail = { onNavigateToDetail(lesson.lessonNumber) },
                    onOpenFlashcards = { onNavigateToFlashcard(lesson.lessonNumber) }
                )
            }
        }
    }
}

@Composable
fun FilterChip(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(if (isSelected) IndigoPrimary else MaterialTheme.colors.surface)
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 6.dp)
    ) {
        Text(
            text = text,
            fontSize = 12.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            color = if (isSelected) SurfaceWhite else Slate600
        )
    }
}

@Composable
fun LessonFullCard(
    lesson: Lesson,
    onOpenDetail: () -> Unit,
    onOpenFlashcards: () -> Unit
) {
    val isCompleted = JLPTRepository.completedLessonNumbers.contains(lesson.lessonNumber)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onOpenDetail() },
        shape = RoundedCornerShape(16.dp),
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(if (isCompleted) MatchaGreenLight else IndigoSubtle),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${lesson.lessonNumber}",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isCompleted) MatchaGreen else IndigoPrimary
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = lesson.japaneseTitle,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = IndigoDark
                    )
                }

                if (isCompleted) {
                    JapaneseBadge(text = "ĐÃ HOÀN THÀNH", backgroundColor = MatchaGreenLight, textColor = MatchaGreen)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = lesson.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.onSurface
            )

            Text(
                text = lesson.description,
                fontSize = 13.sp,
                color = Slate600,
                maxLines = 2
            )

            Spacer(modifier = Modifier.height(12.dp))

            Divider(color = Slate200)

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${lesson.vocabularies.size} từ • ${lesson.grammarPoints.size} ngữ pháp",
                    fontSize = 12.sp,
                    color = Slate500
                )

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    TextButton(
                        onClick = onOpenFlashcards,
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "🗂️ Flashcard",
                            fontSize = 12.sp,
                            color = SakuraPink,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    Button(
                        onClick = onOpenDetail,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = IndigoPrimary),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "Học bài",
                            fontSize = 12.sp,
                            color = SurfaceWhite,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
