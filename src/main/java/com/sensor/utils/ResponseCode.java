package com.sensor.utils;

/**
 * @author sensor
 * @version 1.0
 * @CREATED 2019/3/14 21:11:38
 * @des
 * @修改记录:
 **/

public enum ResponseCode {
    OK(1, "操作成功"),
    FAIL(-1, "操作失败");
    public Integer code;
    public String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
