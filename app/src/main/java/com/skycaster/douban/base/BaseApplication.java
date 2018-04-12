package com.skycaster.douban.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class BaseApplication extends Application{
    private static Context context;
    private static Handler handler;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);//初始化fresco
        context=getApplicationContext();
        handler=new Handler();
    }
    public static Context getContext(){
        return context;
    }
    public static void post(Runnable runnable){
        handler.post(runnable);
    }
    public static void postDelay(Runnable runnable,long millis){
        handler.postDelayed(runnable, millis);
    }
    public static void removeCallbacks(Runnable runnable){
        handler.removeCallbacks(runnable);
    }
}
