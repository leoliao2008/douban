package com.skycaster.douban.util;

import android.util.Log;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class LogUtil {
    private LogUtil(){}
    public static void showLog(String tag,String msg){
        Log.e(tag,msg);
    }
}
