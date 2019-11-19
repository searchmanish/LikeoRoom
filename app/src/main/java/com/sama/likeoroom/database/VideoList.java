package com.sama.likeoroom.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class VideoList implements Serializable {



    @PrimaryKey
    private int sno;

    @ColumnInfo(name = "video_title")
    private String video_title;

    @ColumnInfo(name = "url")
    private String url;

    @ColumnInfo(name = "thumb")
    private String thumb;

    @ColumnInfo(name = "video_id")
    private String video_id;

    @ColumnInfo(name = "user_id")
    private String user_id;

    @ColumnInfo(name = "user_name")
    private String user_name;

    @ColumnInfo(name = "profile_pic")
    private String profile_pic;

    @ColumnInfo(name = "likes")
    private Integer likes;

    @ColumnInfo(name = "downloads")
    private Integer downloads;


    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }
}
