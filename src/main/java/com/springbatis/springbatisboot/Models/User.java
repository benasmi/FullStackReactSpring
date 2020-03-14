package com.springbatis.springbatisboot.Models;

public class User {

    private String name;
    private String surname;
    private String email;
    private String birthday;
    private String password;
    private String gender;

    public User(String name, String surname, String email, String birthday, String password, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
