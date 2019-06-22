package com.jetpack.leo.app

import android.app.Application
import com.jetpack.leo.cache.database.DatabaseManager

class MApplication:  Application() {

    override fun onCreate() {
        super.onCreate()
        DatabaseManager.updateDb(this)
    }
}