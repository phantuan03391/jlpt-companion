package com.jlpt.n5.data

import com.jlpt.n5.model.*
import kotlinx.serialization.json.Json

object JLPTRepository {
    private val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
    }

    val kanjiList: List<KanjiItem> by lazy {
        try {
            json.decodeFromString<List<KanjiItem>>(DataFixtures.KANJI_RAW_JSON)
        } catch (e: Exception) {
            emptyList()
        }
    }

    val lessons: List<Lesson> by lazy {
        try {
            json.decodeFromString<List<Lesson>>(DataFixtures.LESSONS_RAW_JSON)
        } catch (e: Exception) {
            emptyList()
        }
    }

    val mockTests: List<MockTest> by lazy {
        try {
            json.decodeFromString<List<MockTest>>(DataFixtures.TESTS_RAW_JSON)
        } catch (e: Exception) {
            emptyList()
        }
    }

    val kanjiStrokesMap: Map<String, List<String>> by lazy {
        try {
            json.decodeFromString<Map<String, List<String>>>(KanjiStrokesFixtures.STROKES_RAW_JSON)
        } catch (e: Exception) {
            emptyMap()
        }
    }

    fun getKanjiStrokes(kanji: String): List<String> = kanjiStrokesMap[kanji] ?: emptyList()

    // In-memory persistent state across sessions
    val masteredVocabIds = mutableSetOf<Int>()
    val starredVocabIds = mutableSetOf<Int>()
    val masteredKanjiIds = mutableSetOf<Int>()
    val starredKanjiIds = mutableSetOf<Int>()
    val completedLessonNumbers = mutableSetOf<Int>()
    val examHistory = mutableListOf<ExamResult>()

    fun getLesson(number: Int): Lesson? = lessons.find { it.lessonNumber == number }

    fun getKanji(id: Int): KanjiItem? = kanjiList.find { it.id == id }

    fun getMockTest(id: String): MockTest? = mockTests.find { it.id == id }

    fun toggleMasteredVocab(id: Int): Boolean {
        return if (masteredVocabIds.contains(id)) {
            masteredVocabIds.remove(id)
            false
        } else {
            masteredVocabIds.add(id)
            true
        }
    }

    fun toggleStarredVocab(id: Int): Boolean {
        return if (starredVocabIds.contains(id)) {
            starredVocabIds.remove(id)
            false
        } else {
            starredVocabIds.add(id)
            true
        }
    }

    fun toggleMasteredKanji(id: Int): Boolean {
        return if (masteredKanjiIds.contains(id)) {
            masteredKanjiIds.remove(id)
            false
        } else {
            masteredKanjiIds.add(id)
            true
        }
    }

    fun toggleStarredKanji(id: Int): Boolean {
        return if (starredKanjiIds.contains(id)) {
            starredKanjiIds.remove(id)
            false
        } else {
            starredKanjiIds.add(id)
            true
        }
    }

    fun markLessonCompleted(number: Int) {
        completedLessonNumbers.add(number)
    }

    fun addExamResult(result: ExamResult) {
        examHistory.add(0, result)
    }

    fun getAllFlashcards(lessonNumber: Int? = null, kanjiOnly: Boolean = false): List<FlashcardItem> {
        val list = mutableListOf<FlashcardItem>()

        if (kanjiOnly) {
            kanjiList.forEach { k ->
                val isMastered = masteredKanjiIds.contains(k.id)
                val isStarred = starredKanjiIds.contains(k.id)
                val onKun = "On: ${k.onyomi.joinToString(", ")}\nKun: ${k.kunyomi.joinToString(", ")}"
                val sampleText = k.examples.firstOrNull()?.let { "${it.word} (${it.reading}): ${it.meaning}" } ?: ""
                list.add(
                    FlashcardItem(
                        id = "kanji_${k.id}",
                        type = FlashcardType.KANJI,
                        frontMain = k.kanji,
                        frontSub = "Hán Việt: ${k.hanViet}",
                        backMeaning = k.meaning,
                        backDetails = "$onKun\n${k.strokes} nét",
                        example = sampleText,
                        isMastered = isMastered,
                        isStarred = isStarred
                    )
                )
            }
        } else {
            val targetLessons = if (lessonNumber != null) {
                lessons.filter { it.lessonNumber == lessonNumber }
            } else {
                lessons
            }

            targetLessons.forEach { lesson ->
                lesson.vocabularies.forEach { v ->
                    val isMastered = masteredVocabIds.contains(v.id)
                    val isStarred = starredVocabIds.contains(v.id)
                    val frontSub = if (v.hanViet.isNotEmpty()) "【${v.hanViet}】・${v.reading}" else v.reading
                    list.add(
                        FlashcardItem(
                            id = "vocab_${v.id}",
                            type = FlashcardType.VOCABULARY,
                            frontMain = v.word,
                            frontSub = frontSub,
                            backMeaning = v.meaning,
                            backDetails = "Loại: ${v.type} | Romaji: ${v.romaji}",
                            example = if (v.exampleSentence.isNotEmpty()) "${v.exampleSentence}\n(${v.exampleSentenceMeaning})" else "",
                            isMastered = isMastered,
                            isStarred = isStarred
                        )
                    )
                }
            }
        }

        return list
    }
}
