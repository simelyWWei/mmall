package com.ww.growup.mmall.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MmallUser {
    private Integer id;

    private String username;

    private String password;
    private String email;
    private String phone;
    private String question;
    private String answer;
    private Integer role;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
