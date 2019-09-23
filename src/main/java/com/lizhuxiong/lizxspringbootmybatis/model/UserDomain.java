package com.lizhuxiong.lizxspringbootmybatis.model;

import lombok.Data;

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/23
 */
@Data
public class UserDomain {

    private Integer userId;

    private String userName;

    private String password;

    private String phone;
}
