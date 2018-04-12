package com.skycaster.douban.base;

import android.view.View;

/**
 * Created by 廖华凯 on 2018/4/12.
 */

public abstract class BaseViewHolder {
    private View mRootView;

    public BaseViewHolder(View rootView) {
        mRootView = rootView;
        instantiateChildViews(mRootView);
    }

    protected abstract void instantiateChildViews(View rootView);
}
