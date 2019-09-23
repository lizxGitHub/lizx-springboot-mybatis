package com.lizhuxiong.lizxspringbootmybatis.json;

import com.lizhuxiong.lizxspringbootmybatis.enumutils.ApiCodeEnum;

import java.util.LinkedHashMap;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
public class AjaxJson {

    private boolean success = true;
    private String code;
    private String msg;
    private String sub_code;
    private String sub_msg;
    private LinkedHashMap<String, Object> body;

    public AjaxJson() {
        this.code = String.valueOf(ApiCodeEnum.SUCCESS.getCode());
        this.msg = ApiCodeEnum.SUCCESS.getMsg();
        this.sub_code = ApiCodeEnum.SUCCESS.getSub_code();
        this.sub_msg = ApiCodeEnum.SUCCESS.getSub_msg();
        this.body = new LinkedHashMap();
    }

    public LinkedHashMap<String, Object> getBody() {
        return this.body;
    }

    public void setBody(LinkedHashMap<String, Object> body) {
        this.body = body;
    }

    public void put(String key, Object value) {
        this.body.put(key, value);
    }

    public void remove(String key) {
        this.body.remove(key);
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public String getSub_code() {
        return this.sub_code;
    }

    public void setSub_code(String sub_code) {
        this.sub_code = sub_code;
    }

    public String getSub_msg() {
        return this.sub_msg;
    }

    public void setSub_msg(String sub_msg) {
        this.sub_msg = sub_msg;
    }
}
