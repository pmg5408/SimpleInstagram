package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("V8ETtALOZBDEDFcgNNdpI7Bb8wbHfWQRZE6XxxR3")
                .clientKey("i16kOsZzf3AzPDwbuzBXISm9Z7FZXbfd39UR7mkI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
