package com.jetpack.leo.module.rom

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.jetpack.leo.base.BaseViewModel
import com.jetpack.leo.cache.database.DatabaseManager
import com.jetpack.leo.cache.database.LogDbEntity
import kotlinx.coroutines.launch
import java.util.*

class RomListViewModel (var savedHandle: SavedStateHandle) : BaseViewModel(savedHandle) {

    fun loadData(){
        viewModelScope.launch {
//           var result =   getHttpService().getBaiduData(1)
//            Log.e("lin","result="+result.string())
        }
    }

    fun saveData(){
        viewModelScope.launch {
//                DatabaseManager.database?.contriousDao()?.let {
//                    it.deleteAll()
//                    for (i in 0..10) {
//                        var entity = LogDbEntity()
//                        entity.key = "key$i"
//                        entity.value = "value$i"
//                        entity.addtime = Date().toString()
//                        it.insert(entity)
//                    }
//                }
        }
    }
}
