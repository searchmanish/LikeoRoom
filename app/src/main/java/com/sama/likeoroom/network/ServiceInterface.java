package com.sama.likeoroom.network;



import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ServiceInterface {
    //http://softcodeinfotech.com/tiktest/get_videolist.php
    @Multipart
    @POST("tiktest/get_videolist.php")
    Call<VideolistResponse> getVideolistCall(
            @Part("securecode") RequestBody securecode
    );


}
