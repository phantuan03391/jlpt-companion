package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.ui.screens.home.components.*
import com.jlpt.n5.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    listState: LazyListState = rememberLazyListState(),
    onNavigateToLessons: () -> Unit,
    onNavigateToLessonDetail: (Int) -> Unit,
    onNavigateToFlashcards: (lessonNum: Int?, kanjiOnly: Boolean) -> Unit,
    onNavigateToMockTests: () -> Unit,
    onNavigateToKanji: () -> Unit,
    onNavigateToListening: (lessonNum: Int?) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    // Automatically refresh stats whenever Home becomes active
    LaunchedEffect(Unit) {
        viewModel.refresh()
    }

    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // App Header, Greeting, Theme Toggle & Streak Badge
        item {
            HomeHeaderSection(streakDays = uiState.streakDays)
        }

        // Overall Readiness Card (Torii Crimson gradient)
        item {
            HomeReadinessCard(
                readinessPercent = uiState.readinessPercent,
                masteredVocab = uiState.masteredVocabCount,
                totalVocab = uiState.totalVocabCount,
                masteredKanji = uiState.masteredKanjiCount,
                totalKanji = uiState.totalKanjiCount,
                completedLessons = uiState.completedLessonsCount,
                totalLessons = uiState.totalLessonsCount
            )
        }

        // Quick Action Grid + Listening Highlight
        item {
            HomeQuickActionsGrid(
                onNavigateToFlashcards = { onNavigateToFlashcards(null, false) },
                onNavigateToKanji = onNavigateToKanji,
                onNavigateToLessons = onNavigateToLessons,
                onNavigateToMockTests = onNavigateToMockTests,
                onNavigateToListening = { onNavigateToListening(null) }
            )
        }

        // Daily Highlight Word Card
        if (uiState.dailyVocab != null) {
            item {
                HomeDailyVocabCard(
                    vocab = uiState.dailyVocab!!,
                    onClick = { onNavigateToLessonDetail(1) }
                )
            }
        }

        // Lesson Roadmap Header
        item {
            HomeRoadmapHeader(onViewAll = onNavigateToLessons)
        }

        // First 5 Lessons Preview
        items(
            items = uiState.roadmapLessons,
            key = { it.lessonNumber }
        ) { lesson ->
            val isCompleted = JLPTRepository.completedLessonNumbers.contains(lesson.lessonNumber)
            LessonRoadmapItem(
                lesson = lesson,
                isCompleted = isCompleted,
                onClick = { onNavigateToLessonDetail(lesson.lessonNumber) }
            )
        }
    }
}
