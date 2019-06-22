package com.jetpack.leo.cache.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
abstract class  ContriousDao {

    @Insert
    abstract suspend fun insert(entity: LogDbEntity)

    @Query("SELECT * from logcache order by id desc LIMIT :start,:end ")
    abstract suspend fun list(start: Int, end: Int): List<LogDbEntity>

    @Delete
    abstract suspend fun delete(vararg users: LogDbEntity)

    @Query("delete  from logcache")
    abstract suspend fun deleteAll()
}
