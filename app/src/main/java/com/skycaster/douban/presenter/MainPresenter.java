package com.skycaster.douban.presenter;

import com.skycaster.douban.activity.MainActivity;
import com.skycaster.douban.base.BasePresenter;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class MainPresenter extends BasePresenter<MainActivity> {

    public MainPresenter(MainActivity activity) {
        super(activity);
    }

    @Override
    public void onCreate() {
//        FragmentManager manager = getActivity().getSupportFragmentManager();
//        NewsFragment fragment=new NewsFragment();
//        Bundle bundle=new Bundle();
//        bundle.putString(Static.NEWS_CATEGORY, NewsType.top.toString());
//        fragment.setArguments(bundle);
//        manager.beginTransaction().add(R.id.frame_layout,fragment).commit();
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
