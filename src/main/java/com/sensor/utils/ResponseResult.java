package com.sensor.utils;

import java.util.Map;

/**
 * @author sensor
 * @version 1.0
 * @CREATED 2019/3/14 21:10:14
 * @des
 * @修改记录:
 **/

public class ResponseResult<T> {
    private Integer status;

    private T data;

    private String msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public synchronized static <T> ResponseResult<T> e(ResponseCode code, T t) {
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.setStatus(code.code);
        responseResult.setMsg(code.msg);
        responseResult.setData(t);
        return responseResult;
    }
}
