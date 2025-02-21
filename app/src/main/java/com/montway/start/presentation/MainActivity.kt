package com.montway.start.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.montway.start.presentation.theme.StartTheme
import com.montway.start.presentation.ui.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StartTheme {
                MainScreen()
            }
        }
    }
}