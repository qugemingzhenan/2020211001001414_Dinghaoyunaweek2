package com.Dinghaoyuan.model;

import com.Dinghaoyuan.dao.UserDao;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String male;
    private String female;
    private Date birthday;

    public User() {
    }

    public User(int id, String username, String password, String email, String male, String female, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.male = male;
        this.female = female;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", male='" + male + '\'' +
                ", female='" + female + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
