package com.skycaster.douban.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.skycaster.douban.R;
import com.skycaster.douban.Static;
import com.skycaster.douban.activity.WebViewActivity;
import com.skycaster.douban.adapter.NewsFragmentAdapter;
import com.skycaster.douban.base.BaseFragment;
import com.skycaster.douban.bean.NewsBean;
import com.skycaster.douban.bean.NewsBean.ResultBean.DataBean;
import com.skycaster.douban.util.AsynchHttpUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cz.msebera.android.httpclient.Header;

/**
 * Created by 廖华凯 on 2018/4/12.
 */

public class NewsFragment extends BaseFragment {
    @BindView(R.id.list_view)
    ListView mListView;

    private String mKeyWord;
    private View mRootView;
    private ArrayList<DataBean> mList=new ArrayList<>();
    private NewsFragmentAdapter mAdapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mKeyWord = getArguments().getString(Static.NEWS_CATEGORY);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_news, null);
        mListView=mRootView.findViewById(R.id.list_view);
        mAdapter = new NewsFragmentAdapter(mList,getContext(), R.layout.item_news);
        mListView.setDividerHeight(0);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebViewActivity.start(getContext(),mList.get(position).getUrl());
            }
        });
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AsynchHttpUtils.getNews(mKeyWord, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
//                showLog(new String(responseBody));
                if(statusCode==200){
                    NewsBean newsBean = new Gson().fromJson(new String(responseBody), NewsBean.class);
                    NewsBean.ResultBean result = newsBean.getResult();
                    if(result!=null){
                        List<DataBean> list = result.getData();
                        if(list!=null){
                            for(DataBean data:list){
                                mList.add(data);
                            }
                        }
                    }else {
                        showToast("获取网络资源失败，原因："+newsBean.getReason());
                    }
                    mAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                showToast("获取网络资源失败，原因："+error.getMessage());
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
