package com.sama.likeoroom.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface VideoListDao {

    @Query("SELECT * FROM `VideoList`")
    List<VideoList> getAllVideo();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(VideoList videoList);

    @Update
    void  update(VideoList videoList);

    @Delete
    void delete(VideoList videoList);

}
