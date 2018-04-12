package com.skycaster.douban.util;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.skycaster.douban.Static;

/**
 * Created by 廖华凯 on 2018/4/10.
 * http://loopj.com/android-async-http/
 */

public class AsynchHttpUtils {

    private AsynchHttpUtils(){super();}

    public static void getNews(String newsType,AsyncHttpResponseHandler handler){
        RequestParams params=new RequestParams();
        params.put("type",newsType);
        params.put("key", Static.APP_KEY_FOR_NEWS);
        new AsyncHttpClient().post(Static.BASE_URL_FOR_NEWS, params,handler);
    }



}
