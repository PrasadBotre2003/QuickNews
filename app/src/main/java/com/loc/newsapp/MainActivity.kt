package com.loc.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.loc.newsapp.presentation.Common.NewsButton
import com.loc.newsapp.presentation.Onbording.OnBordingScreen
import com.loc.newsapp.presentation.Onbording.components.OnBordingPage
import com.loc.newsapp.presentation.Onbording.pages
import com.loc.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            NewsAppTheme {
                OnBordingPage(modifier = Modifier, page = pages[0])
OnBordingScreen()


            }
        }
    }
}
