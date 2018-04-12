package com.skycaster.douban.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.skycaster.douban.util.LogUtil;
import com.skycaster.douban.util.ToastUtil;

import butterknife.ButterKnife;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private String mTag;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mTag=getClass().getSimpleName();
        super.onCreate(savedInstanceState);
        setContentView(bindContentView());
        ButterKnife.bind(this);
    }

    protected abstract int bindContentView();

    protected void showLog(String msg){
        LogUtil.showLog(mTag,msg);
    }

    protected void showToast(String msg){
        ToastUtil.showToast(msg);
    }

}
