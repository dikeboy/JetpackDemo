package com.jetpack.leo.module.rom

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import com.jetpack.leo.base.BaseViewModel

class RomDetailViewModel (savedHandle: SavedStateHandle) : BaseViewModel(savedHandle) {
    init {
        Log.e("lin","name="+savedHandle.get("name"))
    }


}
