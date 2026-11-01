package com.jlpt.n5.data

import kotlinx.browser.localStorage
import kotlin.js.Date

actual object PlatformStorage {
    actual fun getString(key: String): String? {
        return try {
            localStorage.getItem(key)
        } catch (e: Throwable) {
            null
        }
    }

    actual fun putString(key: String, value: String) {
        try {
            localStorage.setItem(key, value)
        } catch (e: Throwable) {
            e.printStackTrace()
        }
    }

    actual fun currentTimeMillis(): Long = Date.now().toLong()
}

