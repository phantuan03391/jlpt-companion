package com.jlpt.n5.tts

import android.content.Context
import android.speech.tts.TextToSpeech
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import java.util.Locale

class AndroidTextToSpeechManager(context: Context) : TextToSpeechManager {
    private var tts: TextToSpeech? = null
    private var isInitialized = false

    init {
        tts = TextToSpeech(context) { status ->
            if (status == TextToSpeech.SUCCESS) {
                isInitialized = true
                tts?.language = Locale.JAPANESE
                tts?.setSpeechRate(0.85f) // Optimal speed for learners
            }
        }
    }

    override fun speak(text: String, language: String) {
        if (isInitialized) {
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "jlpt_tts_${System.currentTimeMillis()}")
        }
    }

    override fun stop() {
        tts?.stop()
    }

    fun release() {
        tts?.stop()
        tts?.shutdown()
    }
}

@Composable
actual fun rememberTextToSpeech(): TextToSpeechManager {
    val context = LocalContext.current.applicationContext
    val manager = remember(context) { AndroidTextToSpeechManager(context) }
    DisposableEffect(manager) {
        onDispose {
            manager.release()
        }
    }
    return manager
}

