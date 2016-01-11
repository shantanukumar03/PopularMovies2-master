package com.app.popularmovies.application;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by shantanu.
 */
public class PopularmoviesApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
