package com.example.administrator.newsproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.adapter.NewsAdapter;
import com.example.administrator.bean.NewsBean;
import com.example.administrator.utils.NewsUtils;

import java.util.ArrayList;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        //1.找到控件
        ListView lv_news = (ListView) findViewById(R.id.lv_news);

        //2.获取新闻数据用list封装
        ArrayList<NewsBean> allNews = NewsUtils.getAllNews(mContext);

        //3.创建一个adapter
        NewsAdapter newsAdapter = new NewsAdapter(mContext,allNews);
        lv_news.setAdapter(newsAdapter);

        //4.设置listview条目的点击事件
        lv_news.setOnItemClickListener(this);
    }

    /**
     *  listView的条目点击时会调用该方法
     *  parent:代表listview
     *  view:点击的条目上的view对象
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //需要获取条目上bean对象中url做跳转
        /*Object object = parent.getItemAtPosition(position);
        if(object == null){
            Toast.makeText(mContext,"id:"+id+"",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(mContext,"position:"+position+"",Toast.LENGTH_SHORT).show();
        }*/

        NewsBean bean = (NewsBean) parent.getItemAtPosition(position);

        String url = bean.news_url;

        //跳转浏览器
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
