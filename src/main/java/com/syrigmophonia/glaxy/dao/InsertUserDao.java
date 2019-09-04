package com.syrigmophonia.glaxy.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface InsertUserDao {
    @Insert("INSERT INTO login(username,password,roletype,rex,iphone) VALUES(#{username},#{password},#{roletype},#{rex},#{iphone}) ")
    public void insertUserData(@Param("username") String username, @Param("password") String password, @Param("roletype") String roletype, @Param("rex") String rex, @Param("iphone") String iphone);
}
