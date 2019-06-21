package com.androidemu.leo.module.rom

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.androidemu.leo.base.BaseViewModel
import com.androidemu.leo.server.HttpServerManager
import com.androidemu.leo.server.HttpService
import kotlinx.coroutines.launch

class RomListViewModel (var savedHandle: SavedStateHandle) : BaseViewModel(savedHandle) {
    init {
        savedStateHandle.set("name","zhangshan")
    }

    fun printName(){
        Log.e("lin","name="+savedHandle.get("name"))
    }

    fun loadData(){
        viewModelScope.launch {
           var result =   getHttpService().getBaiduData(1)
//            Log.e("lin","result="+result.string())
        }
    }
}
