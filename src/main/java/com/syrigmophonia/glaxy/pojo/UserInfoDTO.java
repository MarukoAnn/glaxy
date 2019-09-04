package com.syrigmophonia.glaxy.pojo;

public class UserInfoDTO {
    private int id;
    private String username;
    private String password;
    private String roletype;
    private String rex;
    private String iphone;
    private String email;
    private String hobby;
    private String age;

    public UserInfoDTO(int id, String username, String password, String roletype, String rex, String iphone, String email, String hobby, String age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roletype = roletype;
        this.rex = rex;
        this.iphone = iphone;
        this.email = email;
        this.hobby = hobby;
        this.age = age;
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

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }

    public String getRex() {
        return rex;
    }

    public void setRex(String rex) {
        this.rex = rex;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
