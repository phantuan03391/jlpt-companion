package com.jlpt.n5.data

expect object PlatformStorage {
    fun getString(key: String): String?
    fun putString(key: String, value: String)
    fun currentTimeMillis(): Long
}
