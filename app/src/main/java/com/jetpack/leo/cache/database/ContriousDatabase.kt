package com.jetpack.leo.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LogDbEntity::class], version = 1, exportSchema = false)
abstract class ContriousDatabase : RoomDatabase() {
    abstract fun logDao(): LogDbDao

   abstract  fun contriousDao(): ContriousDao
}