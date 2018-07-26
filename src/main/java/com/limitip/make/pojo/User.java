package com.limitip.make.pojo;

import java.io.Serializable;

/**
 * 描述:
 * 用户实体
 *
 * @outhor hokitlee
 * @create 2017-12-19 9:25
 */
public class User implements Serializable {
    private int id;
    private String  userName;
    private String userPsd;
    private String sex;
    private int phone;

    public User() {
    }

    public User(String userName, String userPsd, String sex, int phone) {
        this.userName = userName;
        this.userPsd = userPsd;
        this.sex = sex;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
