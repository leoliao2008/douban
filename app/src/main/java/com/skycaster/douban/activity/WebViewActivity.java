package com.skycaster.douban.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.skycaster.douban.R;
import com.skycaster.douban.Static;
import com.skycaster.douban.base.BaseMVPActivity;
import com.skycaster.douban.presenter.WebViewPresenter;

import butterknife.BindView;


/**
 * 一个基于webview的浏览器，可以浏览新闻
 * https://blog.csdn.net/carson_ho/article/details/52693322
 */
public class WebViewActivity extends BaseMVPActivity<WebViewPresenter> {
    @BindView(R.id.root_view)
    FrameLayout mRootView;
    private String mUrl;

    public static void start(Context context, String url) {
        Intent starter = new Intent(context, WebViewActivity.class);
        starter.putExtra(Static.NEWS_WEB_SITE, url);
        context.startActivity(starter);
    }


    @Override
    protected int bindContentView() {
        return R.layout.activity_web_view;
    }

    @Override
    protected WebViewPresenter bindPresenter() {
        return new WebViewPresenter(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUrl = getIntent().getStringExtra(Static.NEWS_WEB_SITE);
        getPresenter().loadUrl(mUrl);
    }

    public FrameLayout getRootView() {
        return mRootView;
    }
}
