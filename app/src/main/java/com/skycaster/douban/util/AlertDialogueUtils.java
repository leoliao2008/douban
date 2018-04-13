package com.skycaster.douban.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.skycaster.douban.R;

/**
 * Created by 廖华凯 on 2018/4/13.
 */

public class AlertDialogueUtils {

    private static ProgressDialog progressDialog;

    private AlertDialogueUtils(){}

    public static void showProgressDialogue(Activity context, @Nullable String title, @Nullable String msg, boolean cancelable){
        progressDialog = new ProgressDialog(context);
        if(!TextUtils.isEmpty(title)){
            progressDialog.setTitle(context.getResources().getString(R.string.loading));
        }
        if(!TextUtils.isEmpty(msg)){
            progressDialog.setMessage(msg);
        }
        progressDialog.setCancelable(cancelable);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
    }

    public static void dismissProgressDialogue(){
        if(progressDialog!=null&&progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }
}
