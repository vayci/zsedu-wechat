package com.zhishujiaoyu.biz;

import com.zhishujiaoyu.entity.DbNewsItem;
import com.zhishujiaoyu.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaohw
 * @date 2017-09-30 16:57
 */
@Service
public class NewsBiz {

    @Autowired
    private NewsMapper newsMapper;

    public List<DbNewsItem> getNewsItem(String itemId){
        return newsMapper.getNewsItem(itemId);
    }

    public void addNewsItem(DbNewsItem newsItem){
        newsMapper.addNewsItem(newsItem);
    }

    public void deleteNewsItem(String itemId){
        newsMapper.deleteNewsItem(itemId);
    }
}
