package com.syrigmophonia.glaxy.dao;


import com.syrigmophonia.glaxy.pojo.LoginDto;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LoginDao {
    @Select("select * from login where username = #{username} and password=#{password}")
    public LoginDto login(@Param("username") String username,@Param("password") String password);


}
