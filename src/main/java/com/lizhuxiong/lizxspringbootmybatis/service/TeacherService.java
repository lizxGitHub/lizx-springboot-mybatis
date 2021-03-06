package com.lizhuxiong.lizxspringbootmybatis.service;

import com.lizhuxiong.lizxspringbootmybatis.model.Teacher;

import java.util.List;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
public interface TeacherService {

    Teacher selectByPrimaryKey(String tno);

    List<Teacher> selectByIds (String[] ids);
}
