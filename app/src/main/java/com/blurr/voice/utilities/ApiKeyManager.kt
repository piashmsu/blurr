package com.blurr.voice.utilities

import android.content.Context
import com.blurr.voice.BuildConfig
import com.blurr.voice.MyApplication
import java.util.concurrent.atomic.AtomicInteger

/**
 * A thread-safe, singleton object to manage and rotate a list of API keys.
 * Keys are read from SharedPreferences (user-provided) with fallback to BuildConfig.
 */
object ApiKeyManager {

    private const val PREFS_NAME = "BlurrSettings"
    const val KEY_GEMINI_API_KEYS = "gemini_api_keys"

    private val currentIndex = AtomicInteger(0)

    private fun getApiKeys(): List<String> {
        val prefs = MyApplication.appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val userKeys = prefs.getString(KEY_GEMINI_API_KEYS, null)
        if (!userKeys.isNullOrBlank()) {
            return userKeys.split(",").map { it.trim() }.filter { it.isNotEmpty() }
        }
        return if (BuildConfig.GEMINI_API_KEYS.isNotEmpty()) {
            BuildConfig.GEMINI_API_KEYS.split(",")
        } else {
            emptyList()
        }
    }

    fun getNextKey(): String {
        val keys = getApiKeys()
        if (keys.isEmpty()) {
            throw IllegalStateException("API key list is empty. Please add keys in Settings.")
        }
        val index = currentIndex.getAndIncrement() % keys.size
        return keys[index]
    }
}