package com.ww.growup.mmall.sys.aop;

import com.ww.growup.mmall.common.beans.ServerResponse;
import com.ww.growup.mmall.sys.exception.BusException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author 魏巍
 * @since 2019/10/10 22:38
 */
@Slf4j
@ControllerAdvice(value = "com.ww.growup.mmall")
@Order(-2)
public class RestApiExceptionHandler {

    @ExceptionHandler(BusException.class)
    @ResponseBody
    public ServerResponse busException(BusException e){
        log.error("业务异常：", e);
        return ServerResponse.error(e.getCode(),e.getMessage());
    }

}
