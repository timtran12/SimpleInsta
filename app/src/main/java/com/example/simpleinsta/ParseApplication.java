package com.example.simpleinsta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nHX9k9hm8jaQVhIZnZlfWCQKqTPNdBonJfGGVuNR")
                .clientKey("14n10bomwQpbJT7fb13W0PjLN5XJ89F3s4oQ2yx7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
