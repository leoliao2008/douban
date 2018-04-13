package com.skycaster.douban.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.skycaster.douban.Static;
import com.skycaster.douban.fragment.NewsFragment;

/**
 * Created by 廖华凯 on 2018/4/13.
 */

public class NewsPagerAdapter extends FragmentStatePagerAdapter{
    private String[] mCategories=new String[]{"top","shehui","guonei","guoji","yule","tiyu","junshi","keji","caijing","shishang"};
    private String[] mTitles=new String[]{"头条","社会","国内","国际","娱乐","体育","军事","科技","财经","市场"};

    public NewsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        NewsFragment fragment=new NewsFragment();
        Bundle bundle=new Bundle();
        bundle.putString(Static.NEWS_CATEGORY,mCategories[position]);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return mCategories.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
