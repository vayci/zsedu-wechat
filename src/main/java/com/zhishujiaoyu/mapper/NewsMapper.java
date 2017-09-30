package com.zhishujiaoyu.mapper;

import com.zhishujiaoyu.entity.DbNewsItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author zhaohw
* @date 2017/9/30 16:15
*/
@Repository
public interface NewsMapper {

    List<DbNewsItem> getNewsItem(@Param("itemId")String itemId);

    void addNewsItem(@Param("newsItem") DbNewsItem newsItem);

    void deleteNewsItem(@Param("itemId")String itemId);
}
