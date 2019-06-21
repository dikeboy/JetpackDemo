package com.androidemu.leo.cache.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {LogDbEntity.class},
        version = 1)
public abstract class LogDatabase extends RoomDatabase {

    public abstract LogDbDao logDao();

}