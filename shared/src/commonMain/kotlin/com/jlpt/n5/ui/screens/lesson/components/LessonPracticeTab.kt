package com.jlpt.n5.ui.screens.lesson.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import com.jlpt.n5.model.Vocabulary
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun LessonPracticeTab(
    vocabularies: List<Vocabulary>
) {
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableStateOf(0) }
    var isSubmitted by remember { mutableStateOf(false) }

    val sampleVocab = vocabularies.firstOrNull()
    if (sampleVocab == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Không có dữ liệu luyện tập", color = MaterialTheme.colors.textSecondary)
        }
        return
    }

    val questionText = "Từ 「${sampleVocab.word}」 (${sampleVocab.reading}) có nghĩa là gì?"
    val options = remember(sampleVocab.id) {
        listOf(
            sampleVocab.meaning,
            "Giáo viên / Thầy cô",
            "Trường học",
            "Bệnh viện"
        ).shuffled(kotlin.random.Random(sampleVocab.id))
    }

    val correctIndex = options.indexOf(sampleVocab.meaning)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            backgroundColor = MaterialTheme.colors.cardBackground,
            elevation = 2.dp
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                JapaneseBadge(text = "CÂU HỎI LUYỆN TẬP NHANH")

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = questionText,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textPrimary
                )

                Spacer(modifier = Modifier.height(16.dp))

                options.forEachIndexed { index, opt ->
                    val isChosen = selectedOption == index
                    val isCorrect = index == correctIndex

                    val bgColor = when {
                        !isSubmitted -> if (isChosen) MaterialTheme.colors.toriiBg else MaterialTheme.colors.surfaceContainer
                        isCorrect -> MaterialTheme.colors.matchaBg
                        isChosen -> MaterialTheme.colors.toriiBg
                        else -> MaterialTheme.colors.surfaceContainer
                    }

                    val borderColor = when {
                        !isSubmitted -> if (isChosen) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.outlineBorder
                        isCorrect -> MaterialTheme.colors.matchaAccent
                        isChosen -> MaterialTheme.colors.toriiAccent
                        else -> MaterialTheme.colors.outlineBorder
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(bgColor)
                            .border(1.dp, borderColor, RoundedCornerShape(10.dp))
                            .clickable(enabled = !isSubmitted) { selectedOption = index }
                            .padding(12.dp)
                    ) {
                        Text(
                            text = "${('A' + index)}. $opt",
                            fontSize = 14.sp,
                            fontWeight = if (isChosen) FontWeight.Bold else FontWeight.Normal,
                            color = MaterialTheme.colors.textPrimary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                if (!isSubmitted) {
                    Button(
                        onClick = {
                            if (selectedOption != null) {
                                isSubmitted = true
                                if (selectedOption == correctIndex) score++
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent),
                        enabled = selectedOption != null
                    ) {
                        Text("Kiểm tra đáp án", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                if (selectedOption == correctIndex) MaterialTheme.colors.matchaBg else MaterialTheme.colors.toriiBg,
                                RoundedCornerShape(8.dp)
                            )
                            .padding(12.dp)
                    ) {
                        Text(
                            text = if (selectedOption == correctIndex) "🎉 Chính xác!" else "❌ Chưa đúng! Đáp án đúng: ${sampleVocab.meaning}",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (selectedOption == correctIndex) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                        )
                    }
                }
            }
        }
    }
}
