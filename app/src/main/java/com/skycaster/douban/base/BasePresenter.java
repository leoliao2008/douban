package com.skycaster.douban.base;

import com.skycaster.douban.impl.ImplPresenter;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public abstract class BasePresenter<Activity extends BaseMVPActivity> extends BaseObject implements ImplPresenter {
    private Activity mActivity;
    public BasePresenter(Activity activity){
        mActivity=activity;
    }
    protected Activity getActivity(){
        return mActivity;
    }

}
