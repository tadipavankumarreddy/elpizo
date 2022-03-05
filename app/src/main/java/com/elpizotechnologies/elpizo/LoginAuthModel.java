package com.elpizotechnologies.elpizo;

import com.google.gson.annotations.SerializedName;

public class LoginAuthModel {
    @SerializedName("username")
    String username;
    @SerializedName("password")
    String password;

    public LoginAuthModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
