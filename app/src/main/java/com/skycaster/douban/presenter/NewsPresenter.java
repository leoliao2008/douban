package com.skycaster.douban.presenter;

import android.support.v4.view.ViewPager;

import com.skycaster.douban.activity.NewsActivity;
import com.skycaster.douban.adapter.NewsPagerAdapter;
import com.skycaster.douban.base.BasePresenter;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class NewsPresenter extends BasePresenter<NewsActivity> {

    public NewsPresenter(NewsActivity activity) {
        super(activity);
    }

    @Override
    public void onCreate() {
        ViewPager viewPager = getActivity().getViewPager();
        NewsPagerAdapter adapter=new NewsPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }
}
