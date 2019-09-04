package com.syrigmophonia.glaxy.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface changeUserInfoDao {
    @Update("UPDATE login SET username=#{username},password=#{password},roletype=#{roletype},rex=#{rex},email=#{email},age=#{age},hobby=#{hobby},iphone=#{iphone} WHERE id=#{id}")
    public void ChangeUserinfo(@Param("iphone") String iphone,@Param("hobby") String hobby,@Param("age") String age,@Param("email") String email,@Param("username") String username,@Param("password") String password,@Param("roletype") String roletype,@Param("rex") String rex, @Param("id") int id);
}
