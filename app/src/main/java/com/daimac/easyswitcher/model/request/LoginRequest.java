package com.daimac.easyswitcher.model.request;

/**
 * Created by LiuZhenXing on 2017/9/24.
 */

public class LoginRequest {
    private String username;
    private String password;

    public LoginRequest(String region, String phone, String password) {
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
