package com.sama.likeoroom.network;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideolistResponse {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("Information")
    @Expose
    private List<Information> information = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public VideolistResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public VideolistResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public List<Information> getInformation() {
        return information;
    }

    public void setInformation(List<Information> information) {
        this.information = information;
    }

    public VideolistResponse withInformation(List<Information> information) {
        this.information = information;
        return this;
    }

    public class Information {

        @SerializedName("sno")
        @Expose
        private Integer sno;
        @SerializedName("video_id")
        @Expose
        private String video_id;
        @SerializedName("user_id")
        @Expose
        private String user_id;
        @SerializedName("url_vd")
        @Expose
        private String urlVd;
        @SerializedName("url_th")
        @Expose
        private String urlTh;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;

        @SerializedName("likes")
        @Expose
        private Integer likes;

        @SerializedName("downloads")
        @Expose
        private Integer downloads;
        @SerializedName("user_name")
        @Expose
        private String user_name;
        @SerializedName("video_title")
        @Expose
        private String video_title;
        @SerializedName("profile_pic")
        @Expose
        private String profile_pic;

        public Integer getSno() {
            return sno;
        }

        public void setSno(Integer sno) {
            this.sno = sno;
        }

        public Information withSno(Integer sno) {
            this.sno = sno;
            return this;
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

        public String getUrlVd() {
            return urlVd;
        }

        public void setUrlVd(String urlVd) {
            this.urlVd = urlVd;
        }

        public Information withUrlVd(String urlVd) {
            this.urlVd = urlVd;
            return this;
        }

        public String getUrlTh() {
            return urlTh;
        }

        public void setUrlTh(String urlTh) {
            this.urlTh = urlTh;
        }

        public Information withUrlTh(String urlTh) {
            this.urlTh = urlTh;
            return this;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Information withStatus(String status) {
            this.status = status;
            return this;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public Integer getLikes() {
            return likes;
        }

        public Integer getDownloads() {
            return downloads;
        }

        public void setDownloads(Integer downloads) {
            this.downloads = downloads;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
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

        public String getProfile_pic() {
            return profile_pic;
        }

        public void setProfile_pic(String profile_pic) {
            this.profile_pic = profile_pic;
        }

        public Information withTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

    }

}

