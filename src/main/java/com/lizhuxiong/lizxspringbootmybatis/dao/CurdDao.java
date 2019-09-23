package com.lizhuxiong.lizxspringbootmybatis.dao;

import java.util.List;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
public interface CurdDao<T> {

    List<T> findList();

}
