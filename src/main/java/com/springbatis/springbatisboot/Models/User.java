package com.springbatis.springbatisboot.Models;

public class User {

    private String name;
    private String surname;
    private String email;
    private String birthday;
    private String password;
    private String gender;
    private int fk_country;

    public User(String name, String surname, String email, String birthday, String password, String gender, int fk_country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
        this.gender = gender;
        this.fk_country = fk_country;
    }

    public User(){

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

    public int getFk_country() {
        return fk_country;
    }

    public void setFk_country(int fk_country) {
        this.fk_country = fk_country;
    }
}
