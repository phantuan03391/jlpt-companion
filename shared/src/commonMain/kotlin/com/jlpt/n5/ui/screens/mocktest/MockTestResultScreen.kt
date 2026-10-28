package com.jlpt.n5.ui.screens.mocktest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.ui.theme.*

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
                            text = "Đúng $correctCount / $totalQuestions câu (${if (totalQuestions > 0) ((correctCount.toFloat() / totalQuestions) * 100).toInt() else 0}%)",
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
