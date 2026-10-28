package com.jlpt.n5.ui.screens

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.jlpt.n5.viewmodel.MockTestViewModel

@Composable
fun MockTestListScreen(
    viewModel: MockTestViewModel = remember { MockTestViewModel() },
    listState: LazyListState = rememberLazyListState(),
    onStartExam: (String) -> Unit
) = com.jlpt.n5.ui.screens.mocktest.MockTestListScreen(
    viewModel = viewModel,
    listState = listState,
    onStartExam = onStartExam
)

@Composable
fun MockTestExamScreen(
    testId: String,
    viewModel: MockTestViewModel,
    onBack: () -> Unit,
    onFinish: (score: Int, maxScore: Int, passed: Boolean, correctCount: Int, totalQuestions: Int, answers: Map<Int, Int>) -> Unit
) = com.jlpt.n5.ui.screens.mocktest.MockTestExamScreen(
    testId = testId,
    viewModel = viewModel,
    onBack = onBack,
    onFinish = onFinish
)

@Composable
fun MockTestResultScreen(
    testId: String,
    score: Int,
    maxScore: Int,
    passed: Boolean,
    correctCount: Int,
    totalQuestions: Int,
    userAnswers: Map<Int, Int>,
    onBackToList: () -> Unit
) = com.jlpt.n5.ui.screens.mocktest.MockTestResultScreen(
    testId = testId,
    score = score,
    maxScore = maxScore,
    passed = passed,
    correctCount = correctCount,
    totalQuestions = totalQuestions,
    userAnswers = userAnswers,
    onBackToList = onBackToList
)
