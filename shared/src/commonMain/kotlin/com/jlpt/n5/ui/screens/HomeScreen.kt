package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Lesson
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun HomeScreen(
    onNavigateToLessons: () -> Unit,
    onNavigateToLessonDetail: (Int) -> Unit,
    onNavigateToFlashcards: (lessonNum: Int?, kanjiOnly: Boolean) -> Unit,
    onNavigateToMockTests: () -> Unit,
    onNavigateToKanji: () -> Unit
) {
    val totalLessons = JLPTRepository.lessons.size
    val completedLessons = JLPTRepository.completedLessonNumbers.size
    val totalVocab = remember { JLPTRepository.lessons.sumOf { it.vocabularies.size } }
    val masteredVocab = JLPTRepository.masteredVocabIds.size
    val totalKanji = JLPTRepository.kanjiList.size
    val masteredKanji = JLPTRepository.masteredKanjiIds.size

    val readinessPercent = remember(masteredVocab, masteredKanji, completedLessons) {
        val vocabScore = if (totalVocab > 0) (masteredVocab.toFloat() / totalVocab) * 50f else 0f
        val kanjiScore = if (totalKanji > 0) (masteredKanji.toFloat() / totalKanji) * 30f else 0f
        val lessonScore = if (totalLessons > 0) (completedLessons.toFloat() / totalLessons) * 20f else 0f
        (vocabScore + kanjiScore + lessonScore).toInt().coerceIn(0, 100)
    }

    val dailyVocab = remember {
        JLPTRepository.lessons.firstOrNull()?.vocabularies?.firstOrNull()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // App Header & Greeting
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "JLPT N5 MASTER",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = IndigoPrimary,
                        letterSpacing = 1.sp
                    )
                    Text(
                        text = "こんにちは！ Chào bạn",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = MaterialTheme.colors.onBackground
                    )
                }

                // Streak Badge
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(AmberLight)
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "🔥 ", fontSize = 14.sp)
                        Text(
                            text = "3 ngày liên tục",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = AmberWarning
                        )
                    }
                }
            }
        }

        // Overall Readiness Card
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                elevation = 4.dp
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(IndigoPrimary, Color(0xFF1D4ED8))
                            )
                        )
                        .padding(20.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = "Độ sẵn sàng cho kì thi N5",
                                    color = Color.White.copy(alpha = 0.9f),
                                    fontSize = 14.sp
                                )
                                Text(
                                    text = "$readinessPercent%",
                                    color = Color.White,
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Black
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(Color.White.copy(alpha = 0.2f))
                                    .padding(horizontal = 12.dp, vertical = 8.dp)
                            ) {
                                Text(
                                    text = "Mục tiêu: Đỗ N5",
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        // Progress bar
                        LinearProgressIndicator(
                            progress = readinessPercent / 100f,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            color = SakuraPink,
                            backgroundColor = Color.White.copy(alpha = 0.3f)
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        // Stats Summary Row
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            StatItem(title = "Từ vựng", value = "$masteredVocab / $totalVocab")
                            StatItem(title = "Kanji", value = "$masteredKanji / $totalKanji")
                            StatItem(title = "Minna", value = "$completedLessons / $totalLessons bài")
                        }
                    }
                }
            }
        }

        // Quick Action Grid
        item {
            Text(
                text = "Hành động nhanh",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickActionButton(
                    icon = "🗂️",
                    title = "Flashcards",
                    subtitle = "Lật thẻ từ vựng",
                    color = SakuraPink,
                    bgColor = SakuraPinkLight,
                    modifier = Modifier.weight(1f),
                    onClick = { onNavigateToFlashcards(null, false) }
                )

                QuickActionButton(
                    icon = "🈲",
                    title = "Kanji N5",
                    subtitle = "104 Chữ Hán",
                    color = MatchaGreen,
                    bgColor = MatchaGreenLight,
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToKanji
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                QuickActionButton(
                    icon = "📖",
                    title = "25 Bài Minna",
                    subtitle = "Từ vựng & Ngữ pháp",
                    color = IndigoPrimary,
                    bgColor = IndigoSubtle,
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToLessons
                )

                QuickActionButton(
                    icon = "📝",
                    title = "Thi thử N5",
                    subtitle = "Bấm giờ tính điểm",
                    color = AmberWarning,
                    bgColor = AmberLight,
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToMockTests
                )
            }
        }

        // Daily Word Card
        if (dailyVocab != null) {
            item {
                Text(
                    text = "Từ vựng tâm điểm hôm nay",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )

                Spacer(modifier = Modifier.height(8.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onNavigateToLessonDetail(1) },
                    shape = RoundedCornerShape(16.dp),
                    elevation = 2.dp
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = dailyVocab.word,
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = IndigoPrimary
                            )
                            JapaneseBadge(text = dailyVocab.type)
                        }

                        Text(
                            text = "${dailyVocab.reading} (${dailyVocab.romaji})",
                            fontSize = 14.sp,
                            color = Slate500
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = dailyVocab.meaning,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colors.onSurface
                        )

                        if (dailyVocab.exampleSentence.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Divider(color = Slate200)
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Ví dụ: ${dailyVocab.exampleSentence}",
                                fontSize = 13.sp,
                                color = Slate700
                            )
                            Text(
                                text = dailyVocab.exampleSentenceMeaning,
                                fontSize = 12.sp,
                                color = Slate500
                            )
                        }
                    }
                }
            }
        }

        // Lesson Roadmap Header
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Lộ trình Minna no Nihongo (Bài 1 - 25)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )

                Text(
                    text = "Xem tất cả",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = IndigoPrimary,
                    modifier = Modifier.clickable { onNavigateToLessons() }
                )
            }
        }

        // First 5 Lessons Preview
        items(JLPTRepository.lessons.take(5)) { lesson ->
            LessonRoadmapItem(
                lesson = lesson,
                onClick = { onNavigateToLessonDetail(lesson.lessonNumber) }
            )
        }
    }
}

@Composable
fun StatItem(title: String, value: String) {
    Column {
        Text(
            text = title,
            fontSize = 11.sp,
            color = Color.White.copy(alpha = 0.8f)
        )
        Text(
            text = value,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
fun QuickActionButton(
    icon: String,
    title: String,
    subtitle: String,
    color: Color,
    bgColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier.clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = 2.dp
    ) {
        Column(
            modifier = Modifier
                .background(bgColor)
                .padding(14.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.8f)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = icon, fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )

            Text(
                text = subtitle,
                fontSize = 11.sp,
                color = Slate600
            )
        }
    }
}

@Composable
fun LessonRoadmapItem(
    lesson: Lesson,
    onClick: () -> Unit
) {
    val isCompleted = JLPTRepository.completedLessonNumbers.contains(lesson.lessonNumber)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        elevation = 1.dp
    ) {
        Row(
            modifier = Modifier
                .padding(14.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(if (isCompleted) MatchaGreenLight else IndigoSubtle),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${lesson.lessonNumber}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isCompleted) MatchaGreen else IndigoPrimary
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lesson.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.onSurface
                )
                Text(
                    text = "${lesson.vocabularies.size} từ vựng • ${lesson.grammarPoints.size} mẫu ngữ pháp",
                    fontSize = 12.sp,
                    color = Slate500
                )
            }

            if (isCompleted) {
                Text(text = "✅", fontSize = 14.sp)
            } else {
                Text(
                    text = "Học →",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = IndigoPrimary
                )
            }
        }
    }
}
