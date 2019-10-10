package com.ww.growup.mmall.common.beans;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.io.Serializable;

@Setter
@Getter
public class ServerResponse<T> implements Serializable {

    private int code;

    private String msg;

    private String time;

    private T data;

    private ServerResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
        DateTime now = DateTime.now();
        this.setTime(now.toString("yyyy-MM-dd HH:mm:ss"));
    }

    public static <T> ServerResponse<T> success(){
        return new ServerResponse<>(0,"成功");
    }

    public static <T> ServerResponse<T> error(){
        return new ServerResponse<>(1,"失败");
    }
}
