package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
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
    val focusManager = LocalFocusManager.current
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
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                focusManager.clearFocus()
            }
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        // Title
        Text(
            text = "Giáo trình Minna no Nihongo",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )
        Text(
            text = "25 bài học trọng tâm chuẩn cấu trúc JLPT N5",
            fontSize = 13.sp,
            color = MaterialTheme.colors.textSecondary
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Search Input with dismiss support
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    "Tìm kiếm bài học, chủ đề ngữ pháp...",
                    color = MaterialTheme.colors.textMuted,
                    fontSize = 13.sp
                )
            },
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = {
                        searchQuery = ""
                        focusManager.clearFocus()
                    }) {
                        Text(
                            text = "✕",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textMuted
                        )
                    }
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { focusManager.clearFocus() }),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = MaterialTheme.colors.surface,
                textColor = MaterialTheme.colors.textPrimary,
                cursorColor = MaterialTheme.colors.primary,
                focusedBorderColor = MaterialTheme.colors.primary,
                unfocusedBorderColor = MaterialTheme.colors.outlineBorder
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Filter Tabs
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                text = "Tất cả (${JLPTRepository.lessons.size})",
                isSelected = selectedFilter == "ALL",
                onClick = {
                    focusManager.clearFocus()
                    selectedFilter = "ALL"
                }
            )
            FilterChip(
                text = "Đã học (${JLPTRepository.completedLessonNumbers.size})",
                isSelected = selectedFilter == "COMPLETED",
                onClick = {
                    focusManager.clearFocus()
                    selectedFilter = "COMPLETED"
                }
            )
            FilterChip(
                text = "Chưa học (${JLPTRepository.lessons.size - JLPTRepository.completedLessonNumbers.size})",
                isSelected = selectedFilter == "INCOMPLETE",
                onClick = {
                    focusManager.clearFocus()
                    selectedFilter = "INCOMPLETE"
                }
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
                    onOpenDetail = {
                        focusManager.clearFocus()
                        onNavigateToDetail(lesson.lessonNumber)
                    },
                    onOpenFlashcards = {
                        focusManager.clearFocus()
                        onNavigateToFlashcard(lesson.lessonNumber)
                    }
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
            .background(if (isSelected) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.surfaceContainer)
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 6.dp)
    ) {
        Text(
            text = text,
            fontSize = 12.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            color = if (isSelected) Color.White else MaterialTheme.colors.textSecondary
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
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 1.dp
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
                            .background(if (isCompleted) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${lesson.lessonNumber}",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isCompleted) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = lesson.japaneseTitle,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent
                    )
                }

                if (isCompleted) {
                    JapaneseBadge(
                        text = "ĐÃ HOÀN THÀNH",
                        backgroundColor = MaterialTheme.colors.matchaBg,
                        textColor = MaterialTheme.colors.matchaAccent
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = lesson.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.textPrimary
            )

            Text(
                text = lesson.description,
                fontSize = 13.sp,
                color = MaterialTheme.colors.textSecondary,
                maxLines = 2
            )

            Spacer(modifier = Modifier.height(12.dp))

            Divider(color = MaterialTheme.colors.outlineBorder)

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${lesson.vocabularies.size} từ • ${lesson.grammarPoints.size} ngữ pháp",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted
                )

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    TextButton(
                        onClick = onOpenFlashcards,
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "🗂️ Flashcard",
                            fontSize = 12.sp,
                            color = MaterialTheme.colors.toriiAccent,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    Button(
                        onClick = onOpenDetail,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "Học bài",
                            fontSize = 12.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
