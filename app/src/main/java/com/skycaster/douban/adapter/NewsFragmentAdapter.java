package com.skycaster.douban.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

import com.skycaster.douban.base.MyBaseAdapter;
import com.skycaster.douban.bean.NewsBean.ResultBean.DataBean;
import com.skycaster.douban.vh.NewsAdapterVH;

import java.util.ArrayList;

/**
 * Created by 廖华凯 on 2018/4/12.
 */

public class NewsFragmentAdapter extends MyBaseAdapter<DataBean,NewsAdapterVH> {

    public NewsFragmentAdapter(ArrayList<DataBean> list, Context context, int layoutSrc) {
        super(list, context, layoutSrc);
    }

    @Override
    protected NewsAdapterVH onCreateViewHolder(View convertView) {
        return new NewsAdapterVH(convertView);
    }

    @Override
    protected void onBindViewHolder(NewsAdapterVH vh, int position) {
        DataBean bean = getList().get(position);
        //先把所有的布局视图隐藏起来
        vh.getContainer1Pic().setVisibility(View.GONE);
        vh.getContainer2Pic().setVisibility(View.GONE);
        vh.getContainer3Pic().setVisibility(View.GONE);
        //再判断要使用哪一个视图，把该视图显示出来
        String pic1 = bean.getThumbnail_pic_s();
        String pic2 = bean.getThumbnail_pic_s02();
        String pic3 = bean.getThumbnail_pic_s03();
        int i1= TextUtils.isEmpty(pic1)?0:1;
        int i2= TextUtils.isEmpty(pic2)?0:1;
        int i3= TextUtils.isEmpty(pic3)?0:1;
        int sum = i1 + i2 + i3;
        if(sum==3){//三张预览图
            vh.getContainer3Pic().setVisibility(View.VISIBLE);
            vh.getTv_title_3pic().setText(bean.getTitle());
            vh.getTv_date_3pic().setText(bean.getDate());
            vh.getIv_pic1().setImageURI(pic1);
            vh.getIv_pic2().setImageURI(pic2);
            vh.getIv_pic3().setImageURI(pic3);
        }else if(sum==2){//2张预览图
            vh.getContainer2Pic().setVisibility(View.VISIBLE);
            vh.getTv_title_2pic().setText(bean.getTitle());
            vh.getTv_date_2pic().setText(bean.getDate());
            vh.getIv_pic4().setImageURI(pic1);
            vh.getIv_pic5().setImageURI(pic2);
        }else {//1张预览图
            vh.getContainer1Pic().setVisibility(View.VISIBLE);
            vh.getTv_title_1pic().setText(bean.getTitle());
            vh.getTv_date_1pic().setText(bean.getDate());
            vh.getIv_pic6().setImageURI(pic1);
        }

    }


}
