package com.jlpt.n5.data

import platform.Foundation.NSDate
import platform.Foundation.NSUserDefaults
import platform.Foundation.timeIntervalSince1970

actual object PlatformStorage {
    actual fun getString(key: String): String? {
        return try {
            NSUserDefaults.standardUserDefaults.stringForKey(key)
        } catch (e: Exception) {
            null
        }
    }

    actual fun putString(key: String, value: String) {
        try {
            NSUserDefaults.standardUserDefaults.setObject(value, forKey = key)
            NSUserDefaults.standardUserDefaults.synchronize()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    actual fun currentTimeMillis(): Long {
        return (NSDate().timeIntervalSince1970 * 1000.0).toLong()
    }
}
