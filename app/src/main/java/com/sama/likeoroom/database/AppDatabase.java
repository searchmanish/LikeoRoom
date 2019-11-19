package com.sama.likeoroom.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {VideoList.class},version = 1,exportSchema = true)
public abstract class AppDatabase extends RoomDatabase {
    public abstract VideoListDao videoListDao();
}
