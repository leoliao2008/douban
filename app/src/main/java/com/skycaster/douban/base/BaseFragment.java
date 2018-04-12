package com.skycaster.douban.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.skycaster.douban.util.LogUtil;
import com.skycaster.douban.util.ToastUtil;

/**
 * Created by 廖华凯 on 2018/4/12.
 */

public class BaseFragment extends Fragment {
    private String mTag;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag=getClass().getSimpleName();
    }

    protected void showLog(String msg){
        LogUtil.showLog(mTag,msg);
    }

    protected void showToast(String msg){
        ToastUtil.showToast(msg);
    }
}
