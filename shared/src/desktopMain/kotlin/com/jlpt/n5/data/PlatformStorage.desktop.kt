package com.jlpt.n5.data

import java.util.prefs.Preferences

actual object PlatformStorage {
    private val prefs: Preferences by lazy {
        Preferences.userNodeForPackage(PlatformStorage::class.java)
    }

    actual fun getString(key: String): String? {
        return try {
            prefs.get(key, null)
        } catch (e: Exception) {
            null
        }
    }

    actual fun putString(key: String, value: String) {
        try {
            prefs.put(key, value)
            prefs.flush()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    actual fun currentTimeMillis(): Long = System.currentTimeMillis()
}
