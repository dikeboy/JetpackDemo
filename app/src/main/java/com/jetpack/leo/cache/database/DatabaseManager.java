package com.jetpack.leo.cache.database;

import android.app.Application;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class DatabaseManager {
    public  static ContriousDatabase database;

    public static void updateDb(Application application){
        database = Room.databaseBuilder(application, ContriousDatabase.class, "vova_log_cache.db")
                .build();
    }



    private static Migration migration = new Migration(1,2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE `logcache` (`id` INTEGER, "
                    +" `ckey` Text,"
                    + "`value` TEXT, `addtime` Text, PRIMARY KEY(`id`))");
        }
    };

}
