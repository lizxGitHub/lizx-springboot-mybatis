package com.lizhuxiong.lizxspringbootmybatis.dao;

import com.lizhuxiong.lizxspringbootmybatis.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    // 用@Param定义过的参数在mapper文件中直接取值
    Teacher selectByPrimaryKey(@Param("tno") String tno);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> selectByIds (@Param("array") String[] ids);
}
