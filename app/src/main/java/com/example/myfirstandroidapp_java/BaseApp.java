package com.example.myfirstandroidapp_java;

import android.app.Application;

import com.onesignal.OneSignal;

public class BaseApp extends Application {

    private static final String ONESIGNAL_APP_ID = "547645cb-f35e-42ed-94e4-f04ca3cdfdea";

    @Override
    public void onCreate() {
      super.onCreate();
        // Enable verbose OneSignal logging to debug issues if needed.
        // It is recommended you remove this after validating your implementation.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}