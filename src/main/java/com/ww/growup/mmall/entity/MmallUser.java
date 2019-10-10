package com.ww.growup.mmall.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MmallUser {

    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码，MD5加密
     */
    private String password;

    private String email;

    private String phone;

    /**
     * 找回密码问题
     */
    private String question;

    /**
     * 找回密码答案
     */
    private String answer;

    /**
     * 角色0-管理员,1-普通用户
     */
    private Integer role;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 最后一次更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;
}
