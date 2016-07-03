package com.examplelayout.sawyunwe297.padclayout;

import android.app.Application;
import android.content.Context;

/**
 * Created by Saw Yu Nwe on 6/18/2016.
 */
public class PADClayoutApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.getApplicationContext();//run yin htwet lar mae instance variable
    }

    //getter function htae pae


    public static Context getContext() {
        return context;
    }
}
