package com.jetpack.leo.base

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel;
import com.jetpack.leo.server.HttpServerManager
import com.jetpack.leo.server.HttpService

abstract class BaseViewModel( val savedStateHandle: SavedStateHandle) : ViewModel() {
    fun getHttpService(): HttpService{
        return HttpServerManager.instance.getService()
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("lin","cleared=")
    }
}
