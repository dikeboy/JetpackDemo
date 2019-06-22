package com.jetpack.leo.cache.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@Dao
public interface LogDbDao {
    public static final String  TABLE_NAME ="logcache";

    @Insert
    public void insert(LogDbEntity... entity);

    @Query("SELECT * from "+TABLE_NAME+" order by id desc LIMIT :start,:end ")
    public List<LogDbEntity> list(int start, int end);

    @Delete
    public void delete(LogDbEntity... users);

    @Query("delete  from "+TABLE_NAME+" where ckey = :ckey ")
    public void deleteAll(String ckey);
}
