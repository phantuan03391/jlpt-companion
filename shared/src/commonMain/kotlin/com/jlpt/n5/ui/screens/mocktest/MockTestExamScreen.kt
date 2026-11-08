package com.jlpt.n5.ui.screens.mocktest

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Timer
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.MockTestViewModel

@Composable
fun MockTestExamScreen(
    testId: String,
    viewModel: MockTestViewModel,
    onBack: () -> Unit,
    onFinish: (score: Int, maxScore: Int, passed: Boolean, correctCount: Int, totalQuestions: Int, answers: Map<Int, Int>) -> Unit
) {
    val examState by viewModel.examState.collectAsState()
    var showSubmitConfirm by remember { mutableStateOf(false) }

    LaunchedEffect(testId) {
        viewModel.startExam(testId)
    }

    // Auto submit if time is up
    LaunchedEffect(examState.isTimeUp) {
        if (examState.isTimeUp && examState.test != null) {
            val result = viewModel.submitExam()
            onFinish(
                result.score,
                result.maxScore,
                result.passed,
                result.correctCount,
                result.totalQuestions,
                examState.userAnswers
            )
        }
    }

    val test = examState.test
    if (test == null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            Text("Đang tải đề thi...", color = MaterialTheme.colors.textPrimary)
        }
        return
    }

    val currentQuestionIndex = examState.currentQuestionIndex
    val userAnswers = examState.userAnswers
    val currentQ = test.questions.getOrNull(currentQuestionIndex)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        // Sticky Header with Timer & Submit Button
        Surface(
            modifier = Modifier.fillMaxWidth(),
            elevation = 2.dp,
            color = MaterialTheme.colors.surface
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colors.surfaceContainer)
                            .clickable { onBack() },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "Thoát",
                            tint = MaterialTheme.colors.textPrimary,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "Câu ${currentQuestionIndex + 1}/${test.questions.size}",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.textPrimary
                    )
                }

                // Timer badge
                val secondsLeft = examState.remainingSeconds
                val minutes = secondsLeft / 60
                val seconds = secondsLeft % 60
                val timeFormatted = "${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}"
                val isUrgent = secondsLeft < 300

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(14.dp))
                        .background(if (isUrgent) MaterialTheme.colors.toriiBg else MaterialTheme.colors.surfaceContainer)
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.Timer,
                            contentDescription = null,
                            tint = if (isUrgent) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textPrimary,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = timeFormatted,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isUrgent) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textPrimary
                        )
                    }
                }

                Button(
                    onClick = { showSubmitConfirm = true },
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.matchaAccent),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text(text = "Nộp bài", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color.White)
                }
            }
        }

        if (currentQ != null) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Section & Category
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    JapaneseBadge(
                        text = currentQ.section,
                        backgroundColor = MaterialTheme.colors.surfaceContainer,
                        textColor = MaterialTheme.colors.toriiAccent
                    )
                    Text(
                        text = currentQ.category,
                        fontSize = 12.sp,
                        color = MaterialTheme.colors.textMuted
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Question Box
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    backgroundColor = MaterialTheme.colors.cardBackground,
                    elevation = 1.dp
                ) {
                    Text(
                        text = currentQ.question,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.textPrimary,
                        modifier = Modifier.padding(16.dp),
                        lineHeight = 24.sp
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Options
                currentQ.options.forEachIndexed { optIndex, optionText ->
                    val isSelected = userAnswers[currentQ.id] == optIndex

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .border(
                                width = if (isSelected) 2.dp else 1.dp,
                                color = if (isSelected) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.outlineBorder,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .clickable { viewModel.selectAnswer(currentQ.id, optIndex) },
                        backgroundColor = if (isSelected) MaterialTheme.colors.toriiBg else MaterialTheme.colors.cardBackground,
                        elevation = 0.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(if (isSelected) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.surfaceContainer),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "${('1' + optIndex)}",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSelected) Color.White else MaterialTheme.colors.textSecondary
                                )
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            Text(
                                text = optionText,
                                fontSize = 15.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                color = MaterialTheme.colors.textPrimary
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                // Navigation Prev / Next / Submit
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OutlinedButton(
                        onClick = { viewModel.prevQuestion() },
                        enabled = currentQuestionIndex > 0,
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = MaterialTheme.colors.cardBackground
                        )
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = null,
                                tint = if (currentQuestionIndex > 0) MaterialTheme.colors.textPrimary else MaterialTheme.colors.textMuted,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                "Câu trước",
                                color = if (currentQuestionIndex > 0) MaterialTheme.colors.textPrimary else MaterialTheme.colors.textMuted
                            )
                        }
                    }

                    if (currentQuestionIndex < test.questions.size - 1) {
                        Button(
                            onClick = { viewModel.nextQuestion() },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Câu sau", color = Color.White)
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    imageVector = Icons.Filled.ArrowForward,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    } else {
                        Button(
                            onClick = { showSubmitConfirm = true },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.matchaAccent)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Nộp bài thi", color = Color.White, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    if (showSubmitConfirm) {
        AlertDialog(
            onDismissRequest = { showSubmitConfirm = false },
            backgroundColor = MaterialTheme.colors.cardBackground,
            title = { Text("Nộp bài thi?", color = MaterialTheme.colors.textPrimary, fontWeight = FontWeight.Bold) },
            text = {
                val answeredCount = userAnswers.size
                Text(
                    "Bạn đã làm $answeredCount / ${test.questions.size} câu. Bạn có chắc chắn muốn nộp bài ngay bây giờ?",
                    color = MaterialTheme.colors.textSecondary
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        showSubmitConfirm = false
                        val result = viewModel.submitExam()
                        onFinish(
                            result.score,
                            result.maxScore,
                            result.passed,
                            result.correctCount,
                            result.totalQuestions,
                            userAnswers
                        )
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                ) {
                    Text("Nộp bài", color = Color.White)
                }
            },
            dismissButton = {
                TextButton(onClick = { showSubmitConfirm = false }) {
                    Text("Làm tiếp", color = MaterialTheme.colors.textSecondary)
                }
            }
        )
    }
}
