package com.sama.likeoroom.database;

import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import com.sama.likeoroom.Myapp;

import java.util.List;

public class CrudClass {
    private static final String TAG = "CrudClass";

    public void getAllVideo() {

        class GetVideoClass extends AsyncTask<Void, Void, List<VideoList>> {
            @Override
            protected List<VideoList> doInBackground(Void... voids) {

                List<VideoList> videoLists = DatabaseClient.getInstance(Myapp.getContext())
                        .getAppDatabase()
                        .videoListDao()
                        .getAllVideo();
                return videoLists;
            }

            @Override
            protected void onPostExecute(List<VideoList> videoLists) {
                super.onPostExecute(videoLists);
                Toast.makeText(Myapp.getContext(), "videourl:" + videoLists.get(0).getUrl(), Toast.LENGTH_SHORT).show();
                Toast.makeText(Myapp.getContext(), "sno:" + videoLists.get(0).getSno(), Toast.LENGTH_SHORT).show();

            }
        }

        GetVideoClass getVideoClass = new GetVideoClass();
        getVideoClass.execute();
    }


    public void saveVideo(Integer sno,String user_id, String url, String thumb,
                          String video_id, String video_title,
                          Integer likes, Integer downloads,
                          String user_name, String profile_pic) {

        class SaveData extends AsyncTask<Void, Void, Void> {

            @Override
            protected Void doInBackground(Void... voids) {

                VideoList videoList = new VideoList();
                videoList.setSno(sno);
                videoList.setUser_id(user_id);
                videoList.setUrl(url);
                videoList.setThumb(thumb);
                videoList.setVideo_id(video_id);
                videoList.setVideo_title(video_title);
                videoList.setLikes(likes);
                videoList.setDownloads(downloads);
                videoList.setUser_name(user_name);
                videoList.setProfile_pic(profile_pic);

                DatabaseClient.getInstance(Myapp.getContext())
                        .getAppDatabase()
                        .videoListDao()
                        .insert(videoList);

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
            }
        }

        SaveData saveData = new SaveData();
        saveData.execute();
    }
}
