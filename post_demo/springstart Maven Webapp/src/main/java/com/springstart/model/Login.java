package com.springstart.model;

public class Login {
    private String name;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Login{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
