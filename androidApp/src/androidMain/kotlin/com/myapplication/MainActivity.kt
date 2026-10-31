package com.myapplication

import MainView
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.data.PlatformStorage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PlatformStorage.init(applicationContext)
        JLPTRepository.loadFromStorage()

        setContent {
            MainView()
        }
    }
}
