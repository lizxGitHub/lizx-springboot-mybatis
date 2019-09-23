package com.lizhuxiong.lizxspringbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lizhuxiong.lizxspringbootmybatis.dao.UserDao;
import com.lizhuxiong.lizxspringbootmybatis.model.UserDomain;
import com.lizhuxiong.lizxspringbootmybatis.service.UserService;
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
public class UserServiceImpl_1 implements UserService {

    @Resource
    private UserDao userDao;

//    @Override
//    public int addUser(UserDomain user) {
//        return userDao.insert(user);
//    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    @Override
    public int addUser(UserDomain user) {
        return 0;
    }
}
