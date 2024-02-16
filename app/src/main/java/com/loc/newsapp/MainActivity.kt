package com.loc.newsapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.lifecycleScope
import com.loc.newsapp.domain.manager.usecase.AppEntryUseCases
import com.loc.newsapp.presentation.Common.NewsButton
import com.loc.newsapp.presentation.Onbording.OnBordingScreen
import com.loc.newsapp.presentation.Onbording.OnBordingViewModal
import com.loc.newsapp.presentation.Onbording.components.OnBordingPage
import com.loc.newsapp.presentation.Onbording.pages
import com.loc.newsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var useCases : AppEntryUseCases
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        installSplashScreen()
        lifecycleScope.launch{
            useCases.readAppEntry().collect{
                Log.d("test",it.toString())
            }
        }
        setContent {
            NewsAppTheme {


                //   OnBordingPage(modifier = Modifier, page = pages[0])
   val viewModal:OnBordingViewModal = hiltViewModel()

                OnBordingScreen(
                    event = viewModal::OnEvent
                )


            }
        }
    }
}
