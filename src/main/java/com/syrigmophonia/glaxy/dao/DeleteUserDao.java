package com.syrigmophonia.glaxy.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface DeleteUserDao {
    @Delete("DELETE FROM login WHERE id=#{id}")
    public void DeleteUser(@Param("id") int id);
}

