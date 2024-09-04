package com.montway.start.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.montway.start.presentation.theme.StartTheme
import com.montway.start.presentation.ui.HomeViewModel
import com.montway.start.presentation.ui.MainScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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