package com.fmi.application.auth;

/**
 *
 * @author User
 */
public interface Authenticable {
    String DEFAULT_TOKEN = "my token";
    String getHashPassword();
    String getUserName();
    String getToken();
}
