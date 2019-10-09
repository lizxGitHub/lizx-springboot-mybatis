package com.lizhuxiong.lizxspringbootmybatis.utils;

import java.util.UUID;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/24
 */
public class LizxUtils {
    public static String creatUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
