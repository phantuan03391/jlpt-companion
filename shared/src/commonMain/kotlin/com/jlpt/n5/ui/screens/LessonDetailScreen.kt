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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.GrammarPoint
import com.jlpt.n5.model.Vocabulary
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun LessonDetailScreen(
    lessonNumber: Int,
    onBack: () -> Unit,
    onOpenFlashcard: (Int) -> Unit
) {
    val lesson = remember(lessonNumber) { JLPTRepository.getLesson(lessonNumber) }
    var selectedTab by remember { mutableStateOf(0) } // 0: Vocab, 1: Grammar, 2: Practice
    var isLessonCompleted by remember {
        mutableStateOf(JLPTRepository.completedLessonNumbers.contains(lessonNumber))
    }

    if (lesson == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Không tìm thấy bài học")
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        // Top Navigation Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            elevation = 4.dp,
            color = MaterialTheme.colors.surface
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Slate100)
                                .clickable { onBack() },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "←", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Slate800)
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = "BÀI ${lesson.lessonNumber}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = IndigoPrimary
                            )
                            Text(
                                text = lesson.japaneseTitle,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.onSurface
                            )
                        }
                    }

                    // Complete Lesson Button
                    Button(
                        onClick = {
                            if (isLessonCompleted) {
                                JLPTRepository.completedLessonNumbers.remove(lessonNumber)
                                isLessonCompleted = false
                            } else {
                                JLPTRepository.markLessonCompleted(lessonNumber)
                                isLessonCompleted = true
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = if (isLessonCompleted) MatchaGreenLight else IndigoSubtle
                        ),
                        shape = RoundedCornerShape(20.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                        elevation = ButtonDefaults.elevation(0.dp)
                    ) {
                        Text(
                            text = if (isLessonCompleted) "✓ Đã học xong" else "Hoàn thành",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isLessonCompleted) MatchaGreen else IndigoPrimary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Tabs: Từ vựng / Ngữ pháp
                TabRow(
                    selectedTabIndex = selectedTab,
                    backgroundColor = MaterialTheme.colors.surface,
                    contentColor = IndigoPrimary
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0 },
                        text = { Text("Từ vựng (${lesson.vocabularies.size})", fontWeight = FontWeight.Bold) }
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1 },
                        text = { Text("Ngữ pháp (${lesson.grammarPoints.size})", fontWeight = FontWeight.Bold) }
                    )
                    Tab(
                        selected = selectedTab == 2,
                        onClick = { selectedTab = 2 },
                        text = { Text("Luyện tập", fontWeight = FontWeight.Bold) }
                    )
                }
            }
        }

        // Tab Content
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            when (selectedTab) {
                0 -> VocabTabContent(lesson.vocabularies, onOpenFlashcard = { onOpenFlashcard(lessonNumber) })
                1 -> GrammarTabContent(lesson.grammarPoints)
                2 -> PracticeTabContent(lesson.vocabularies)
            }
        }
    }
}

@Composable
fun VocabTabContent(
    vocabularies: List<Vocabulary>,
    onOpenFlashcard: () -> Unit
) {
    var query by remember { mutableStateOf("") }
    val filtered = remember(query, vocabularies) {
        if (query.isEmpty()) vocabularies
        else vocabularies.filter {
            it.word.contains(query, ignoreCase = true) ||
                    it.reading.contains(query, ignoreCase = true) ||
                    it.meaning.contains(query, ignoreCase = true) ||
                    it.hanViet.contains(query, ignoreCase = true)
        }
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Flashcard shortcut banner
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onOpenFlashcard() },
                shape = RoundedCornerShape(14.dp),
                backgroundColor = SakuraPinkLight,
                elevation = 0.dp
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "🗂️ Ôn tập bằng Flashcard",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = SakuraPink
                        )
                        Text(
                            text = "Lật thẻ ghi nhớ nhanh ${vocabularies.size} từ vựng bài này",
                            fontSize = 12.sp,
                            color = Slate600
                        )
                    }

                    Text(
                        text = "Bắt đầu →",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = SakuraPink
                    )
                }
            }
        }

        items(filtered) { vocab ->
            VocabItemCard(vocab)
        }
    }
}

@Composable
fun VocabItemCard(vocab: Vocabulary) {
    var isMastered by remember { mutableStateOf(JLPTRepository.masteredVocabIds.contains(vocab.id)) }
    var isStarred by remember { mutableStateOf(JLPTRepository.starredVocabIds.contains(vocab.id)) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        elevation = 1.dp
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = vocab.word,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = IndigoPrimary
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        if (vocab.hanViet.isNotEmpty()) {
                            HanVietBadge(hanViet = vocab.hanViet)
                        }
                    }

                    Text(
                        text = "${vocab.reading} • ${vocab.romaji}",
                        fontSize = 13.sp,
                        color = Slate500
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Star button
                    IconButton(
                        onClick = {
                            isStarred = JLPTRepository.toggleStarredVocab(vocab.id)
                        },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Text(text = if (isStarred) "⭐" else "☆", fontSize = 16.sp)
                    }

                    // Mastered check button
                    IconButton(
                        onClick = {
                            isMastered = JLPTRepository.toggleMasteredVocab(vocab.id)
                        },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Text(text = if (isMastered) "✅" else "⚪", fontSize = 16.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = vocab.meaning,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.onSurface
            )

            if (vocab.exampleSentence.isNotEmpty()) {
                Spacer(modifier = Modifier.height(6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Slate50, RoundedCornerShape(8.dp))
                        .padding(8.dp)
                ) {
                    Column {
                        Text(
                            text = "Ví dụ: ${vocab.exampleSentence}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Slate800
                        )
                        Text(
                            text = vocab.exampleSentenceMeaning,
                            fontSize = 11.sp,
                            color = Slate500
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun GrammarTabContent(grammarPoints: List<GrammarPoint>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(grammarPoints) { gp ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = 2.dp
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = gp.title,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = IndigoPrimary
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(IndigoSubtle, RoundedCornerShape(8.dp))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "Cấu trúc: ${gp.pattern}",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = IndigoDark
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = gp.explanation,
                        fontSize = 14.sp,
                        color = Slate700,
                        lineHeight = 20.sp
                    )

                    if (gp.examples.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Ví dụ minh họa:",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Slate900
                        )
                        Spacer(modifier = Modifier.height(6.dp))

                        gp.examples.forEachIndexed { index, ex ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp)
                                    .background(Slate50, RoundedCornerShape(8.dp))
                                    .padding(10.dp)
                            ) {
                                Column {
                                    Text(
                                        text = "${index + 1}. ${ex.japanese}",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = MaterialTheme.colors.onSurface
                                    )
                                    if (ex.reading.isNotEmpty()) {
                                        Text(
                                            text = "    (${ex.reading})",
                                            fontSize = 11.sp,
                                            color = Slate500
                                        )
                                    }
                                    Text(
                                        text = "    → ${ex.vietnamese}",
                                        fontSize = 12.sp,
                                        color = IndigoDark
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

@Composable
fun PracticeTabContent(
    vocabularies: List<Vocabulary>
) {
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableStateOf(0) }
    var isSubmitted by remember { mutableStateOf(false) }

    val sampleVocab = vocabularies.firstOrNull() ?: return

    val questionText = "Từ 「${sampleVocab.word}」 (${sampleVocab.reading}) có nghĩa là gì?"
    val options = listOf(
        sampleVocab.meaning,
        "Giáo viên / Thầy cô",
        "Trường học",
        "Bệnh viện"
    ).shuffled(kotlin.random.Random(sampleVocab.id))

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
            elevation = 3.dp
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                JapaneseBadge(text = "CÂU HỎI LUYỆN TẬP NHANH")

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = questionText,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onSurface
                )

                Spacer(modifier = Modifier.height(16.dp))

                options.forEachIndexed { index, opt ->
                    val isChosen = selectedOption == index
                    val isCorrect = index == correctIndex

                    val bgColor = when {
                        !isSubmitted -> if (isChosen) IndigoSubtle else Slate50
                        isCorrect -> MatchaGreenLight
                        isChosen -> SakuraPinkLight
                        else -> Slate50
                    }

                    val borderColor = when {
                        !isSubmitted -> if (isChosen) IndigoPrimary else Slate200
                        isCorrect -> MatchaGreen
                        isChosen -> SakuraPink
                        else -> Slate200
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
                            color = MaterialTheme.colors.onSurface
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
                        colors = ButtonDefaults.buttonColors(backgroundColor = IndigoPrimary),
                        enabled = selectedOption != null
                    ) {
                        Text("Kiểm tra đáp án", color = SurfaceWhite, fontWeight = FontWeight.Bold)
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(if (selectedOption == correctIndex) MatchaGreenLight else SakuraPinkLight, RoundedCornerShape(8.dp))
                            .padding(12.dp)
                    ) {
                        Text(
                            text = if (selectedOption == correctIndex) "🎉 Chính xác!" else "❌ Chưa đúng! Đáp án đúng: ${sampleVocab.meaning}",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (selectedOption == correctIndex) MatchaGreen else SakuraPink
                        )
                    }
                }
            }
        }
    }
}
