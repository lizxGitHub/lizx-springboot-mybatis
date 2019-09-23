package com.lizhuxiong.lizxspringbootmybatis.controller;

import com.lizhuxiong.lizxspringbootmybatis.json.AjaxJson;
import com.lizhuxiong.lizxspringbootmybatis.model.Teacher;
import com.lizhuxiong.lizxspringbootmybatis.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    TeacherService teacherService;

    @ResponseBody
    @GetMapping("/getTeacherOne")
    public AjaxJson getTeacherOne (@RequestParam(name = "sno", required = true)String sno) {
        AjaxJson json = new AjaxJson();
        Teacher teacher = teacherService.selectByPrimaryKey(sno);
        json.put("teacher", teacher);
        return json;
    }

    @ResponseBody
    @GetMapping("/getTeacherMany")
    public AjaxJson getTeacherMany (@RequestParam(name = "tnos", required = false)String tnos) {
        AjaxJson json = new AjaxJson();
        String[] tnoArray = tnos.split(",");
        List<Teacher> teacherList = teacherService.selectByIds(tnoArray);
        json.put("teacherMany", teacherList);
        return json;
    }

}
