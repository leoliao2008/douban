package com.skycaster.douban.base;

import com.skycaster.douban.impl.ImplPresenter;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public abstract class BasePresenter<A extends BaseMVPActivity> extends BaseObject implements ImplPresenter {
    private A mActivity;
    public BasePresenter(A activity){
        mActivity=activity;
    }
    protected A getActivity(){
        return mActivity;
    }

}
