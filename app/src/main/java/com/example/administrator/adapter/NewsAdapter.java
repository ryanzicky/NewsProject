package com.example.administrator.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.bean.NewsBean;
import com.example.administrator.newsproject.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/5 0005.
 */
public class NewsAdapter extends BaseAdapter {

    public ArrayList<NewsBean> list;
    public Context context;

    public NewsAdapter(Context context,ArrayList<NewsBean> list){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;

        //1.复用convertView优化listView
        if(convertView != null){
            view = convertView;
        }else{
            /**
             * context:上下文
             * resource:要转换成view对象的layout的id
             * root:将layout用root包一层作为getview的返回值
             */
            view = View.inflate(context, R.layout.item_news_layout,null);//将一个布局文件转换成一个view对象
        }

        //2.获取view上的子控件对象
        ImageView item_img_icon = (ImageView) view.findViewById(R.id.item_img_icon);
        TextView item_tv_title = (TextView) view.findViewById(R.id.item_tv_title);
        TextView item_tv_des = (TextView) view.findViewById(R.id.item_tv_des);

        //3.获取条目对应的list集合中的新闻数据，Bean对象
        NewsBean newsBean = list.get(position);

        //4.将数据设置给这些子控件做显示
        item_img_icon.setImageDrawable(newsBean.icon);//设置ImageView的图片
        item_tv_title.setText(newsBean.title);
        item_tv_des.setText(newsBean.des);
        return view;
    }
}
