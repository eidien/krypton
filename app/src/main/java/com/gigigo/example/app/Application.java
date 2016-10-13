package com.gigigo.example.app;

import android.os.Build;

import com.gigigo.example.BuildConfig;

import kripton.extensions.retrofit.RetrofitFactoryService;

/**
 * Created by Daniel on 12/10/2016.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitFactoryService.initialize(BuildConfig.HOST_APP);
    }
}
