package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.ExamResult
import com.jlpt.n5.model.MockTest
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*
import kotlinx.coroutines.delay

@Composable
fun MockTestListScreen(
    onStartExam: (String) -> Unit
) {
    val tests = JLPTRepository.mockTests
    val history = JLPTRepository.examHistory

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(16.dp)
    ) {
        Text(
            text = "Luyện thi thử JLPT N5",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )
        Text(
            text = "Bộ đề thi chuẩn cấu trúc đề thi chính thức N5 (45 phút, 180 điểm)",
            fontSize = 13.sp,
            color = MaterialTheme.colors.textSecondary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // History Summary if any
        if (history.isNotEmpty()) {
            Text(
                text = "Lịch sử thi gần nhất",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.textPrimary
            )
            Spacer(modifier = Modifier.height(8.dp))

            history.take(2).forEach { res ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    backgroundColor = MaterialTheme.colors.cardBackground,
                    elevation = 1.dp
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = res.testTitle,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colors.textPrimary
                            )
                            Text(
                                text = "Đúng: ${res.correctCount}/${res.totalQuestions} câu",
                                fontSize = 11.sp,
                                color = MaterialTheme.colors.textMuted
                            )
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(if (res.passed) MaterialTheme.colors.matchaBg else MaterialTheme.colors.toriiBg)
                                .padding(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = "${res.score}/180 (${if (res.passed) "ĐỖ" else "TRƯỢT"})",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (res.passed) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
        }

        Text(
            text = "Danh sách đề thi",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(bottom = 24.dp)
        ) {
            items(tests) { test ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
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
                            Text(
                                text = test.title,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )

                            JapaneseBadge(
                                text = "${test.durationMinutes} PHÚT",
                                backgroundColor = MaterialTheme.colors.amberBg,
                                textColor = OchreAmber
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = test.description,
                            fontSize = 13.sp,
                            color = MaterialTheme.colors.textSecondary
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "${test.questions.size} câu hỏi • Điểm đỗ: ${test.passScore}/180",
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.textMuted
                            )

                            Button(
                                onClick = { onStartExam(test.id) },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent),
                                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 6.dp)
                            ) {
                                Text(
                                    text = "Bắt đầu thi",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MockTestExamScreen(
    testId: String,
    onBack: () -> Unit,
    onFinish: (score: Int, maxScore: Int, passed: Boolean, correctCount: Int, totalQuestions: Int, answers: Map<Int, Int>) -> Unit
) {
    val test = remember(testId) { JLPTRepository.getMockTest(testId) }

    if (test == null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            Text("Không tìm thấy đề thi!", color = MaterialTheme.colors.textPrimary)
        }
        return
    }

    val totalSeconds = remember { test.durationMinutes * 60 }
    var secondsLeft by remember { mutableStateOf(totalSeconds) }
    var currentQuestionIndex by remember { mutableStateOf(0) }
    val userAnswers = remember { mutableStateMapOf<Int, Int>() } // questionId -> selectedIndex
    var showSubmitConfirm by remember { mutableStateOf(false) }

    // Countdown Timer Coroutine
    LaunchedEffect(Unit) {
        while (secondsLeft > 0) {
            delay(1000L)
            secondsLeft--
        }
        // Auto submit when time is up
        var correct = 0
        test.questions.forEach { q ->
            if (userAnswers[q.id] == q.correctIndex) correct++
        }
        val calculatedScore = if (test.questions.isNotEmpty()) {
            (correct.toFloat() / test.questions.size * 180).toInt()
        } else 0
        onFinish(calculatedScore, 180, calculatedScore >= test.passScore, correct, test.questions.size, userAnswers.toMap())
    }

    val currentQ = test.questions.getOrNull(currentQuestionIndex)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        // Sticky Header with Timer & Submit
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
                        Text(
                            text = "✕",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
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
                    Text(
                        text = "⏱️ $timeFormatted",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isUrgent) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textPrimary
                    )
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
                            .clickable { userAnswers[currentQ.id] = optIndex },
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

                // Question Navigation Arrows
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OutlinedButton(
                        onClick = { if (currentQuestionIndex > 0) currentQuestionIndex-- },
                        enabled = currentQuestionIndex > 0,
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = MaterialTheme.colors.cardBackground
                        )
                    ) {
                        Text(
                            "← Câu trước",
                            color = if (currentQuestionIndex > 0) MaterialTheme.colors.textPrimary else MaterialTheme.colors.textMuted
                        )
                    }

                    if (currentQuestionIndex < test.questions.size - 1) {
                        Button(
                            onClick = { currentQuestionIndex++ },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                        ) {
                            Text("Câu sau →", color = Color.White)
                        }
                    } else {
                        Button(
                            onClick = { showSubmitConfirm = true },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.matchaAccent)
                        ) {
                            Text("Nộp bài thi ✓", color = Color.White, fontWeight = FontWeight.Bold)
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
                        var correct = 0
                        test.questions.forEach { q ->
                            if (userAnswers[q.id] == q.correctIndex) correct++
                        }
                        val calculatedScore = if (test.questions.isNotEmpty()) {
                            (correct.toFloat() / test.questions.size * 180).toInt()
                        } else 0
                        onFinish(calculatedScore, 180, calculatedScore >= test.passScore, correct, test.questions.size, userAnswers.toMap())
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
) {
    val test = remember(testId) { JLPTRepository.getMockTest(testId) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(16.dp),
        contentPadding = PaddingValues(bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Result Summary Header Card
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = 3.dp
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            if (passed) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                        )
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = if (passed) "🎉 合格 (ĐỖ N5)" else "💪 CẦN CỐ GẮNG THÊM",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Black,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "$score / $maxScore Điểm",
                            fontSize = 36.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Đúng $correctCount / $totalQuestions câu (${((correctCount.toFloat() / totalQuestions) * 100).toInt()}%)",
                            fontSize = 14.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                    }
                }
            }
        }

        // Action Return Button
        item {
            Button(
                onClick = onBackToList,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
            ) {
                Text("Quay lại danh sách đề thi", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }

        item {
            Text(
                text = "Xem lại chi tiết từng câu & Giải thích",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.textPrimary
            )
        }

        // Detailed review of every question
        if (test != null) {
            items(test.questions) { q ->
                val chosenIndex = userAnswers[q.id]
                val isCorrect = chosenIndex == q.correctIndex

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    backgroundColor = MaterialTheme.colors.cardBackground,
                    elevation = 1.dp
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Câu ${q.id}: ${q.category}",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(if (isCorrect) MaterialTheme.colors.matchaBg else MaterialTheme.colors.toriiBg)
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = if (isCorrect) "ĐÚNG" else "SAI",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isCorrect) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = q.question,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colors.textPrimary
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        q.options.forEachIndexed { idx, optText ->
                            val isUserPick = chosenIndex == idx
                            val isCorrectAnswer = idx == q.correctIndex

                            val optBg = when {
                                isCorrectAnswer -> MaterialTheme.colors.matchaBg
                                isUserPick -> MaterialTheme.colors.toriiBg
                                else -> Color.Transparent
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 2.dp)
                                    .background(optBg, RoundedCornerShape(6.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    text = "${('1' + idx)}. $optText ${if (isCorrectAnswer) "✓" else if (isUserPick) "✗" else ""}",
                                    fontSize = 13.sp,
                                    fontWeight = if (isCorrectAnswer || isUserPick) FontWeight.Bold else FontWeight.Normal,
                                    color = if (isCorrectAnswer) MaterialTheme.colors.matchaAccent else if (isUserPick) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        // Explanation box
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(MaterialTheme.colors.surfaceContainer, RoundedCornerShape(8.dp))
                                .padding(10.dp)
                        ) {
                            Column {
                                Text(
                                    text = "💡 Giải thích chi tiết:",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colors.toriiAccent
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = q.explanation,
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colors.textPrimary,
                                    lineHeight = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
