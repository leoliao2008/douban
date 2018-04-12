package com.skycaster.douban.activity;

import android.content.Context;
import android.content.Intent;

import com.skycaster.douban.base.BaseMVPActivity;
import com.skycaster.douban.presenter.MainPresenter;
import com.skycaster.douban.R;

public class MainActivity extends BaseMVPActivity<MainPresenter> {

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected MainPresenter bindPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int bindContentView() {
        return R.layout.activity_main;
    }


}
