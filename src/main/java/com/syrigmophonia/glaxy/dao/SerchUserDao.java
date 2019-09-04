package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.LoginDto;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SerchUserDao {
    @Select("select * from login")
    public List<UserInfoDTO> SerchallData();
}
