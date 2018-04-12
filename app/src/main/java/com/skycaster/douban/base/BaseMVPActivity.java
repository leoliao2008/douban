package com.skycaster.douban.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public abstract class BaseMVPActivity<P extends BasePresenter> extends BaseActivity {
    private P mPresenter;
    protected abstract P bindPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter=bindPresenter();
        mPresenter.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    protected P getPresenter() {
        return mPresenter;
    }
}
