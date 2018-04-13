package com.skycaster.douban.module;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by 廖华凯 on 2018/4/13.
 * https://blog.csdn.net/tianmaxingkong_/article/details/52102002
 */

public class NetConStateModule {
    private Context mContext;
    private ConnectivityManager mManager;

    public NetConStateModule(Context context) {
        mContext = context;
        mManager= (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    public boolean isNetConnected(){
        NetworkInfo info = mManager.getActiveNetworkInfo();
        if(info!=null){
            try {
                return info.isConnected();
            }catch (Exception e){
                return false;
            }

        }
        return false;
    }
}
