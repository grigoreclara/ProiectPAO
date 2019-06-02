package com.fmi.application.client;

import com.fmi.application.auth.Authenticable;

import com.fmi.application.model.User;

import java.util.Date;


public final class UserApp extends User implements Authenticable {

    private String userName;
    private String hashPassword;

    public UserApp(String firstName, String lastName, Date dateOfBirth, String userName, String hashPassword, String userName1, String hashPassword1) {
        super(firstName, lastName, dateOfBirth, userName, hashPassword);
        this.userName = userName1;
        this.hashPassword = hashPassword1;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getHashPassword() {
        return hashPassword;
    }
}

