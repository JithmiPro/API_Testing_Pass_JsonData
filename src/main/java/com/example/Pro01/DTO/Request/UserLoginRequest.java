package com.example.Pro01.DTO.Request;

import javax.servlet.http.HttpSession;

public class UserLoginRequest {

    public String userId;
    public String password;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public HttpSession getSession(boolean b) {

        return getSession(b);
    }
}
