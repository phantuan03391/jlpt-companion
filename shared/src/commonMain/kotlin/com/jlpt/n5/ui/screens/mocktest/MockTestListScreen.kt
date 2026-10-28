package com.jlpt.n5.ui.screens.mocktest

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
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
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.MockTestViewModel

@Composable
fun MockTestListScreen(
    viewModel: MockTestViewModel = remember { MockTestViewModel() },
    listState: LazyListState = rememberLazyListState(),
    onStartExam: (String) -> Unit
) {
    val tests = viewModel.tests
    val history = viewModel.history

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
            state = listState,
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(bottom = 24.dp)
        ) {
            items(
                items = tests,
                key = { it.id }
            ) { test ->
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
