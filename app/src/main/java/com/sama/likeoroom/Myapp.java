package com.sama.likeoroom;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public class Myapp extends Application {

    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
    public static Context getContext() {
        return context;
    }
}
