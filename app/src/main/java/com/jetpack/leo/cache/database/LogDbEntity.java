package com.jetpack.leo.cache.database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "logcache")
public class LogDbEntity {
    public LogDbEntity(){

    }
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "ckey")
    public String key;

    @ColumnInfo(name = "value")
    public String value;

    @ColumnInfo(name="addtime")
    public String addtime;

    @Override
    public boolean equals( Object obj) {
        if(obj!=null&&obj instanceof  LogDbEntity){
            LogDbEntity lde =(LogDbEntity)obj;
            if(lde.key!=null&&lde.key.equals(this.key)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        String str = String.format("id=%s,ckey=%s,value=%s,addtime=%s",id,key,value,addtime);
        return str.toString();
    }
}
