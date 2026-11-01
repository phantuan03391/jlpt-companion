package com.jlpt.n5.tts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import kotlinx.browser.window

class JsTextToSpeechManager : TextToSpeechManager {
    override fun speak(text: String, language: String) {
        try {
            val synth = window.asDynamic().speechSynthesis
            if (synth != null) {
                synth.cancel()
                val utterance = js("new SpeechSynthesisUtterance(text)")
                utterance.lang = language
                utterance.rate = 0.85
                synth.speak(utterance)
            }
        } catch (e: Throwable) {
            console.log("TTS error", e)
        }
    }

    override fun stop() {
        try {
            val synth = window.asDynamic().speechSynthesis
            synth?.cancel()
        } catch (e: Throwable) {}
    }
}

@Composable
actual fun rememberTextToSpeech(): TextToSpeechManager {
    return remember { JsTextToSpeechManager() }
}

