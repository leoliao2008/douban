package com.skycaster.douban.util;

import android.widget.Toast;

import com.skycaster.douban.base.BaseApplication;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class ToastUtil {

    private static Toast toast;

    private ToastUtil(){};

    public static void showToast(String msg){
        if(toast==null){
            toast=Toast.makeText(BaseApplication.getContext(),msg,Toast.LENGTH_SHORT);
        }else {
            toast.setText(msg);
        }
        toast.show();
    }
}
