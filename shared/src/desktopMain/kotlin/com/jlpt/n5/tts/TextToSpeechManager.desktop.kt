package com.jlpt.n5.tts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

class DesktopTextToSpeechManager : TextToSpeechManager {
    private var currentProcess: Process? = null

    override fun speak(text: String, language: String) {
        stop()
        try {
            val os = System.getProperty("os.name")?.lowercase() ?: ""
            if (os.contains("mac")) {
                // Kyoko is the high quality built-in Japanese voice on macOS
                val pb = ProcessBuilder("say", "-v", "Kyoko", "-r", "160", text)
                currentProcess = pb.start()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun stop() {
        try {
            currentProcess?.destroyForcibly()
            currentProcess = null
        } catch (_: Exception) {}
    }
}

@Composable
actual fun rememberTextToSpeech(): TextToSpeechManager {
    return remember { DesktopTextToSpeechManager() }
}

