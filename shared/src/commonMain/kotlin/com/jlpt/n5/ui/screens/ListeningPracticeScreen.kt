package com.jlpt.n5.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Vocabulary
import com.jlpt.n5.tts.LocalTTS
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.screens.lesson.components.FilterChip
import com.jlpt.n5.ui.theme.*
import kotlinx.coroutines.delay
import kotlin.random.Random

data class ListeningQuestion(
    val id: Int,
    val vocab: Vocabulary,
    val isSentenceMode: Boolean,
    val options: List<String>,
    val correctIndex: Int
)

@Composable
fun ListeningPracticeScreen(
    initialLessonNumber: Int? = null,
    onBack: () -> Unit
) {
    val tts = LocalTTS.current
    var selectedLessonNumber by remember { mutableStateOf(initialLessonNumber) }
    var selectedTab by remember { mutableStateOf(0) } // 0: Nghe từ vựng, 1: Nghe câu ví dụ, 2: Tự động chạy

    // Pool of available vocabularies
    val availableVocabularies = remember(selectedLessonNumber) {
        val list = if (selectedLessonNumber == null) {
            JLPTRepository.lessons.flatMap { it.vocabularies }
        } else {
            JLPTRepository.getLesson(selectedLessonNumber!!)?.vocabularies ?: emptyList()
        }
        list.ifEmpty { JLPTRepository.lessons.firstOrNull()?.vocabularies ?: emptyList() }
    }

    // Quiz generator key to restart
    var quizRoundKey by remember { mutableStateOf(0) }

    // Generate 10 questions for the round
    val questions = remember(availableVocabularies, selectedTab, quizRoundKey) {
        if (availableVocabularies.isEmpty()) emptyList()
        else {
            val shuffled = availableVocabularies.shuffled(Random(quizRoundKey + (selectedLessonNumber ?: 99)))
            val targetList = shuffled.take(10)
            targetList.mapIndexed { idx, target ->
                val isSentence = selectedTab == 1 && target.exampleSentence.isNotEmpty()
                val correctAnswer = if (isSentence) target.exampleSentenceMeaning else target.meaning
                
                // 3 distinct distractors
                val distractors = availableVocabularies
                    .filter { it.id != target.id }
                    .map { if (isSentence) it.exampleSentenceMeaning else it.meaning }
                    .filter { it.isNotBlank() && it != correctAnswer }
                    .distinct()
                    .shuffled(Random(idx * 31 + quizRoundKey))
                    .take(3)

                val allOptions = (distractors + correctAnswer).shuffled(Random(target.id + quizRoundKey))
                ListeningQuestion(
                    id = idx,
                    vocab = target,
                    isSentenceMode = isSentence,
                    options = allOptions,
                    correctIndex = allOptions.indexOf(correctAnswer)
                )
            }
        }
    }

    var currentQuestionIdx by remember(quizRoundKey, selectedTab, selectedLessonNumber) { mutableStateOf(0) }
    var selectedOption by remember(currentQuestionIdx, quizRoundKey, selectedTab, selectedLessonNumber) { mutableStateOf<Int?>(null) }
    var isSubmitted by remember(currentQuestionIdx, quizRoundKey, selectedTab, selectedLessonNumber) { mutableStateOf(false) }
    var score by remember(quizRoundKey, selectedTab, selectedLessonNumber) { mutableStateOf(0) }
    var isCompleted by remember(quizRoundKey, selectedTab, selectedLessonNumber) { mutableStateOf(false) }

    // Autoplay state (Tab 2)
    var autoPlayIdx by remember(selectedLessonNumber) { mutableStateOf(0) }
    var isAutoPlaying by remember { mutableStateOf(false) }

    val currentQuestion = questions.getOrNull(currentQuestionIdx)

    // Trigger TTS on new question in Quiz modes
    LaunchedEffect(currentQuestionIdx, quizRoundKey, selectedTab) {
        if (selectedTab != 2 && currentQuestion != null) {
            val textToSpeak = if (currentQuestion.isSentenceMode) {
                currentQuestion.vocab.exampleSentence
            } else {
                if (currentQuestion.vocab.word.isNotEmpty()) currentQuestion.vocab.word else currentQuestion.vocab.reading
            }
            delay(300)
            tts.speak(textToSpeak)
        }
    }

    // Autoplay loop
    LaunchedEffect(isAutoPlaying, autoPlayIdx, availableVocabularies) {
        if (isAutoPlaying && availableVocabularies.isNotEmpty()) {
            val item = availableVocabularies[autoPlayIdx % availableVocabularies.size]
            val speech = if (item.word.isNotEmpty()) item.word else item.reading
            tts.speak(speech)
            delay(3200)
            if (isAutoPlaying) {
                autoPlayIdx = (autoPlayIdx + 1) % availableVocabularies.size
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        // Top Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            elevation = 2.dp,
            color = MaterialTheme.colors.surface
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Text("←", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colors.textPrimary)
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "🎧 Luyện Nghe N5",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
                        )
                        Text(
                            text = if (selectedLessonNumber == null) "Tất cả 25 bài Minna" else "Bài $selectedLessonNumber - ${JLPTRepository.getLesson(selectedLessonNumber!!)?.title ?: ""}",
                            fontSize = 12.sp,
                            color = MaterialTheme.colors.textMuted,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }

                    // Score pill
                    if (selectedTab != 2 && !isCompleted) {
                        Surface(
                            shape = CircleShape,
                            color = MaterialTheme.colors.toriiBg
                        ) {
                            Text(
                                text = "Điểm: $score",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Lesson horizontal chip selector
                val lessonScrollState = rememberScrollState()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(lessonScrollState),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    FilterChip(
                        text = "Tất cả bài",
                        isSelected = selectedLessonNumber == null,
                        onClick = {
                            selectedLessonNumber = null
                            quizRoundKey++
                        }
                    )
                    (1..25).forEach { lNum ->
                        FilterChip(
                            text = "Bài $lNum",
                            isSelected = selectedLessonNumber == lNum,
                            onClick = {
                                selectedLessonNumber = lNum
                                quizRoundKey++
                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Mode Tabs
                TabRow(
                    selectedTabIndex = selectedTab,
                    backgroundColor = MaterialTheme.colors.surface,
                    contentColor = MaterialTheme.colors.toriiAccent
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0; quizRoundKey++ },
                        text = { Text("🎧 Nghe Từ Vựng", fontSize = 13.sp, fontWeight = FontWeight.Bold) }
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1; quizRoundKey++ },
                        text = { Text("💬 Nghe Câu Mẫu", fontSize = 13.sp, fontWeight = FontWeight.Bold) }
                    )
                    Tab(
                        selected = selectedTab == 2,
                        onClick = { selectedTab = 2 },
                        text = { Text("📻 Rảnh Tay (Auto)", fontSize = 13.sp, fontWeight = FontWeight.Bold) }
                    )
                }
            }
        }

        // Body Content
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            when {
                selectedTab == 2 -> {
                    // Autoplay Hands-free screen
                    AutoplayListeningView(
                        vocabularies = availableVocabularies,
                        currentIndex = autoPlayIdx,
                        isPlaying = isAutoPlaying,
                        onTogglePlay = { isAutoPlaying = !isAutoPlaying },
                        onNext = {
                            autoPlayIdx = (autoPlayIdx + 1) % availableVocabularies.size
                        },
                        onPrev = {
                            autoPlayIdx = if (autoPlayIdx > 0) autoPlayIdx - 1 else availableVocabularies.size - 1
                        },
                        onReplay = {
                            if (availableVocabularies.isNotEmpty()) {
                                val item = availableVocabularies[autoPlayIdx % availableVocabularies.size]
                                tts.speak(if (item.word.isNotEmpty()) item.word else item.reading)
                            }
                        }
                    )
                }

                isCompleted -> {
                    // Quiz Result Screen
                    ListeningResultCard(
                        score = score,
                        totalQuestions = questions.size,
                        onRetry = {
                            quizRoundKey++
                        },
                        onChangeLesson = {
                            selectedLessonNumber = null
                            quizRoundKey++
                        }
                    )
                }

                currentQuestion != null -> {
                    // Active Listening Quiz Question
                    ListeningQuestionView(
                        question = currentQuestion,
                        currentIndex = currentQuestionIdx,
                        totalCount = questions.size,
                        selectedOption = selectedOption,
                        isSubmitted = isSubmitted,
                        onSelectOption = { idx ->
                            if (!isSubmitted) {
                                selectedOption = idx
                                isSubmitted = true
                                if (idx == currentQuestion.correctIndex) {
                                    score += 10
                                    JLPTRepository.recordStudyActivity()
                                }
                            }
                        },
                        onReplayAudio = {
                            val text = if (currentQuestion.isSentenceMode) {
                                currentQuestion.vocab.exampleSentence
                            } else {
                                if (currentQuestion.vocab.word.isNotEmpty()) currentQuestion.vocab.word else currentQuestion.vocab.reading
                            }
                            tts.speak(text)
                        },
                        onNextQuestion = {
                            if (currentQuestionIdx + 1 < questions.size) {
                                currentQuestionIdx++
                            } else {
                                isCompleted = true
                            }
                        }
                    )
                }

                else -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text("Không có dữ liệu bài nghe", color = MaterialTheme.colors.textMuted)
                    }
                }
            }
        }
    }
}

@Composable
fun ListeningQuestionView(
    question: ListeningQuestion,
    currentIndex: Int,
    totalCount: Int,
    selectedOption: Int?,
    isSubmitted: Boolean,
    onSelectOption: (Int) -> Unit,
    onReplayAudio: () -> Unit,
    onNextQuestion: () -> Unit
) {
    val scrollState = rememberScrollState()
    val tts = LocalTTS.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Progress header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Câu ${currentIndex + 1} / $totalCount",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.textSecondary
            )
            LinearProgressIndicator(
                progress = (currentIndex + 1).toFloat() / totalCount,
                modifier = Modifier
                    .width(140.dp)
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = MaterialTheme.colors.toriiAccent,
                backgroundColor = MaterialTheme.colors.surfaceContainer
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Big Audio Speaker Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            backgroundColor = MaterialTheme.colors.cardBackground,
            elevation = 2.dp
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = if (question.isSentenceMode) "🎧 Lắng nghe câu ví dụ sau" else "🎧 Lắng nghe và chọn nghĩa đúng",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textSecondary
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Pulsing Audio Button
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.toriiBg)
                        .clickable { onReplayAudio() },
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "🔊", fontSize = 36.sp)
                }

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedButton(
                    onClick = onReplayAudio,
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colors.toriiAccent)
                ) {
                    Text("Bấm để nghe lại ↺", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                }

                // If submitted, reveal the details
                AnimatedVisibility(
                    visible = isSubmitted,
                    enter = fadeIn() + expandVertically()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Divider(color = MaterialTheme.colors.outlineBorder.copy(alpha = 0.5f))
                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = question.vocab.word,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )
                            if (question.vocab.hanViet.isNotEmpty()) {
                                Spacer(modifier = Modifier.width(8.dp))
                                HanVietBadge(hanViet = question.vocab.hanViet)
                            }
                        }

                        Text(
                            text = "${question.vocab.reading} • ${question.vocab.romaji}",
                            fontSize = 14.sp,
                            color = MaterialTheme.colors.textMuted
                        )

                        if (question.vocab.exampleSentence.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = MaterialTheme.colors.surfaceContainer,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = question.vocab.exampleSentence,
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MaterialTheme.colors.textPrimary
                                        )
                                        Text(
                                            text = question.vocab.exampleSentenceMeaning,
                                            fontSize = 12.sp,
                                            color = MaterialTheme.colors.textSecondary
                                        )
                                    }
                                    IconButton(
                                        onClick = { tts.speak(question.vocab.exampleSentence) },
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Text("🔊", fontSize = 14.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // 4 Options
        question.options.forEachIndexed { index, optionText ->
            val isChosen = selectedOption == index
            val isCorrect = index == question.correctIndex

            val bgColor = when {
                !isSubmitted -> if (isChosen) MaterialTheme.colors.toriiBg else MaterialTheme.colors.cardBackground
                isCorrect -> MaterialTheme.colors.matchaBg
                isChosen -> MaterialTheme.colors.toriiBg
                else -> MaterialTheme.colors.cardBackground
            }

            val borderColor = when {
                !isSubmitted -> if (isChosen) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.outlineBorder
                isCorrect -> MaterialTheme.colors.matchaAccent
                isChosen -> MaterialTheme.colors.toriiAccent
                else -> MaterialTheme.colors.outlineBorder
            }

            val textColor = when {
                isSubmitted && isCorrect -> MaterialTheme.colors.matchaAccent
                isSubmitted && isChosen -> MaterialTheme.colors.toriiAccent
                else -> MaterialTheme.colors.textPrimary
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.5.dp, borderColor, RoundedCornerShape(12.dp))
                    .clickable(enabled = !isSubmitted) { onSelectOption(index) },
                color = bgColor,
                elevation = 1.dp
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(26.dp)
                            .clip(CircleShape)
                            .background(if (isSubmitted && isCorrect) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.surfaceContainer),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = when {
                                isSubmitted && isCorrect -> "✓"
                                isSubmitted && isChosen -> "✕"
                                else -> "${('A' + index)}"
                            },
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isSubmitted && isCorrect) Color.White else MaterialTheme.colors.textSecondary
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = optionText,
                        fontSize = 14.sp,
                        fontWeight = if (isChosen || (isSubmitted && isCorrect)) FontWeight.Bold else FontWeight.Normal,
                        color = textColor,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Next Button
        if (isSubmitted) {
            Button(
                onClick = onNextQuestion,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
            ) {
                Text(
                    text = if (currentIndex + 1 < totalCount) "Câu tiếp theo ➜" else "Xem kết quả 🎉",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun AutoplayListeningView(
    vocabularies: List<Vocabulary>,
    currentIndex: Int,
    isPlaying: Boolean,
    onTogglePlay: () -> Unit,
    onNext: () -> Unit,
    onPrev: () -> Unit,
    onReplay: () -> Unit
) {
    val currentVocab = vocabularies.getOrNull(currentIndex % vocabularies.size.coerceAtLeast(1))

    if (currentVocab == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Không có từ vựng", color = MaterialTheme.colors.textMuted)
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "📻 CHẾ ĐỘ RẢNH TAY (AUTOPLAY)",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.toriiAccent
        )
        Text(
            text = "Tự động phát âm và chuyển từ tiếp theo sau 3 giây",
            fontSize = 12.sp,
            color = MaterialTheme.colors.textMuted
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            backgroundColor = MaterialTheme.colors.cardBackground,
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier.padding(28.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${(currentIndex % vocabularies.size) + 1} / ${vocabularies.size}",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = currentVocab.word,
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.toriiAccent,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = currentVocab.reading,
                    fontSize = 18.sp,
                    color = MaterialTheme.colors.textSecondary
                )

                if (currentVocab.hanViet.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    HanVietBadge(hanViet = currentVocab.hanViet)
                }

                Spacer(modifier = Modifier.height(16.dp))
                Divider(color = MaterialTheme.colors.outlineBorder.copy(alpha = 0.5f))
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = currentVocab.meaning,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textPrimary,
                    textAlign = TextAlign.Center
                )

                if (currentVocab.exampleSentence.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = currentVocab.exampleSentence,
                        fontSize = 13.sp,
                        color = MaterialTheme.colors.textSecondary,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = currentVocab.exampleSentenceMeaning,
                        fontSize = 12.sp,
                        color = MaterialTheme.colors.textMuted,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Control buttons
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            IconButton(
                onClick = onPrev,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.surfaceContainer)
            ) {
                Text("⏮", fontSize = 18.sp)
            }

            // Big Play/Pause
            Button(
                onClick = onTogglePlay,
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (isPlaying) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.matchaAccent
                ),
                modifier = Modifier.size(64.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = if (isPlaying) "⏸" else "▶",
                    fontSize = 26.sp,
                    color = Color.White
                )
            }

            IconButton(
                onClick = onNext,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.surfaceContainer)
            ) {
                Text("⏭", fontSize = 18.sp)
            }

            IconButton(
                onClick = onReplay,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.surfaceContainer)
            ) {
                Text("🔊", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun ListeningResultCard(
    score: Int,
    totalQuestions: Int,
    onRetry: () -> Unit,
    onChangeLesson: () -> Unit
) {
    val maxScore = totalQuestions * 10
    val percent = if (maxScore > 0) (score * 100) / maxScore else 0

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 3.dp
    ) {
        Column(
            modifier = Modifier.padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = if (percent >= 80) "🎉 Xuất sắc!" else if (percent >= 50) "👏 Khá tốt!" else "💪 Cần luyện thêm!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = if (percent >= 80) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Bạn đã đạt $score / $maxScore điểm ($percent%)",
                fontSize = 15.sp,
                color = MaterialTheme.colors.textPrimary
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = onRetry,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
            ) {
                Text("Luyện tập lượt mới ↺", fontWeight = FontWeight.Bold, color = Color.White)
            }

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedButton(
                onClick = onChangeLesson,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(14.dp)
            ) {
                Text("Chọn bài học khác 📚", color = MaterialTheme.colors.textPrimary)
            }
        }
    }
}
