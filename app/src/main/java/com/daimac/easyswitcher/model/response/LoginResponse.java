package com.daimac.easyswitcher.model.response;

/**
 * Created by LiuZhenXing on 2017/9/24.
 */

public class LoginResponse {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
