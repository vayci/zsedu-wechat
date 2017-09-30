package com.zhishujiaoyu.biz;

import com.zhishujiaoyu.ZseduMicroApplication;
import com.zhishujiaoyu.entity.DbNewsItem;
import com.zhishujiaoyu.mapper.NewsMapper;
import com.zhishujiaoyu.utils.IDUtil;
import com.zhishujiaoyu.utils.JsonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by Ecloud on 2017/9/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ZseduMicroApplication.class)// 指定spring-boot的启动类
@WebAppConfiguration
public class NewsBizTest {

    @Autowired
    private NewsMapper newsMapper;

    @Test
    public void addNewsItem() throws Exception {
        DbNewsItem dbNewsItem = new DbNewsItem();
        dbNewsItem.setId(IDUtil.getUUID());
        dbNewsItem.setSort(0);
        dbNewsItem.setTitle("item标题");
        dbNewsItem.setDescription("描述");
        dbNewsItem.setPicUrl("http://baidu.com/1.jpg");
        dbNewsItem.setUrl("http://www.baidu.com");
        newsMapper.addNewsItem(dbNewsItem);
    }

    @Test
    public void getNewsItem() throws Exception {
        List<DbNewsItem> dbNewsItems = newsMapper.getNewsItem("587CFC97A667435E824B5948C4CD503F");
        System.out.println(JsonUtils.toJson(dbNewsItems));
    }


    @Test
    public void deleteNewsItem() throws Exception {

    }

}