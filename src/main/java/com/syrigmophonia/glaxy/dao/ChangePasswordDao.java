package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.LoginDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface ChangePasswordDao {
    @Update("UPDATE login SET password=#{password} WHERE id=#{id}")
    public void ChangePassword(@Param("password") String password, @Param("id") int id);
}
