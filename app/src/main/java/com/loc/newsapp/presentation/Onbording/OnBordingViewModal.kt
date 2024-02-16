package com.loc.newsapp.presentation.Onbording

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loc.newsapp.domain.manager.usecase.AppEntryUseCases
import com.loc.newsapp.domain.manager.usecase.SaveAppEntry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBordingViewModal @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
):ViewModel(){

fun OnEvent(event: OnBordingEvent){
    when(event){
        is OnBordingEvent.SaveAppEntry ->{
            SaveAppEntry()
        }
    }
}

    private fun SaveAppEntry() {
      //  TODO("Not yet implemented")
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry
        }
    }


}