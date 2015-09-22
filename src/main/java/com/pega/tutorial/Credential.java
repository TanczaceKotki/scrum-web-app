package com.pega.tutorial;

/**
 * Created by gajel on 22/09/2015.
 */
public class Credential {
    private String name;
    private String password;

    public Credential(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean verifyPassword(String password) {
        return (this.password.equals(password));
    }
}
