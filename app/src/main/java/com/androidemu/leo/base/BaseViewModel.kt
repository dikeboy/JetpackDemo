package com.androidemu.leo.base

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel;
import com.androidemu.leo.server.HttpServerManager
import com.androidemu.leo.server.HttpService

abstract class BaseViewModel( val savedStateHandle: SavedStateHandle) : ViewModel() {
    fun getHttpService(): HttpService{
        return HttpServerManager.instance.getService()
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("lin","cleared=")
    }
}
