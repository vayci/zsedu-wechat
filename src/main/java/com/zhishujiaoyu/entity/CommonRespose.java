package com.zhishujiaoyu.entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 统一相应内容
 * @author zhaohw
 * @date 2017-10-14 11:47
 */
@Table(name="wx_event")
public class CommonRespose {

    private Integer id;

    private String key;

    @Column(name="key_type")
    private Integer keyType;

    private String res;

    /**
     * 返回内容类型   1为文本 2为图文
     */
    @Column(name="res_type")
    private Integer resType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getKeyType() {
        return keyType;
    }

    public void setKeyType(Integer keyType) {
        this.keyType = keyType;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }


}
