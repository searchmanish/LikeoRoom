package com.sama.likeoroom.network;

/**
 * Created by Devlin_n on 2017/6/1.
 */

public class VideoBean {

    private String video_title;
    private String url;
    private String thumb;
    private String video_id;
    private String user_id;
    private Integer likes;
    private Integer downloads;
    private String user_name;
    private String profile_pic;

    public VideoBean(String user_id, String video_id, String user_name, String video_title, String url, String thumb, Integer likes, Integer downloads, String profile_pic) {
        this.user_id = user_id;
        this.video_id = video_id;
        this.user_name=user_name;
        this.video_title = video_title;
        this.url = url;
        this.thumb = thumb;
        this.likes = likes;
        this.downloads=downloads;
        this.profile_pic=profile_pic;


    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }
}
