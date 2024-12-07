package com.message.models;

public class User {
    private String nickname;
    private String name;
    private String phoneNumber;
    private String password;

    public User(String nickname, String name, String phoneNumber, String password) {
        this.nickname = nickname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getData() {
        return "Имя: " + getName() + "\nНик: " + getNickname() + "\nТелефон: " + getPhoneNumber() + "\n";
    }
}
