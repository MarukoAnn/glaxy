package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserInfoDao {
    @Select("SELECT uid,username,`name`,`password`,salt,state FROM user_info")
    public List<UserInfoDTO> findUserInfoAll();
}
