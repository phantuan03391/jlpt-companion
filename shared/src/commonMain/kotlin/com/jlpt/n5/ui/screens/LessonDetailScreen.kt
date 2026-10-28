package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            Text("Không tìm thấy bài học", color = MaterialTheme.colors.textPrimary)
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
            elevation = 2.dp,
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
                                .background(MaterialTheme.colors.surfaceContainer)
                                .clickable { onBack() },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "←",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textPrimary
                            )
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = "BÀI ${lesson.lessonNumber}",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )
                            Text(
                                text = lesson.japaneseTitle,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textPrimary
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
                            backgroundColor = if (isLessonCompleted) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer
                        ),
                        shape = RoundedCornerShape(20.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                        elevation = ButtonDefaults.elevation(0.dp)
                    ) {
                        Text(
                            text = if (isLessonCompleted) "✓ Đã học xong" else "Đánh dấu hoàn thành",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isLessonCompleted) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Tabs: Từ vựng / Ngữ pháp / Luyện tập
                TabRow(
                    selectedTabIndex = selectedTab,
                    backgroundColor = MaterialTheme.colors.surface,
                    contentColor = MaterialTheme.colors.toriiAccent
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0 },
                        text = {
                            Text(
                                "Từ vựng (${lesson.vocabularies.size})",
                                fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Medium,
                                color = if (selectedTab == 0) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1 },
                        text = {
                            Text(
                                "Ngữ pháp (${lesson.grammarPoints.size})",
                                fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Medium,
                                color = if (selectedTab == 1) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    )
                    Tab(
                        selected = selectedTab == 2,
                        onClick = { selectedTab = 2 },
                        text = {
                            Text(
                                "Luyện tập",
                                fontWeight = if (selectedTab == 2) FontWeight.Bold else FontWeight.Medium,
                                color = if (selectedTab == 2) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                            )
                        }
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
                0 -> VocabTabContent(
                    vocabularies = lesson.vocabularies,
                    onOpenFlashcard = { onOpenFlashcard(lessonNumber) }
                )
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
    val focusManager = LocalFocusManager.current
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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                focusManager.clearFocus()
            }
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        // Search Input for vocab
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    "Tìm từ vựng trong bài...",
                    color = MaterialTheme.colors.textMuted,
                    fontSize = 13.sp
                )
            },
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            trailingIcon = {
                if (query.isNotEmpty()) {
                    IconButton(onClick = {
                        query = ""
                        focusManager.clearFocus()
                    }) {
                        Text(
                            text = "✕",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textMuted
                        )
                    }
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { focusManager.clearFocus() }),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = MaterialTheme.colors.surface,
                textColor = MaterialTheme.colors.textPrimary,
                cursorColor = MaterialTheme.colors.primary,
                focusedBorderColor = MaterialTheme.colors.primary,
                unfocusedBorderColor = MaterialTheme.colors.outlineBorder
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Flashcard shortcut banner
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            focusManager.clearFocus()
                            onOpenFlashcard()
                        },
                    shape = RoundedCornerShape(14.dp),
                    backgroundColor = MaterialTheme.colors.toriiBg,
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
                                color = MaterialTheme.colors.toriiAccent
                            )
                            Text(
                                text = "Lật thẻ ghi nhớ nhanh ${vocabularies.size} từ vựng bài này",
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.textSecondary
                            )
                        }

                        Text(
                            text = "Bắt đầu →",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.toriiAccent
                        )
                    }
                }
            }

            items(filtered) { vocab ->
                VocabItemCard(vocab)
            }
        }
    }
}

@Composable
fun VocabItemCard(vocab: Vocabulary) {
    var isMastered by remember(vocab.id) { mutableStateOf(JLPTRepository.masteredVocabIds.contains(vocab.id)) }
    var isStarred by remember(vocab.id) { mutableStateOf(JLPTRepository.starredVocabIds.contains(vocab.id)) }

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
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = vocab.word,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.toriiAccent
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        if (vocab.hanViet.isNotEmpty()) {
                            HanVietBadge(hanViet = vocab.hanViet)
                        }
                    }

                    Text(
                        text = "${vocab.reading} • ${vocab.romaji}",
                        fontSize = 13.sp,
                        color = MaterialTheme.colors.textMuted
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
                color = MaterialTheme.colors.textPrimary
            )

            if (vocab.exampleSentence.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colors.surfaceContainer, RoundedCornerShape(8.dp))
                        .padding(10.dp)
                ) {
                    Column {
                        Text(
                            text = "Ví dụ: ${vocab.exampleSentence}",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colors.textPrimary
                        )
                        Text(
                            text = vocab.exampleSentenceMeaning,
                            fontSize = 11.sp,
                            color = MaterialTheme.colors.textSecondary
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
                backgroundColor = MaterialTheme.colors.cardBackground,
                elevation = 1.dp
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = gp.title,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(MaterialTheme.colors.surfaceContainer, RoundedCornerShape(8.dp))
                            .padding(horizontal = 12.dp, vertical = 8.dp)
                    ) {
                        Text(
                            text = "Cấu trúc: ${gp.pattern}",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = gp.explanation,
                        fontSize = 14.sp,
                        color = MaterialTheme.colors.textSecondary,
                        lineHeight = 20.sp
                    )

                    if (gp.examples.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Ví dụ minh họa:",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
                        )
                        Spacer(modifier = Modifier.height(6.dp))

                        gp.examples.forEachIndexed { index, ex ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp)
                                    .background(MaterialTheme.colors.surfaceContainer, RoundedCornerShape(8.dp))
                                    .padding(10.dp)
                            ) {
                                Column {
                                    Text(
                                        text = "${index + 1}. ${ex.japanese}",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = MaterialTheme.colors.textPrimary
                                    )
                                    if (ex.reading.isNotEmpty()) {
                                        Text(
                                            text = "    (${ex.reading})",
                                            fontSize = 11.sp,
                                            color = MaterialTheme.colors.textMuted
                                        )
                                    }
                                    Text(
                                        text = "    → ${ex.vietnamese}",
                                        fontSize = 12.sp,
                                        color = MaterialTheme.colors.toriiAccent,
                                        fontWeight = FontWeight.SemiBold
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
