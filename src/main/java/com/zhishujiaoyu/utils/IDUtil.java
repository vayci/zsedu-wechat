package com.zhishujiaoyu.utils;

import java.util.UUID;

/**
 * @author zhaohw
 * @date 2017-09-30 17:04
 */
public class IDUtil {
    public static String getUUID(){
        UUID uuid=UUID.randomUUID();
        String id=uuid.toString().replace("-", "").toUpperCase();
        return id;
    }
}
