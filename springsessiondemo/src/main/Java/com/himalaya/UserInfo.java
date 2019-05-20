package com.himalaya;

import java.io.Serializable;

public class UserInfo implements Serializable {


    private static final long serialVersionUID = -967621291280452430L;

    private String username;
    private int age;

    public UserInfo(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
