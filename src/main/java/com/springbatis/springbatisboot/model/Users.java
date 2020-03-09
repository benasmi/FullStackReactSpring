package com.springbatis.springbatisboot.model;

public class Users {

    private String name;
    private String surname;
    private String email;
    private String birthday;
    private String password;

    public Users(String name, String surname, String email, String birthday, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}