package com.zhishujiaoyu.entity;

import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;

import javax.persistence.Table;

/**
 * @author zhaohw
 * @date 2017-09-30 16:37
 */
@Table(name ="wx_news_item")
public class DbNewsItem extends WxMpXmlOutNewsMessage.Item{

    private String id;

    private int sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }


}
