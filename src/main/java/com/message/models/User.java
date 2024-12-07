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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
