package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.LoginDto;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInfoDao {
    @Select("select * from login where id = #{id}")
    public UserInfoDTO userInfo(@Param("id") int id);
}
