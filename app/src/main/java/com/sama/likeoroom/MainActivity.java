package com.sama.likeoroom;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sama.likeoroom.database.CrudClass;
import com.sama.likeoroom.network.ServiceWrapper;
import com.sama.likeoroom.network.VideoBean;
import com.sama.likeoroom.network.VideolistResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static ArrayList<VideoBean> remoteDataList = new ArrayList<>();
    Button dataButton;
    CrudClass crudClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataButton = findViewById(R.id.dataButton);
        crudClass= new CrudClass();

        dataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                fetchVideoFromRemote();
                crudClass.getAllVideo();

            }
        });

    }


    private void fetchVideoFromRemote() {
        ServiceWrapper service = new ServiceWrapper(null);
        Call<VideolistResponse> call = service.getVideolist("12345");
        call.enqueue(new Callback<VideolistResponse>() {
            @Override
            public void onResponse(Call<VideolistResponse> call, Response<VideolistResponse> response) {
                Log.e(TAG, " response is " + response.body().getInformation().toString());
                if (response.body() != null && response.isSuccessful()) {
                    if (response.body().getStatus() == 1) {
                        if (response.body().getInformation().size() > 0) {
                            remoteDataList.clear();
                            for (int i = 0; i < response.body().getInformation().size(); i++) {
                                //  Toast.makeText(TikTokActivity.this, ""+response.body().getInformation().get(i).getUrlTh(), Toast.LENGTH_SHORT).show();
                                // response.body().getInformation().get(i).getUrlTh();

                                remoteDataList.add(new VideoBean(response.body().getInformation().get(i).getUser_id(),
                                        response.body().getInformation().get(i).getVideo_id(),
                                        response.body().getInformation().get(i).getUser_name(),
                                        response.body().getInformation().get(i).getVideo_title(),
                                        response.body().getInformation().get(i).getUrlVd(),
                                        response.body().getInformation().get(i).getUrlTh(),
                                        response.body().getInformation().get(i).getLikes(),
                                        response.body().getInformation().get(i).getDownloads(),
                                        response.body().getInformation().get(i).getProfile_pic()));

                                Log.i(TAG, "user_id: " + response.body().getInformation().get(i).getUser_id());
                                Log.i(TAG, "url:" + response.body().getInformation().get(i).getUrlVd());




                              /*  crudClass.saveVideoList(response.body().getInformation().get(i).getSno(),
                                        response.body().getInformation().get(i).getUser_id(),
                                        response.body().getInformation().get(i).getVideo_id(),
                                        response.body().getInformation().get(i).getStatus(),
                                        response.body().getInformation().get(i).getTimestamp(),
                                        response.body().getInformation().get(i).getUrlVd(),
                                        response.body().getInformation().get(i).getUrlTh(),
                                        response.body().getInformation().get(i).getLikes(),
                                        response.body().getInformation().get(i).getDownloads(),
                                        response.body().getInformation().get(i).getUser_name(),
                                        response.body().getInformation().get(i).getVideo_title(),
                                        response.body().getInformation().get(i).getProfile_pic()

                                        );*/

                              crudClass.saveVideo(response.body().getInformation().get(i).getSno(),
                                      response.body().getInformation().get(i).getUser_id(),
                                      response.body().getInformation().get(i).getUrlVd(),
                                      response.body().getInformation().get(i).getUrlTh(),
                                      response.body().getInformation().get(i).getVideo_id(),
                                      response.body().getInformation().get(i).getVideo_title(),
                                      response.body().getInformation().get(i).getLikes(),
                                      response.body().getInformation().get(i).getDownloads(),
                                      response.body().getInformation().get(i).getUser_name(),
                                      response.body().getInformation().get(i).getProfile_pic()
                                      );
                               /* crudClass.saveVideo("1","mm","sjj","9828",
                                        "nsx",8,9,"snn","ncn");*/
                                Log.d("manish", "onResponse: 124");


                            }


                        }
                    }
                } else {
                    Toast.makeText(MainActivity.this, "server error", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<VideolistResponse> call, Throwable t) {

            }
        });
    }
}
