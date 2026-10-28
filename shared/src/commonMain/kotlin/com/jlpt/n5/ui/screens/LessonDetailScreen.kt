package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.screens.lesson.components.LessonGrammarTab
import com.jlpt.n5.ui.screens.lesson.components.LessonPracticeTab
import com.jlpt.n5.ui.screens.lesson.components.LessonVocabTab
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.LessonDetailViewModel

@Composable
fun LessonDetailScreen(
    lessonNumber: Int,
    viewModel: LessonDetailViewModel = remember { LessonDetailViewModel() },
    onBack: () -> Unit,
    onOpenFlashcard: (Int) -> Unit
) {
    LaunchedEffect(lessonNumber) {
        viewModel.loadLesson(lessonNumber)
    }

    val state by viewModel.uiState.collectAsState()
    val lesson = state.lesson
    val selectedTab = state.selectedTab
    val isLessonCompleted = state.isCompleted

    if (lesson == null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            Text("Không tìm thấy bài học", color = MaterialTheme.colors.textPrimary)
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        // Top Navigation Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            elevation = 2.dp,
            color = MaterialTheme.colors.surface
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
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

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = "BÀI ${lesson.lessonNumber}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )
                            Text(
                                text = lesson.japaneseTitle,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textPrimary
                            )
                        }
                    }

                    // Complete Lesson Button
                    Button(
                        onClick = { viewModel.toggleLessonCompleted() },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = if (isLessonCompleted) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer
                        ),
                        shape = CircleShape,
                        elevation = ButtonDefaults.elevation(0.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = if (isLessonCompleted) "✓ Đã học xong" else "Đánh dấu đã học",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isLessonCompleted) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.textSecondary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Tab Selection Bar
                TabRow(
                    selectedTabIndex = selectedTab,
                    backgroundColor = MaterialTheme.colors.surface,
                    contentColor = MaterialTheme.colors.toriiAccent
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { viewModel.selectTab(0) },
                        text = {
                            Text(
                                "Từ vựng (${lesson.vocabularies.size})",
                                fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Medium,
                                color = if (selectedTab == 0) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { viewModel.selectTab(1) },
                        text = {
                            Text(
                                "Ngữ pháp (${lesson.grammarPoints.size})",
                                fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Medium,
                                color = if (selectedTab == 1) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    )
                    Tab(
                        selected = selectedTab == 2,
                        onClick = { viewModel.selectTab(2) },
                        text = {
                            Text(
                                "Luyện tập",
                                fontWeight = if (selectedTab == 2) FontWeight.Bold else FontWeight.Medium,
                                color = if (selectedTab == 2) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    )
                }
            }
        }

        // Tab Content Container
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            when (selectedTab) {
                0 -> LessonVocabTab(
                    vocabularies = lesson.vocabularies,
                    onOpenFlashcard = { onOpenFlashcard(lessonNumber) }
                )
                1 -> LessonGrammarTab(grammarPoints = lesson.grammarPoints)
                2 -> LessonPracticeTab(vocabularies = lesson.vocabularies)
            }
        }
    }
}
