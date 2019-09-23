package com.lizhuxiong.lizxspringbootmybatis.service.impl;

import com.lizhuxiong.lizxspringbootmybatis.dao.TeacherMapper;
import com.lizhuxiong.lizxspringbootmybatis.model.Teacher;
import com.lizhuxiong.lizxspringbootmybatis.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherMapper teacherMapper;

    @Override
    public Teacher selectByPrimaryKey(String sno) {
        return teacherMapper.selectByPrimaryKey(sno);
    }

    @Override
    public List<Teacher> selectByIds(String[] ids) {
        return teacherMapper.selectByIds(ids);
    }
}
