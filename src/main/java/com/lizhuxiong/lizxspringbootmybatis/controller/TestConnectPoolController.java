package com.lizhuxiong.lizxspringbootmybatis.controller;

import com.lizhuxiong.lizxspringbootmybatis.service.TestConnectPoolService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/24
 */
@Controller
@RequestMapping("/testConnect")
public class TestConnectPoolController {

    @Resource
    TestConnectPoolService testConnectPoolService;

    @PostMapping("/test1")
    public void TestConnectPool () {
        testConnectPoolService.insertBatch();
    }


}
