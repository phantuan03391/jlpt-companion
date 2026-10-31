package com.jlpt.n5.tts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

interface TextToSpeechManager {
    fun speak(text: String, language: String = "ja-JP")
    fun stop()
}

val LocalTTS = staticCompositionLocalOf<TextToSpeechManager> {
    object : TextToSpeechManager {
        override fun speak(text: String, language: String) {}
        override fun stop() {}
    }
}

@Composable
expect fun rememberTextToSpeech(): TextToSpeechManager

