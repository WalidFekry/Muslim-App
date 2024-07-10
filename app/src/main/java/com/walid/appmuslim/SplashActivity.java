package com.walid.appmuslim;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;


import android.preference.PreferenceManager;
import android.view.MotionEvent;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;


/**
 * Created by IronCodes on 11.04.2019.
 * Website : http://ironcodes.tech/
 * "All rights reserved ©2014-2019"
 * Support & Emails : dev@ironcodes.tech , ironcodesdev@gmail.com
 */



public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                // Prepare an Interstitial Ad Listener

                Intent i = new Intent(SplashActivity.this, MainActivity.class);

                    startActivity(i);



                // close this activity
                finish();

            }
        }, SPLASH_TIME_OUT);

    }


}
