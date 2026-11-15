package com.jlpt.n5.ui.screens.mocktest

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.tts.LocalTTS
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
    val tts = LocalTTS.current
    val questionRowState = rememberLazyListState()
    val contentScrollState = rememberScrollState()

    LaunchedEffect(testId) {
        viewModel.startExam(testId)
    }

    DisposableEffect(Unit) {
        onDispose {
            tts.stop()
        }
    }

    // Stop TTS & scroll question content to top when changing questions
    LaunchedEffect(examState.currentQuestionIndex) {
        tts.stop()
        contentScrollState.scrollTo(0)
        if (examState.currentQuestionIndex >= 0) {
            questionRowState.animateScrollToItem(examState.currentQuestionIndex)
        }
    }

    // Auto submit if time is up
    LaunchedEffect(examState.isTimeUp) {
        if (examState.isTimeUp && examState.test != null) {
            tts.stop()
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

    // Group sections with their starting question index for quick section jumping
    val sectionStartIndices = remember(test.questions) {
        val list = mutableListOf<Pair<String, Int>>()
        var lastSec = ""
        test.questions.forEachIndexed { idx, q ->
            if (q.section != lastSec) {
                lastSec = q.section
                val shortLabel = when {
                    q.section.contains("文字") -> "1. Từ vựng・Kanji"
                    q.section.contains("文法") -> "2. Ngữ pháp・Đọc"
                    q.section.contains("聴解") -> "🎧 3. Nghe hiểu"
                    else -> q.section
                }
                list.add(shortLabel to idx)
            }
        }
        list
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        // Sticky Header with Timer, Section Tabs & Question Number Strip
        Surface(
            modifier = Modifier.fillMaxWidth(),
            elevation = 2.dp,
            color = MaterialTheme.colors.surface
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
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
                                .clickable {
                                    tts.stop()
                                    onBack()
                                },
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

                        Column {
                            Text(
                                text = "Câu ${currentQuestionIndex + 1}/${test.questions.size}",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textPrimary
                            )
                            Text(
                                text = "Đã làm: ${userAnswers.size}/${test.questions.size}",
                                fontSize = 11.sp,
                                color = MaterialTheme.colors.textMuted
                            )
                        }
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

                // Quick Section Jump Tabs (if test has multiple sections)
                if (sectionStartIndices.size > 1) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState())
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        sectionStartIndices.forEachIndexed { secIdx, (label, startIdx) ->
                            val nextStartIdx = sectionStartIndices.getOrNull(secIdx + 1)?.second ?: test.questions.size
                            val isActiveSection = currentQuestionIndex in startIdx until nextStartIdx
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(
                                        if (isActiveSection) MaterialTheme.colors.toriiAccent
                                        else MaterialTheme.colors.surfaceContainer
                                    )
                                    .clickable { viewModel.jumpToQuestion(startIdx) }
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                            ) {
                                Text(
                                    text = label,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isActiveSection) Color.White else MaterialTheme.colors.textSecondary
                                )
                            }
                        }
                    }
                }

                // Scrollable Question Number Pills
                LazyRow(
                    state = questionRowState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    itemsIndexed(test.questions) { idx, q ->
                        val isCurrent = idx == currentQuestionIndex
                        val isAnswered = userAnswers.containsKey(q.id)
                        val isListening = q.audioScript.isNotEmpty()

                        val pillBg = when {
                            isCurrent -> MaterialTheme.colors.toriiAccent
                            isAnswered -> MaterialTheme.colors.matchaBg
                            else -> MaterialTheme.colors.surfaceContainer
                        }
                        val pillText = when {
                            isCurrent -> Color.White
                            isAnswered -> MaterialTheme.colors.matchaAccent
                            else -> MaterialTheme.colors.textSecondary
                        }

                        Box(
                            modifier = Modifier
                                .height(30.dp)
                                .widthIn(min = 34.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(pillBg)
                                .border(
                                    width = if (isCurrent) 0.dp else 1.dp,
                                    color = if (isAnswered) MaterialTheme.colors.matchaAccent.copy(alpha = 0.4f)
                                    else MaterialTheme.colors.outlineBorder,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clickable { viewModel.jumpToQuestion(idx) }
                                .padding(horizontal = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = if (isListening) "🎧${idx + 1}" else "${idx + 1}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = pillText
                            )
                        }
                    }
                }
            }
        }

        if (currentQ != null) {
            // Scrollable Question & Options Content
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .verticalScroll(contentScrollState)
                    .padding(16.dp)
            ) {
                // Section & Category
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    JapaneseBadge(
                        text = currentQ.section,
                        backgroundColor = MaterialTheme.colors.surfaceContainer,
                        textColor = MaterialTheme.colors.toriiAccent
                    )
                    Text(
                        text = currentQ.category,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colors.textMuted
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Listening Audio Player Card (when question has audioScript)
                if (currentQ.audioScript.isNotEmpty()) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(
                                width = 1.5.dp,
                                color = MaterialTheme.colors.toriiAccent.copy(alpha = 0.4f),
                                shape = RoundedCornerShape(16.dp)
                            ),
                        shape = RoundedCornerShape(16.dp),
                        backgroundColor = MaterialTheme.colors.toriiBg,
                        elevation = 0.dp
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Box(
                                        modifier = Modifier
                                            .size(36.dp)
                                            .clip(CircleShape)
                                            .background(MaterialTheme.colors.toriiAccent),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Filled.Headphones,
                                            contentDescription = "Phần thi nghe",
                                            tint = Color.White,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Phần thi Nghe hiểu (聴解 - Choukai)",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = MaterialTheme.colors.toriiAccent
                                        )
                                        Text(
                                            text = "Bấm nút bên dưới để nghe đoạn hội thoại tiếng Nhật",
                                            fontSize = 11.sp,
                                            color = MaterialTheme.colors.textSecondary
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Button(
                                    onClick = { tts.speak(currentQ.audioScript) },
                                    modifier = Modifier.weight(1f),
                                    shape = RoundedCornerShape(10.dp),
                                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.VolumeUp,
                                        contentDescription = "Phát âm thanh",
                                        tint = Color.White,
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = "Phát / Nghe lại bài nghe",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }

                                OutlinedButton(
                                    onClick = { tts.stop() },
                                    shape = RoundedCornerShape(10.dp),
                                    colors = ButtonDefaults.outlinedButtonColors(
                                        backgroundColor = MaterialTheme.colors.cardBackground
                                    )
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.Stop,
                                        contentDescription = "Dừng",
                                        tint = MaterialTheme.colors.textPrimary,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "Dừng",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = MaterialTheme.colors.textPrimary
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                }

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

                Spacer(modifier = Modifier.height(14.dp))

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
            }

            // Bottom Pinned Navigation Bar (Prev / Next / Submit)
            Surface(
                modifier = Modifier.fillMaxWidth(),
                elevation = 4.dp,
                color = MaterialTheme.colors.surface
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
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
                                Text("Câu sau", color = Color.White, fontWeight = FontWeight.Bold)
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
                        tts.stop()
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
