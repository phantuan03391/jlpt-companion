package com.jlpt.n5.ui.screens.mocktest

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.MockTestViewModel

@Composable
fun MockTestListScreen(
    viewModel: MockTestViewModel = remember { MockTestViewModel() },
    listState: LazyListState = rememberLazyListState(),
    onStartExam: (String) -> Unit
) {
    val allTests = viewModel.tests
    val history = viewModel.history
    var selectedFilter by remember { mutableStateOf(0) } // 0: All, 1: Full 3-skill, 2: Listening only

    val fullTestsCount = remember(allTests) { allTests.count { !it.id.startsWith("test_listening") } }
    val listeningTestsCount = remember(allTests) { allTests.count { it.id.startsWith("test_listening") } }

    val filteredTests = remember(allTests, selectedFilter) {
        when (selectedFilter) {
            1 -> allTests.filter { !it.id.startsWith("test_listening") }
            2 -> allTests.filter { it.id.startsWith("test_listening") }
            else -> allTests
        }
    }

    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Header Title & Subtitle
        item {
            Column {
                Text(
                    text = "Luyện thi thử JLPT N5",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textPrimary
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Bộ đề thi đầy đủ 3 kỹ năng (Từ vựng • Ngữ pháp - Đọc hiểu • 🎧 Nghe hiểu Choukai)",
                    fontSize = 13.sp,
                    color = MaterialTheme.colors.textSecondary
                )
            }
        }

        // Filter Chips (Full-width 3-column Row without horizontalScroll conflict)
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                val filters = listOf(
                    "Tất cả (${allTests.size})",
                    "Đề 3 kỹ năng ($fullTestsCount)",
                    "🎧 Chuyên Nghe ($listeningTestsCount)"
                )
                filters.forEachIndexed { index, label ->
                    val isSelected = selectedFilter == index
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(14.dp))
                            .background(
                                if (isSelected) MaterialTheme.colors.toriiAccent
                                else MaterialTheme.colors.surfaceContainer
                            )
                            .clickable { selectedFilter = index }
                            .padding(horizontal = 6.dp, vertical = 9.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = label,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isSelected) Color.White else MaterialTheme.colors.textSecondary,
                            textAlign = TextAlign.Center,
                            maxLines = 1
                        )
                    }
                }
            }
        }

        // History Summary if any
        if (history.isNotEmpty()) {
            item {
                Text(
                    text = "Lịch sử thi gần nhất",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textPrimary
                )
            }

            items(
                items = history.take(2),
                key = { "history_${it.timestamp}_${it.testId}" }
            ) { res ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
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
                        Column(modifier = Modifier.weight(1f)) {
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

                        Spacer(modifier = Modifier.width(8.dp))

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
        }

        // Exam List Section Header
        item {
            Text(
                text = "Danh sách đề thi (${filteredTests.size})",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.textPrimary
            )
        }

        // Mock Test Cards
        items(
            items = filteredTests,
            key = { it.id }
        ) { test ->
            val vocabCount = test.questions.count { it.section.contains("文字") }
            val grammarCount = test.questions.count { it.section.contains("文法") }
            val listeningCount = test.questions.count { it.audioScript.isNotEmpty() || it.section.contains("聴解") }
            val isListeningOnly = test.id.startsWith("test_listening")

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = if (isListeningOnly) 1.5.dp else 0.dp,
                        color = if (isListeningOnly) MaterialTheme.colors.toriiAccent.copy(alpha = 0.35f) else Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    ),
                shape = RoundedCornerShape(16.dp),
                backgroundColor = MaterialTheme.colors.cardBackground,
                elevation = 1.dp
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            text = test.title,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.toriiAccent,
                            modifier = Modifier.weight(1f)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

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
                        color = MaterialTheme.colors.textSecondary,
                        lineHeight = 18.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Section Breakdown Pills (no horizontalScroll so vertical swipe is never blocked)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (vocabCount > 0) {
                            JapaneseBadge(
                                text = "Từ vựng: $vocabCount",
                                backgroundColor = MaterialTheme.colors.surfaceContainer,
                                textColor = MaterialTheme.colors.textSecondary
                            )
                        }
                        if (grammarCount > 0) {
                            JapaneseBadge(
                                text = "Đọc・NP: $grammarCount",
                                backgroundColor = MaterialTheme.colors.surfaceContainer,
                                textColor = MaterialTheme.colors.textSecondary
                            )
                        }
                        if (listeningCount > 0) {
                            JapaneseBadge(
                                text = "🎧 Nghe: $listeningCount câu",
                                backgroundColor = MaterialTheme.colors.toriiBg,
                                textColor = MaterialTheme.colors.toriiAccent
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Tổng: ${test.questions.size} câu • Điểm đỗ: ${test.passScore}/180",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colors.textMuted
                        )

                        Button(
                            onClick = { onStartExam(test.id) },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent),
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 6.dp)
                        ) {
                            if (isListeningOnly) {
                                Icon(
                                    imageVector = Icons.Filled.Headphones,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(15.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                            }
                            Text(
                                text = if (isListeningOnly) "Thi Nghe" else "Bắt đầu thi",
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
