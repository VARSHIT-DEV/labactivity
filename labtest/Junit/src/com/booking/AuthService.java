package com.booking;

public class AuthService {
    public boolean login(String username, String password) {
        return username.equals("username") && password.equals("password");
    }

    public boolean verify2FA(String code) {
        return code.equals("123456");
    }

    public boolean adminLogin(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }
}
