package com.example.administrator.utils;

import android.content.Context;

import com.example.administrator.bean.NewsBean;
import com.example.administrator.newsproject.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/5 0005.
 */
public class NewsUtils {

    public static ArrayList<NewsBean> getAllNews(Context context) {
        
        ArrayList<NewsBean> arrayList = new ArrayList<NewsBean>();

        for (int i = 0; i < 300; i++){
            NewsBean newsBean = new NewsBean();
            newsBean.title="谢霆锋经纪人: 偷拍系侵权行为";
            newsBean.des = "称谢霆锋隐私权收到侵犯,将保留追究法律责任";
            newsBean.news_url = "http://www.sina.cn";
            newsBean.icon = context.getResources().getDrawable(R.drawable.ic_launcher);//将一个资源id转换成一个Drawable对象
            arrayList.add(newsBean);

            NewsBean newsBean1 = new NewsBean();
            newsBean1.title="知情人: 王菲是谢霆锋最爱的人";
            newsBean1.des = "身边的人都知道谢霆锋最爱王菲，二人早有复合的迹象";
            newsBean1.news_url = "http://www.baidu.com";
            newsBean1.icon = context.getResources().getDrawable(R.drawable.icon);//将一个资源id转换成一个Drawable对象
            arrayList.add(newsBean1);

            NewsBean newsBean2 = new NewsBean();
            newsBean2.title="谢霆锋经纪人: 偷拍系侵权行为";
            newsBean2.des = "称谢霆锋隐私权收到侵犯,将保留追究法律责任";
            newsBean2.news_url = "http://www.sina.cn";
            newsBean2.icon = context.getResources().getDrawable(R.drawable.icon2);//将一个资源id转换成一个Drawable对象
            arrayList.add(newsBean2);
        }

        return arrayList;
        
    }
}
