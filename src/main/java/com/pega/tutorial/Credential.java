package com.pega.tutorial;

/**
 * Created by gajel on 22/09/2015.
 */
public class Credential {
    private String name;
    private String email;
    private String password;

    public Credential(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
