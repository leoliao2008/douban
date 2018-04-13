package com.skycaster.douban.module;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by 廖华凯 on 2018/4/13.
 * https://blog.csdn.net/carson_ho/article/details/52693322
 */

public class WebViewModule {
    private WebView mWebView;

    public WebViewModule(WebView webView) {
        mWebView = webView;
    }

    public void initWebViewSetting(boolean isNewWorkAvailable){
        //声明WebSettings子类
        final WebSettings webSettings = mWebView.getSettings();
        //如果访问的页面中要与Javascript交互，则webview必须设置支持Javascript
        webSettings.setJavaScriptEnabled(true);
        //设置自适应屏幕，两者合用
        webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
        webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小
        //缩放操作
        webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
        webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
        webSettings.setDisplayZoomControls(false); //隐藏原生的缩放控件
        //其他细节操作
        if(isNewWorkAvailable){
            webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);////根据cache-control决定是否从网络上取数据。
        }else {
            webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //只要本地有，无论是否过期，或者no-cache，都使用缓存中的数据。
        }

        webSettings.setAllowFileAccess(true); //设置可以访问文件
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true); //支持通过JS打开新窗口
        webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
        webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式

        webSettings.setDomStorageEnabled(true); // 开启 DOM storage API 功能
        webSettings.setDatabaseEnabled(true);   //开启 database storage API 功能
        webSettings.setAppCacheEnabled(true);//开启 Application Caches 功能


        mWebView.setWebViewClient(new WebViewClient(){
            //复写shouldOverrideUrlLoading()方法，使得打开网页时不调用系统浏览器， 而是在本WebView中显示
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
            }

            @Override
            public void onPageFinished(WebView view, String url) {
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view,errorCode,description,failingUrl);
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
          //看需要而定
//        mWebView.setWebChromeClient(new WebChromeClient(){
//        });
    }


      //每个 Application 只调用一次 WebSettings.setAppCachePath()，WebSettings.setAppCacheMaxSize()
//    private void initWebCache() {
//        String cachePath = getFilesDir().getAbsolutePath() + "webview_cache";
//        WebSettings settings = new WebView(this).getSettings();
//        settings.setAppCachePath(cachePath);
//    }

    public void onPause(){
        mWebView.onPause();
    }

    public void onResume(){
        mWebView.onResume();
    }

    /**
     * 安全退出防止内存泄露
     */
    public void onDestroy(){
        mWebView.loadDataWithBaseURL(null,"","text/html","utf-8",null);
        mWebView.clearHistory();
        ((ViewGroup)mWebView.getParent()).removeView(mWebView);
        mWebView.destroy();
        mWebView=null;
    }

    public void loadUrl(String url){
        mWebView.loadUrl(url);
    }
}
