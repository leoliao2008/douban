package com.skycaster.douban.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;

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
        initWebCache();//设置webview缓存模式，因为每个app只能设置一次，所以在这里设置

    }

    private void initWebCache() {
        String cachePath = getFilesDir().getAbsolutePath() + "webview_cache";
        WebSettings settings = new WebView(this).getSettings();
        settings.setAppCachePath(cachePath);
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
