package com.jlpt.n5.model

import kotlinx.serialization.Serializable

@Serializable
data class KanjiItem(
    val id: Int,
    val kanji: String,
    val hanViet: String,
    val strokes: Int,
    val meaning: String,
    val onyomi: List<String> = emptyList(),
    val kunyomi: List<String> = emptyList(),
    val examples: List<KanjiExample> = emptyList()
)

@Serializable
data class KanjiExample(
    val word: String,
    val reading: String,
    val meaning: String
)

@Serializable
data class Lesson(
    val lessonNumber: Int,
    val title: String,
    val japaneseTitle: String,
    val description: String,
    val vocabularies: List<Vocabulary> = emptyList(),
    val grammarPoints: List<GrammarPoint> = emptyList()
)

@Serializable
data class Vocabulary(
    val id: Int,
    val word: String,
    val reading: String,
    val romaji: String = "",
    val meaning: String,
    val hanViet: String = "",
    val type: String = "",
    val exampleSentence: String = "",
    val exampleSentenceReading: String = "",
    val exampleSentenceMeaning: String = ""
)

@Serializable
data class GrammarPoint(
    val title: String,
    val pattern: String,
    val explanation: String,
    val examples: List<GrammarExample> = emptyList()
)

@Serializable
data class GrammarExample(
    val japanese: String,
    val reading: String = "",
    val vietnamese: String
)

@Serializable
data class MockTest(
    val id: String,
    val title: String,
    val description: String,
    val durationMinutes: Int = 45,
    val passScore: Int = 80,
    val maxScore: Int = 180,
    val questions: List<TestQuestion> = emptyList()
)

@Serializable
data class TestQuestion(
    val id: Int,
    val section: String,
    val category: String,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

enum class FlashcardType {
    VOCABULARY,
    KANJI
}

data class FlashcardItem(
    val id: String,
    val type: FlashcardType,
    val frontMain: String,
    val frontSub: String,
    val backMeaning: String,
    val backDetails: String,
    val example: String = "",
    val isMastered: Boolean = false,
    val isStarred: Boolean = false
)

@Serializable
data class ExamResult(
    val testId: String,
    val testTitle: String,
    val score: Int,
    val maxScore: Int,
    val passed: Boolean,
    val timestamp: Long,
    val correctCount: Int,
    val totalQuestions: Int
)

@Serializable
data class UserProgressData(
    val masteredVocabIds: Set<Int> = emptySet(),
    val starredVocabIds: Set<Int> = emptySet(),
    val masteredKanjiIds: Set<Int> = emptySet(),
    val starredKanjiIds: Set<Int> = emptySet(),
    val completedLessonNumbers: Set<Int> = emptySet(),
    val examHistory: List<ExamResult> = emptyList(),
    val streakDays: Int = 1,
    val lastStudyDayEpoch: Long = 0L
)
