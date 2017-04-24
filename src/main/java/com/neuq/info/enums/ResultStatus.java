package com.neuq.info.enums;

import org.springframework.test.annotation.Repeat;

/**
 * Created by lihang on 2017/4/4.
 */
public enum ResultStatus {

    SUCCESS(200, "yes"),
    FAILURE(-1001,"failure"),
    //USERNAME_OR_PASSWORD_ERROR(-1001, "用户名或密码错误"),
    USER_NOT_FOUND(-1002, "用户不存在"),
    USER_NOT_LOGIN(-1003, "用户未登录"),
    REPEAT_LIKE(-1004,"重复点赞"),
    REPEAT_UNLIKE(-1005,"重复取消赞");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}