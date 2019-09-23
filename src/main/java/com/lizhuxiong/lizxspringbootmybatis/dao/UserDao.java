package com.lizhuxiong.lizxspringbootmybatis.dao;

import com.lizhuxiong.lizxspringbootmybatis.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
public interface UserDao extends CurdDao{

    int insert(UserDomain record);

    List<UserDomain> selectUsers();

}
