package edu.sust.po;

import java.util.Date;

/**
 * Created by envy15 on 2015/4/7 0007.
 */

public class User {

    private Integer id;
    private String name;
    private String nickName;
    private String passWord;
    private String email;
    private Date regDate = new Date();

    public Date getRegDate() {
        return regDate;
    }

    public User(Integer id, String name, String nickName, String passWord, String email, Date regDate) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.passWord = passWord;
        this.email = email;
        this.regDate = regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, String nickName, String passWord, String email) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.passWord = passWord;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
