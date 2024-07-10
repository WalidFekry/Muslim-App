package com.walid.appmuslim;

import android.app.Application;




/**
 * Created by IronCodes on 11.04.2019.
 * Website : http://ironcodes.tech/
 * "All rights reserved ©2014-2019"
 * Support & Emails : dev@ironcodes.tech , ironcodesdev@gmail.com
 */


public class MyApplication extends Application {
    public static final String TAG = MyApplication.class
            .getSimpleName();

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

     
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }







}