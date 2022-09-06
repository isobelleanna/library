package org.example;

public class User {
    private String name;
    private UserStatus status;

    private String password;

    public User(String name, UserStatus status, String password) {
        this.name = name;
        this.status = status;
        this.password = password;
    }

    @Override
    public String toString(){
        return "\n" + name + " " + password + " " + status;
    }
}
