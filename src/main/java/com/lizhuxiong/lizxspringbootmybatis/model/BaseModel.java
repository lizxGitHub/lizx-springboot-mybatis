package com.lizhuxiong.lizxspringbootmybatis.model;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
public class BaseModel<T> {
    T x;
    public BaseModel(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new  RuntimeException(e);
        }
    }
}
