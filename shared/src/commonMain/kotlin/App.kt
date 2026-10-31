import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.data.PlatformStorage
import com.jlpt.n5.model.ExamResult
import com.jlpt.n5.tts.LocalTTS
import com.jlpt.n5.tts.rememberTextToSpeech
import com.jlpt.n5.ui.screens.*
import com.jlpt.n5.ui.theme.*
import com.jlpt.n5.viewmodel.*

enum class AppTab {
    HOME,
    LESSONS,
    FLASHCARDS,
    KANJI,
    MOCK_TESTS
}

sealed class Screen {
    object Main : Screen()
    data class LessonDetail(val lessonNumber: Int) : Screen()
    data class Exam(val testId: String) : Screen()
    data class ExamResultScreen(
        val testId: String,
        val score: Int,
        val maxScore: Int,
        val passed: Boolean,
        val correctCount: Int,
        val totalQuestions: Int,
        val answers: Map<Int, Int>
    ) : Screen()
}

@Composable
fun App() {
    val ttsManager = rememberTextToSpeech()

    CompositionLocalProvider(LocalTTS provides ttsManager) {
        JLPTAppTheme {
            var currentScreen by remember { mutableStateOf<Screen>(Screen.Main) }
        var currentTab by remember { mutableStateOf(AppTab.HOME) }
        var flashcardLessonTarget by remember { mutableStateOf<Int?>(null) }
        var flashcardKanjiOnly by remember { mutableStateOf(false) }

        val homeListState = rememberLazyListState()
        val lessonsListState = rememberLazyListState()
        val mockTestListState = rememberLazyListState()

        val homeViewModel = remember { HomeViewModel() }
        val lessonListViewModel = remember { LessonListViewModel() }
        val mockTestViewModel = remember { MockTestViewModel() }
        val flashcardViewModel = remember { FlashcardViewModel() }
        val kanjiViewModel = remember { KanjiViewModel() }

        Scaffold(
            bottomBar = {
                if (currentScreen is Screen.Main) {
                    BottomNavigation(
                        backgroundColor = MaterialTheme.colors.surface,
                        elevation = 8.dp
                    ) {
                        BottomNavigationItem(
                            icon = { Text(text = "🏠", fontSize = 18.sp) },
                            label = { Text("Trang chủ", fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                            selected = currentTab == AppTab.HOME,
                            selectedContentColor = MaterialTheme.colors.toriiAccent,
                            unselectedContentColor = MaterialTheme.colors.textMuted,
                            onClick = { currentTab = AppTab.HOME }
                        )

                        BottomNavigationItem(
                            icon = { Text(text = "📖", fontSize = 18.sp) },
                            label = { Text("25 Bài Minna", fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                            selected = currentTab == AppTab.LESSONS,
                            selectedContentColor = MaterialTheme.colors.toriiAccent,
                            unselectedContentColor = MaterialTheme.colors.textMuted,
                            onClick = { currentTab = AppTab.LESSONS }
                        )

                        BottomNavigationItem(
                            icon = { Text(text = "🗂️", fontSize = 18.sp) },
                            label = { Text("Flashcards", fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                            selected = currentTab == AppTab.FLASHCARDS,
                            selectedContentColor = MaterialTheme.colors.toriiAccent,
                            unselectedContentColor = MaterialTheme.colors.textMuted,
                            onClick = {
                                flashcardLessonTarget = null
                                flashcardKanjiOnly = false
                                currentTab = AppTab.FLASHCARDS
                            }
                        )

                        BottomNavigationItem(
                            icon = { Text(text = "🈲", fontSize = 18.sp) },
                            label = { Text("Kanji N5", fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                            selected = currentTab == AppTab.KANJI,
                            selectedContentColor = MaterialTheme.colors.toriiAccent,
                            unselectedContentColor = MaterialTheme.colors.textMuted,
                            onClick = { currentTab = AppTab.KANJI }
                        )

                        BottomNavigationItem(
                            icon = { Text(text = "📝", fontSize = 18.sp) },
                            label = { Text("Thi thử", fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                            selected = currentTab == AppTab.MOCK_TESTS,
                            selectedContentColor = MaterialTheme.colors.toriiAccent,
                            unselectedContentColor = MaterialTheme.colors.textMuted,
                            onClick = { currentTab = AppTab.MOCK_TESTS }
                        )
                    }
                }
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                when (val screen = currentScreen) {
                    is Screen.Main -> {
                        when (currentTab) {
                            AppTab.HOME -> HomeScreen(
                                viewModel = homeViewModel,
                                listState = homeListState,
                                onNavigateToLessons = { currentTab = AppTab.LESSONS },
                                onNavigateToLessonDetail = { lessonNum ->
                                    currentScreen = Screen.LessonDetail(lessonNum)
                                },
                                onNavigateToFlashcards = { lessonNum, kanjiOnly ->
                                    flashcardLessonTarget = lessonNum
                                    flashcardKanjiOnly = kanjiOnly
                                    currentTab = AppTab.FLASHCARDS
                                },
                                onNavigateToMockTests = { currentTab = AppTab.MOCK_TESTS },
                                onNavigateToKanji = { currentTab = AppTab.KANJI }
                            )

                            AppTab.LESSONS -> LessonListScreen(
                                viewModel = lessonListViewModel,
                                listState = lessonsListState,
                                onNavigateToDetail = { lessonNum ->
                                    currentScreen = Screen.LessonDetail(lessonNum)
                                },
                                onNavigateToFlashcard = { lessonNum ->
                                    flashcardLessonTarget = lessonNum
                                    flashcardKanjiOnly = false
                                    currentTab = AppTab.FLASHCARDS
                                }
                            )

                            AppTab.FLASHCARDS -> FlashcardScreen(
                                viewModel = flashcardViewModel,
                                initialLessonNumber = flashcardLessonTarget,
                                initialKanjiOnly = flashcardKanjiOnly,
                                onBack = { currentTab = AppTab.HOME }
                            )

                            AppTab.KANJI -> KanjiExplorerScreen(
                                viewModel = kanjiViewModel,
                                onOpenFlashcardKanji = {
                                    flashcardLessonTarget = null
                                    flashcardKanjiOnly = true
                                    currentTab = AppTab.FLASHCARDS
                                }
                            )

                            AppTab.MOCK_TESTS -> MockTestListScreen(
                                viewModel = mockTestViewModel,
                                listState = mockTestListState,
                                onStartExam = { testId ->
                                    currentScreen = Screen.Exam(testId)
                                }
                            )
                        }
                    }

                    is Screen.LessonDetail -> LessonDetailScreen(
                        lessonNumber = screen.lessonNumber,
                        onBack = { currentScreen = Screen.Main },
                        onOpenFlashcard = { num ->
                            flashcardLessonTarget = num
                            flashcardKanjiOnly = false
                            currentScreen = Screen.Main
                            currentTab = AppTab.FLASHCARDS
                        }
                    )

                    is Screen.Exam -> MockTestExamScreen(
                        testId = screen.testId,
                        viewModel = mockTestViewModel,
                        onBack = { currentScreen = Screen.Main },
                        onFinish = { score, maxScore, passed, correctCount, totalQuestions, answers ->
                            JLPTRepository.addExamResult(
                                ExamResult(
                                    testId = screen.testId,
                                    testTitle = JLPTRepository.getMockTest(screen.testId)?.title ?: "Đề thi N5",
                                    score = score,
                                    maxScore = maxScore,
                                    passed = passed,
                                    timestamp = PlatformStorage.currentTimeMillis(),
                                    correctCount = correctCount,
                                    totalQuestions = totalQuestions
                                )
                            )
                            currentScreen = Screen.ExamResultScreen(
                                testId = screen.testId,
                                score = score,
                                maxScore = maxScore,
                                passed = passed,
                                correctCount = correctCount,
                                totalQuestions = totalQuestions,
                                answers = answers
                            )
                        }
                    )

                    is Screen.ExamResultScreen -> MockTestResultScreen(
                        testId = screen.testId,
                        score = screen.score,
                        maxScore = screen.maxScore,
                        passed = screen.passed,
                        correctCount = screen.correctCount,
                        totalQuestions = screen.totalQuestions,
                        userAnswers = screen.answers,
                        onBackToList = {
                            currentScreen = Screen.Main
                            currentTab = AppTab.MOCK_TESTS
                        }
                    )
                }
            }
        }
    }
}
}

expect fun getPlatformName(): String