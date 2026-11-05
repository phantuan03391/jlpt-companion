package com.jlpt.n5.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
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
    onOpenFlashcard: (Int) -> Unit,
    onOpenListening: (Int) -> Unit
) {
    LaunchedEffect(lessonNumber) {
        viewModel.loadLesson(lessonNumber)
    }

    val state by viewModel.uiState.collectAsState()
    val lesson = state.lesson
    val selectedTab = state.selectedTab
    val isLessonCompleted = state.isCompleted

    var isScrolledDown by remember { mutableStateOf(false) }

    val nestedScrollConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                if (available.y < -15f) {
                    isScrolledDown = true
                } else if (available.y > 15f) {
                    isScrolledDown = false
                }
                return Offset.Zero
            }
        }
    }

    val headerVerticalPadding by animateDpAsState(if (isScrolledDown) 4.dp else 10.dp)
    val headerElevation by animateDpAsState(if (isScrolledDown) 4.dp else 1.dp)

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
            .nestedScroll(nestedScrollConnection)
    ) {
        // Collapsible Top Navigation Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            elevation = headerElevation,
            color = MaterialTheme.colors.surface
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = headerVerticalPadding)) {
                // Top title and actions row (morphs between full and compact on scroll)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(if (isScrolledDown) 30.dp else 36.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colors.surfaceContainer)
                                .clickable { onBack() },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "←",
                                fontSize = if (isScrolledDown) 15.sp else 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textPrimary
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        if (isScrolledDown) {
                            // Compact Title on scroll
                            Text(
                                text = "Bài ${lesson.lessonNumber}: ${lesson.japaneseTitle}",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textPrimary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        } else {
                            // Full Title when expanded at top
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
                                    color = MaterialTheme.colors.textPrimary,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Complete Lesson Button (compact icon when scrolled, full pill when expanded)
                    if (isScrolledDown) {
                        Box(
                            modifier = Modifier
                                .size(30.dp)
                                .clip(CircleShape)
                                .background(if (isLessonCompleted) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer)
                                .clickable { viewModel.toggleLessonCompleted() },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = if (isLessonCompleted) "✓" else "○",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isLessonCompleted) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    } else {
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
                }

                Spacer(modifier = Modifier.height(if (isScrolledDown) 4.dp else 8.dp))

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
                                fontSize = if (isScrolledDown) 12.sp else 13.sp,
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
                                fontSize = if (isScrolledDown) 12.sp else 13.sp,
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
                                fontSize = if (isScrolledDown) 12.sp else 13.sp,
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
                    onOpenFlashcard = { onOpenFlashcard(lessonNumber) },
                    onOpenListening = { onOpenListening(lessonNumber) }
                )
                1 -> LessonGrammarTab(grammarPoints = lesson.grammarPoints)
                2 -> LessonPracticeTab(
                    vocabularies = lesson.vocabularies,
                    onOpenListening = { onOpenListening(lessonNumber) }
                )
            }
        }
    }
}
