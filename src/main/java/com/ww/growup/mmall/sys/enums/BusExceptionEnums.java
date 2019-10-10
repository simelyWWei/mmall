package com.ww.growup.mmall.sys.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务异常枚举
 *
 * @author 魏巍
 * @since 2019/10/10 22:22
 */
@Getter
@AllArgsConstructor
public enum BusExceptionEnums {

    /*通用成功*/
    SUCCESS(0, "查询成功"),
    ERROR(1, "系统出现异常"),
    ;
    private Integer code;
    private String message;
}
