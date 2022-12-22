package com.example.Pro01.DTO.Response;

public class UserLoginResponse {
    public String userId;
    public String userName;
    public String token;
    public String statusCode;
    public String e_msg;
    public String p_key;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getE_msg() {
        return e_msg;
    }

    public void setE_msg(String e_msg) {
        this.e_msg = e_msg;
    }

    public String getP_key() {
        return p_key;
    }

    public void setP_key(String p_key) {
        this.p_key = p_key;
    }
}
