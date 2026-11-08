package com.jlpt.n5.ui.screens.lesson.components

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Celebration
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Vocabulary
import com.jlpt.n5.tts.LocalTTS
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*
import kotlin.random.Random

@Composable
fun LessonPracticeTab(
    vocabularies: List<Vocabulary>,
    onOpenListening: () -> Unit
) {
    val tts = LocalTTS.current
    var roundSeed by remember { mutableStateOf(0) }

    val practiceVocabs = remember(vocabularies, roundSeed) {
        vocabularies.shuffled(Random(roundSeed + vocabularies.size)).take(5)
    }

    var currentQuestionIdx by remember(roundSeed) { mutableStateOf(0) }
    var selectedOption by remember(currentQuestionIdx, roundSeed) { mutableStateOf<Int?>(null) }
    var isSubmitted by remember(currentQuestionIdx, roundSeed) { mutableStateOf(false) }
    var score by remember(roundSeed) { mutableStateOf(0) }
    var isQuizCompleted by remember(roundSeed) { mutableStateOf(false) }

    if (practiceVocabs.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Không có dữ liệu luyện tập cho bài học này", color = MaterialTheme.colors.textSecondary)
        }
        return
    }

    val currentVocab = practiceVocabs.getOrNull(currentQuestionIdx) ?: practiceVocabs.first()

    val options = remember(currentVocab.id, roundSeed) {
        val distractors = vocabularies
            .filter { it.id != currentVocab.id && it.meaning != currentVocab.meaning }
            .map { it.meaning }
            .distinct()
            .shuffled(Random(currentVocab.id + roundSeed))
            .take(3)

        (distractors + currentVocab.meaning).shuffled(Random(currentVocab.id * 7 + roundSeed))
    }

    val correctIndex = options.indexOf(currentVocab.meaning)
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(vertical = 14.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Listening Practice highlight banner
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(14.dp))
                .clickable { onOpenListening() },
            shape = RoundedCornerShape(14.dp),
            backgroundColor = MaterialTheme.colors.matchaBg,
            elevation = 0.dp
        ) {
            Row(
                modifier = Modifier.padding(14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.matchaAccent.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Headphones,
                        contentDescription = null,
                        tint = MaterialTheme.colors.matchaAccent,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Phòng Luyện Nghe Bài Này",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.matchaAccent
                    )
                    Text(
                        text = "Nghe phản xạ âm thanh & hội thoại",
                        fontSize = 11.sp,
                        color = MaterialTheme.colors.textSecondary
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "Vào nghe",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.matchaAccent
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = MaterialTheme.colors.matchaAccent
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        if (isQuizCompleted) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                backgroundColor = MaterialTheme.colors.cardBackground,
                elevation = 2.dp
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.Celebration,
                            contentDescription = null,
                            tint = MaterialTheme.colors.matchaAccent,
                            modifier = Modifier.size(22.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Hoàn thành lượt luyện tập!",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.matchaAccent
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Bạn đạt được $score / ${practiceVocabs.size} câu đúng",
                        fontSize = 14.sp,
                        color = MaterialTheme.colors.textPrimary
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            roundSeed++
                            isQuizCompleted = false
                            currentQuestionIdx = 0
                            score = 0
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Refresh,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(16.dp)
                            )
                            Text("Luyện tập lượt mới", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        } else {
            // Quick practice card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                backgroundColor = MaterialTheme.colors.cardBackground,
                elevation = 2.dp
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        JapaneseBadge(text = "CÂU ${currentQuestionIdx + 1} / ${practiceVocabs.size}")
                        Text(
                            text = "Điểm: $score",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.toriiAccent
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = currentVocab.word,
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colors.toriiAccent
                                )
                                if (currentVocab.hanViet.isNotEmpty()) {
                                    Spacer(modifier = Modifier.width(6.dp))
                                    HanVietBadge(hanViet = currentVocab.hanViet)
                                }
                            }
                            Text(
                                text = "Cách đọc: ${currentVocab.reading}",
                                fontSize = 13.sp,
                                color = MaterialTheme.colors.textMuted
                            )
                        }

                        IconButton(
                            onClick = {
                                val s = if (currentVocab.word.isNotEmpty()) currentVocab.word else currentVocab.reading
                                tts.speak(s)
                            },
                            modifier = Modifier
                                .size(38.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colors.toriiBg)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.VolumeUp,
                                contentDescription = "Phát âm",
                                tint = MaterialTheme.colors.toriiAccent,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Chọn nghĩa tiếng Việt chính xác:",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colors.textSecondary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

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
                                    if (selectedOption == correctIndex) {
                                        score++
                                        JLPTRepository.recordStudyActivity()
                                    }
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
                        Button(
                            onClick = {
                                if (currentQuestionIdx + 1 < practiceVocabs.size) {
                                    currentQuestionIdx++
                                    selectedOption = null
                                    isSubmitted = false
                                } else {
                                    isQuizCompleted = true
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Text(
                                    text = if (currentQuestionIdx + 1 < practiceVocabs.size) "Câu tiếp theo" else "Xem kết quả",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold
                                )
                                if (currentQuestionIdx + 1 < practiceVocabs.size) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowForward,
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
    }
}
