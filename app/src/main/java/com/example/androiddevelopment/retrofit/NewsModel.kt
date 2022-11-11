package com.example.androiddevelopment.retrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NewsModel : ViewModel(){
    fun getTopHeadlines() {
        viewModelScope.launch {
            val response = NewsApi.retrofitService.getTopHeadline()
            Log.d("response", response)
        }
    }
}