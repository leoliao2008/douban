package com.skycaster.douban.base;

import com.skycaster.douban.util.LogUtil;
import com.skycaster.douban.util.ToastUtil;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public class BaseObject {

    private String mTag;

    public void BaseObject(){
        mTag=getClass().getSimpleName();
    }
    protected void showLog(String msg){
        LogUtil.showLog(mTag,msg);
    }

    protected void showToast(String msg){
        ToastUtil.showToast(msg);
    }
}
