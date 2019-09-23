package com.lizhuxiong.lizxspringbootmybatis.controller;

import com.lizhuxiong.lizxspringbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource(name="userServiceImpl")
    private UserService userService;

    /**
     * 此时对于接口UserService有两个实现UserServiceImpl与UserServiceImpl_1，所以UserService同类型的有两个
     * 如果根据@Autowired（byType）就会报错
     * 解决方法
     * 1.@Resource(name="")指定要注入的实现
     * 2.@Autowired与@Qualifier("")共用
     *
     */
//    @Autowired
//    @Qualifier("userServiceImpl_1")
//    private UserService userService;


//    @ResponseBody
//    @PostMapping("/add")
//    public int addUser(UserDomain user){
//        return userService.addUser(user);
//    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

}
