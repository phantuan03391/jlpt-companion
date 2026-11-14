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

    // Persistent state across sessions
    val masteredVocabIds = mutableSetOf<Int>()
    val starredVocabIds = mutableSetOf<Int>()
    val masteredKanjiIds = mutableSetOf<Int>()
    val starredKanjiIds = mutableSetOf<Int>()
    val completedLessonNumbers = mutableSetOf<Int>()
    val examHistory = mutableListOf<ExamResult>()
    var streakDays: Int = 1
        private set
    var lastStudyDayEpoch: Long = 0L
        private set

    private const val KEY_USER_PROGRESS = "jlpt_n5_user_progress"

    init {
        loadFromStorage()
    }

    fun loadFromStorage() {
        try {
            val savedJson = PlatformStorage.getString(KEY_USER_PROGRESS)
            if (!savedJson.isNullOrBlank()) {
                val progress = json.decodeFromString<UserProgressData>(savedJson)
                masteredVocabIds.clear()
                masteredVocabIds.addAll(progress.masteredVocabIds)

                starredVocabIds.clear()
                starredVocabIds.addAll(progress.starredVocabIds)

                masteredKanjiIds.clear()
                masteredKanjiIds.addAll(progress.masteredKanjiIds)

                starredKanjiIds.clear()
                starredKanjiIds.addAll(progress.starredKanjiIds)

                completedLessonNumbers.clear()
                completedLessonNumbers.addAll(progress.completedLessonNumbers)

                examHistory.clear()
                examHistory.addAll(progress.examHistory)

                streakDays = progress.streakDays
                lastStudyDayEpoch = progress.lastStudyDayEpoch
            }
            updateStreakOnOpen()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun saveToStorage() {
        try {
            val progress = UserProgressData(
                masteredVocabIds = masteredVocabIds.toSet(),
                starredVocabIds = starredVocabIds.toSet(),
                masteredKanjiIds = masteredKanjiIds.toSet(),
                starredKanjiIds = starredKanjiIds.toSet(),
                completedLessonNumbers = completedLessonNumbers.toSet(),
                examHistory = examHistory.toList(),
                streakDays = streakDays,
                lastStudyDayEpoch = lastStudyDayEpoch
            )
            val jsonStr = json.encodeToString(UserProgressData.serializer(), progress)
            PlatformStorage.putString(KEY_USER_PROGRESS, jsonStr)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun updateStreakOnOpen() {
        val currentDay = PlatformStorage.currentTimeMillis() / (1000L * 60L * 60L * 24L)
        if (lastStudyDayEpoch == 0L) {
            lastStudyDayEpoch = currentDay
            streakDays = 1
            saveToStorage()
        } else if (currentDay > lastStudyDayEpoch + 1) {
            // Streak broken (more than 1 day missed)
            streakDays = 1
            lastStudyDayEpoch = currentDay
            saveToStorage()
        }
    }

    fun recordStudyActivity() {
        val currentDay = PlatformStorage.currentTimeMillis() / (1000L * 60L * 60L * 24L)
        if (lastStudyDayEpoch == 0L) {
            streakDays = 1
            lastStudyDayEpoch = currentDay
        } else if (currentDay == lastStudyDayEpoch + 1) {
            streakDays += 1
            lastStudyDayEpoch = currentDay
        } else if (currentDay > lastStudyDayEpoch + 1) {
            streakDays = 1
            lastStudyDayEpoch = currentDay
        }
        saveToStorage()
    }

    fun getLesson(number: Int): Lesson? = lessons.find { it.lessonNumber == number }

    fun getKanji(id: Int): KanjiItem? = kanjiList.find { it.id == id }

    fun getMockTest(id: String): MockTest? = mockTests.find { it.id == id }

    fun toggleMasteredVocab(id: Int): Boolean {
        val result = if (masteredVocabIds.contains(id)) {
            masteredVocabIds.remove(id)
            false
        } else {
            masteredVocabIds.add(id)
            true
        }
        recordStudyActivity()
        saveToStorage()
        return result
    }

    fun markVocabMastered(id: Int, mastered: Boolean = true) {
        if (mastered) {
            masteredVocabIds.add(id)
        } else {
            masteredVocabIds.remove(id)
        }
        recordStudyActivity()
        saveToStorage()
    }

    fun toggleStarredVocab(id: Int): Boolean {
        val result = if (starredVocabIds.contains(id)) {
            starredVocabIds.remove(id)
            false
        } else {
            starredVocabIds.add(id)
            true
        }
        saveToStorage()
        return result
    }

    fun toggleMasteredKanji(id: Int): Boolean {
        val result = if (masteredKanjiIds.contains(id)) {
            masteredKanjiIds.remove(id)
            false
        } else {
            masteredKanjiIds.add(id)
            true
        }
        recordStudyActivity()
        saveToStorage()
        return result
    }

    fun markKanjiMastered(id: Int, mastered: Boolean = true) {
        if (mastered) {
            masteredKanjiIds.add(id)
        } else {
            masteredKanjiIds.remove(id)
        }
        recordStudyActivity()
        saveToStorage()
    }

    fun toggleStarredKanji(id: Int): Boolean {
        val result = if (starredKanjiIds.contains(id)) {
            starredKanjiIds.remove(id)
            false
        } else {
            starredKanjiIds.add(id)
            true
        }
        saveToStorage()
        return result
    }

    fun markLessonCompleted(number: Int) {
        completedLessonNumbers.add(number)
        recordStudyActivity()
        saveToStorage()
    }

    fun toggleLessonCompleted(number: Int): Boolean {
        val result = if (completedLessonNumbers.contains(number)) {
            completedLessonNumbers.remove(number)
            false
        } else {
            completedLessonNumbers.add(number)
            true
        }
        recordStudyActivity()
        saveToStorage()
        return result
    }

    fun addExamResult(result: ExamResult) {
        examHistory.add(0, result)
        recordStudyActivity()
        saveToStorage()
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
                    val dictInfo = if (v.dictionaryForm.isNotEmpty()) " | Từ điển: ${v.dictionaryForm}" else ""
                    list.add(
                        FlashcardItem(
                            id = "vocab_${v.id}",
                            type = FlashcardType.VOCABULARY,
                            frontMain = v.word,
                            frontSub = frontSub,
                            backMeaning = v.meaning,
                            backDetails = "Loại: ${v.type}$dictInfo | Romaji: ${v.romaji}",
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
