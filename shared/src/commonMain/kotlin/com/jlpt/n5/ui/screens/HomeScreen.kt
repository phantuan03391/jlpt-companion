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

    val darkMode = LocalDarkMode.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // App Header & Greeting & Theme Toggle
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "JLPT N5 ZEN MASTER",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent,
                        letterSpacing = 1.sp
                    )
                    Text(
                        text = "こんにちは！ Chào bạn",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = MaterialTheme.colors.textPrimary
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Dark / Light Theme Toggle Button
                    IconButton(
                        onClick = { darkMode.value = !darkMode.value },
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(MaterialTheme.colors.surfaceContainer)
                            .size(38.dp)
                    ) {
                        Text(
                            text = if (darkMode.value) "☀️" else "🌙",
                            fontSize = 18.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Streak Badge
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(MaterialTheme.colors.amberBg)
                            .padding(horizontal = 10.dp, vertical = 6.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "🔥 ", fontSize = 13.sp)
                            Text(
                                text = "3 ngày",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = OchreAmber
                            )
                        }
                    }
                }
            }
        }

        // Overall Readiness Card (Torii Crimson gradient)
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
                            Brush.linearGradient(
                                colors = listOf(ToriiCrimsonDark, ToriiCrimson)
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
                                    fontSize = 34.sp,
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
                            color = Color.White,
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
                color = MaterialTheme.colors.textPrimary
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
                    color = MaterialTheme.colors.toriiAccent,
                    bgColor = MaterialTheme.colors.toriiBg,
                    modifier = Modifier.weight(1f),
                    onClick = { onNavigateToFlashcards(null, false) }
                )

                QuickActionButton(
                    icon = "🈲",
                    title = "Kanji N5",
                    subtitle = "104 Chữ Hán",
                    color = MaterialTheme.colors.matchaAccent,
                    bgColor = MaterialTheme.colors.matchaBg,
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
                    color = MaterialTheme.colors.toriiAccent,
                    bgColor = MaterialTheme.colors.surfaceContainer,
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToLessons
                )

                QuickActionButton(
                    icon = "📝",
                    title = "Thi thử N5",
                    subtitle = "Bấm giờ tính điểm",
                    color = OchreAmber,
                    bgColor = MaterialTheme.colors.amberBg,
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
                    color = MaterialTheme.colors.textPrimary
                )

                Spacer(modifier = Modifier.height(8.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onNavigateToLessonDetail(1) },
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
                                text = dailyVocab.word,
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )
                            JapaneseBadge(text = dailyVocab.type)
                        }

                        Text(
                            text = "${dailyVocab.reading} (${dailyVocab.romaji})",
                            fontSize = 14.sp,
                            color = MaterialTheme.colors.textMuted
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = dailyVocab.meaning,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colors.textPrimary
                        )

                        if (dailyVocab.exampleSentence.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Divider(color = MaterialTheme.colors.outlineBorder)
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Ví dụ: ${dailyVocab.exampleSentence}",
                                fontSize = 13.sp,
                                color = MaterialTheme.colors.textSecondary
                            )
                            Text(
                                text = dailyVocab.exampleSentenceMeaning,
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.textMuted
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
                    color = MaterialTheme.colors.textPrimary
                )

                Text(
                    text = "Xem tất cả",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.toriiAccent,
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
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 1.dp
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
                    .background(Color.White.copy(alpha = 0.85f)),
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
                color = MaterialTheme.colors.textSecondary
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
        backgroundColor = MaterialTheme.colors.cardBackground,
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
                    .background(if (isCompleted) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${lesson.lessonNumber}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isCompleted) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lesson.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.textPrimary
                )
                Text(
                    text = "${lesson.vocabularies.size} từ vựng • ${lesson.grammarPoints.size} ngữ pháp",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted
                )
            }

            if (isCompleted) {
                Text(text = "✅", fontSize = 14.sp)
            } else {
                Text(
                    text = "Học →",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.toriiAccent
                )
            }
        }
    }
}
