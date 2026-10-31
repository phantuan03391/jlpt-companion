package com.jlpt.n5.data

import android.content.Context
import android.content.SharedPreferences

actual object PlatformStorage {
    private var prefs: SharedPreferences? = null

    fun init(context: Context) {
        if (prefs == null) {
            prefs = context.applicationContext.getSharedPreferences("jlpt_n5_prefs", Context.MODE_PRIVATE)
        }
    }

    actual fun getString(key: String): String? {
        return prefs?.getString(key, null)
    }

    actual fun putString(key: String, value: String) {
        prefs?.edit()?.putString(key, value)?.apply()
    }

    actual fun currentTimeMillis(): Long = System.currentTimeMillis()
}
