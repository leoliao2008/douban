package com.skycaster.douban.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.skycaster.douban.R;
import com.skycaster.douban.Static;
import com.skycaster.douban.base.BaseActivity;

import butterknife.BindView;


public class WebViewActivity extends BaseActivity {
    @BindView(R.id.web_view)
    WebView mWebView;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUrl = getIntent().getStringExtra(Static.NEWS_WEB_SITE);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl(mUrl);
    }
}
