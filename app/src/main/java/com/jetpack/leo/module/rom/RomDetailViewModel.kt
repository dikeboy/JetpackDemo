package com.jetpack.leo.module.rom

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.jetpack.leo.base.BaseViewModel
import com.jetpack.leo.cache.database.DatabaseManager
import kotlinx.coroutines.launch

class RomDetailViewModel (savedHandle: SavedStateHandle) : BaseViewModel(savedHandle) {
    init {
        Log.e("lin","name="+savedHandle.get("name"))
    }


    fun getData(){
        viewModelScope.launch {
            DatabaseManager.database?.contriousDao()?.let {
                var list = it.list(0,10)

                list.forEach {
                    Log.e("lin","item="+it.key+":"+it.value)
                }
            }
        }
    }
}

