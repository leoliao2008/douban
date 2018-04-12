package com.skycaster.douban.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by 廖华凯 on 2018/4/10.
 */

public abstract class MyBaseAdapter<T extends BaseBean,VH extends BaseViewHolder> extends BaseAdapter {

    private ArrayList<T> mList;
    private Context mContext;
    private int mLayoutSrc;

    public MyBaseAdapter(ArrayList<T> list, Context context,int layoutSrc) {
        mList = list;
        mContext = context;
        mLayoutSrc=layoutSrc;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VH vh;
        if(convertView==null){
            convertView=View.inflate(mContext,mLayoutSrc,null);
            vh=onCreateViewHolder(convertView);
            convertView.setTag(vh);
        }else {
            vh= (VH) convertView.getTag();
        }
        onBindViewHolder(vh,position);
        return convertView;
    }

    protected abstract void onBindViewHolder(VH vh, int position);

    protected abstract VH onCreateViewHolder(View convertView);

    protected ArrayList<T> getList() {
        return mList;
    }
}
