package com.lizhuxiong.lizxspringbootmybatis.service;

import com.github.pagehelper.PageInfo;
import com.lizhuxiong.lizxspringbootmybatis.model.UserDomain;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
public interface UserService extends BaseService{

    int addUser(UserDomain user);

}
