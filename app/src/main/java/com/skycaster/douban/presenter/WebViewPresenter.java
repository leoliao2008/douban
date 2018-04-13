package com.skycaster.douban.presenter;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;

import com.skycaster.douban.activity.WebViewActivity;
import com.skycaster.douban.base.BaseApplication;
import com.skycaster.douban.base.BasePresenter;
import com.skycaster.douban.module.NetConStateModule;
import com.skycaster.douban.module.WebViewModule;

/**
 * Created by 廖华凯 on 2018/4/13.
 */

public class WebViewPresenter extends BasePresenter<WebViewActivity> {
    private WebView mWebView;
    private WebViewModule mWebViewModule;
    private NetConStateModule mNetStateModule;

    public WebViewPresenter(WebViewActivity activity) {
        super(activity);
    }

    @Override
    public void onCreate() {
        mNetStateModule=new NetConStateModule(getActivity());
        mWebView=new WebView(BaseApplication.getContext());
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        getActivity().getRootView().addView(mWebView,params);
        mWebViewModule=new WebViewModule(mWebView);
        mWebViewModule.initWebViewSetting(mNetStateModule.isNetConnected());
    }

    public void loadUrl(String url){
        mWebViewModule.loadUrl(url);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {
        mWebViewModule.onResume();

    }

    @Override
    public void onPause() {
        mWebViewModule.onPause();

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        mWebViewModule.onDestroy();

    }
}
