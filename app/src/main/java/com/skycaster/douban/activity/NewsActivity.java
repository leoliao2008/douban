package com.skycaster.douban.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;

import com.skycaster.douban.R;
import com.skycaster.douban.base.BaseMVPActivity;
import com.skycaster.douban.presenter.NewsPresenter;

import butterknife.BindView;

public class NewsActivity extends BaseMVPActivity<NewsPresenter> {

    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    public static void start(Context context) {
        Intent starter = new Intent(context, NewsActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected NewsPresenter bindPresenter() {
        return new NewsPresenter(this);
    }

    @Override
    protected int bindContentView() {
        return R.layout.activity_news;
    }

    public ViewPager getViewPager() {
        return mViewPager;
    }
}
