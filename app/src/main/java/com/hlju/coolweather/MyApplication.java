package com.hlju.coolweather;

import android.app.Application;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.litepal.LitePal;

/** The Application class that manages AppOpenManager. */
public class MyApplication extends Application {
    private static AppOpenManager appOpenManager;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        MobileAds.initialize(
                this,
                new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus initializationStatus) {}
                });
        appOpenManager = new AppOpenManager(this);
    }
}