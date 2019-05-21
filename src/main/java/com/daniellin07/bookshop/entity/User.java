package com.daniellin07.bookshop.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户实体
 *
 * @author DanielLin07
 * @date 2019/5/18 23:44
 */
@Data
public class User {

    private int id;

    private String username;

    private String password;

    private String salt;

    private Integer sex;

    private String phone;

    private String avatar;

    private Integer status;

    private Date lastLoginTime;

    private Date createTime;

    private Date updateTime;

}
