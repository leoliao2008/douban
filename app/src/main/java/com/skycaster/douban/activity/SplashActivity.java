package com.skycaster.douban.activity;

import com.skycaster.douban.base.BaseActivity;
import com.skycaster.douban.base.BaseApplication;
import com.skycaster.douban.R;

public class SplashActivity extends BaseActivity {
    @Override
    protected int bindContentView() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onResume() {
        super.onResume();
        BaseApplication.postDelay(new Runnable() {
            @Override
            public void run() {
                MainActivity.start(SplashActivity.this);
                SplashActivity.this.finish();
            }
        },500);
    }
}
