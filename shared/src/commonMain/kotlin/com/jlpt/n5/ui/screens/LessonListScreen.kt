package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.screens.lesson.components.FilterChip
import com.jlpt.n5.ui.screens.lesson.components.LessonFullCard
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.LessonListViewModel

@Composable
fun LessonListScreen(
    viewModel: LessonListViewModel,
    listState: LazyListState = rememberLazyListState(),
    onNavigateToDetail: (Int) -> Unit,
    onNavigateToFlashcard: (Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val focusManager = LocalFocusManager.current

    LaunchedEffect(Unit) {
        viewModel.refresh()
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

        // Title Header
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
            value = uiState.searchQuery,
            onValueChange = { viewModel.setSearchQuery(it) },
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
                if (uiState.searchQuery.isNotEmpty()) {
                    IconButton(onClick = {
                        viewModel.setSearchQuery("")
                        focusManager.clearFocus()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "Xóa tìm kiếm",
                            tint = MaterialTheme.colors.textMuted,
                            modifier = Modifier.size(18.dp)
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

        // Filter Tabs (Tất cả, Đã học, Chưa học)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                text = "Tất cả (${uiState.totalLessonsCount})",
                isSelected = uiState.selectedFilter == "ALL",
                onClick = {
                    focusManager.clearFocus()
                    viewModel.setSelectedFilter("ALL")
                }
            )
            FilterChip(
                text = "Đã học (${uiState.completedCount})",
                isSelected = uiState.selectedFilter == "COMPLETED",
                onClick = {
                    focusManager.clearFocus()
                    viewModel.setSelectedFilter("COMPLETED")
                }
            )
            FilterChip(
                text = "Chưa học (${uiState.incompleteCount})",
                isSelected = uiState.selectedFilter == "INCOMPLETE",
                onClick = {
                    focusManager.clearFocus()
                    viewModel.setSelectedFilter("INCOMPLETE")
                }
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Lesson List
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(
                items = uiState.filteredLessons,
                key = { it.lessonNumber }
            ) { lesson ->
                val isCompleted = uiState.completedLessonNumbers.contains(lesson.lessonNumber)
                LessonFullCard(
                    lesson = lesson,
                    isCompleted = isCompleted,
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
