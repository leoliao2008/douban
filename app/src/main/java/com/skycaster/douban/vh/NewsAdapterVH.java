package com.skycaster.douban.vh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.skycaster.douban.base.BaseViewHolder;
import com.skycaster.douban.R;

/**
 * Created by 廖华凯 on 2018/4/12.
 * 含三种布局，分别对应只有三张预览图，两张预览图和一张预览图的情况。
 */

public class NewsAdapterVH extends BaseViewHolder {
    private TextView tv_title_3pic;
    private TextView tv_date_3pic;
    private SimpleDraweeView iv_pic1;
    private SimpleDraweeView iv_pic2;
    private SimpleDraweeView iv_pic3;
    private SimpleDraweeView iv_pic4;
    private SimpleDraweeView iv_pic5;
    private SimpleDraweeView iv_pic6;
    private TextView tv_title_2pic;
    private TextView tv_date_2pic;
    private TextView tv_title_1pic;
    private TextView tv_date_1pic;
    private LinearLayout mContainer3Pic;
    private LinearLayout mContainer2Pic;
    private LinearLayout mContainer1Pic;


    public NewsAdapterVH(View rootView) {
        super(rootView);
    }

    @Override
    protected void instantiateChildViews(View rootView) {
        tv_title_3pic =rootView.findViewById(R.id.tv_news_title_3_pics);
        tv_title_2pic=rootView.findViewById(R.id.tv_news_title_2_pics);
        tv_title_1pic=rootView.findViewById(R.id.tv_news_title_1_pics);
        tv_date_3pic =rootView.findViewById(R.id.tv_news_date_3_pic);
        tv_date_2pic=rootView.findViewById(R.id.tv_news_date_2_pic);
        tv_date_1pic=rootView.findViewById(R.id.tv_news_date_1_pic);
        iv_pic1=rootView.findViewById(R.id.iv_news_thumbnail_1);
        iv_pic2=rootView.findViewById(R.id.iv_news_thumbnail_2);
        iv_pic3=rootView.findViewById(R.id.iv_news_thumbnail_3);
        iv_pic4=rootView.findViewById(R.id.iv_news_thumbnail_4);
        iv_pic5=rootView.findViewById(R.id.iv_news_thumbnail_5);
        iv_pic6=rootView.findViewById(R.id.iv_news_thumbnail_6);
        mContainer1Pic=rootView.findViewById(R.id.ll_1_pics);
        mContainer2Pic=rootView.findViewById(R.id.ll_2_pics);
        mContainer3Pic=rootView.findViewById(R.id.ll_3_pics);

    }

    public TextView getTv_title_3pic() {
        return tv_title_3pic;
    }

    public TextView getTv_date_3pic() {
        return tv_date_3pic;
    }

    public SimpleDraweeView getIv_pic1() {
        return iv_pic1;
    }

    public SimpleDraweeView getIv_pic2() {
        return iv_pic2;
    }

    public SimpleDraweeView getIv_pic3() {
        return iv_pic3;
    }

    public SimpleDraweeView getIv_pic4() {
        return iv_pic4;
    }

    public SimpleDraweeView getIv_pic5() {
        return iv_pic5;
    }

    public SimpleDraweeView getIv_pic6() {
        return iv_pic6;
    }

    public TextView getTv_title_2pic() {
        return tv_title_2pic;
    }

    public TextView getTv_date_2pic() {
        return tv_date_2pic;
    }

    public TextView getTv_title_1pic() {
        return tv_title_1pic;
    }

    public TextView getTv_date_1pic() {
        return tv_date_1pic;
    }

    public LinearLayout getContainer3Pic() {
        return mContainer3Pic;
    }

    public LinearLayout getContainer2Pic() {
        return mContainer2Pic;
    }

    public LinearLayout getContainer1Pic() {
        return mContainer1Pic;
    }
}
