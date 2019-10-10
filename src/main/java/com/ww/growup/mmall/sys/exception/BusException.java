package com.ww.growup.mmall.sys.exception;

import com.ww.growup.mmall.sys.enums.BusExceptionEnums;
import lombok.Getter;
import lombok.Setter;

/**
 * 业务异常
 *
 * @author 魏巍
 * @since 2019/10/10 22:47
 */

@Getter
@Setter
public class BusException extends RuntimeException {
    private int code = BusExceptionEnums.ERROR.getCode();

    public BusException() {
    }

    public BusException(String message) {
        super(message);
    }

    public BusException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusException(Throwable cause) {
        super(cause);
    }

    public BusException(BusExceptionEnums enumObj) {
        super(enumObj.getMessage());
        this.code = enumObj.getCode();
    }

    public BusException(int code, String message) {
        super(message);
        this.code = code;
    }
}
