package com.jetpack.leo.cache.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {LogDbEntity.class},
        version = 1, exportSchema = false)
public abstract class LogDatabase extends RoomDatabase {

    public abstract LogDbDao logDao();

    public abstract  ContriousDao contriousDao();

}