package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.UserInfoDao;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("com.syrigmophonia.glaxy.dao")
public class UserInfoService {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    @Autowired
    private UserInfoDao userInfoDao;
    public UserInfoDTO findUserInfoAll(int id) {
        UserInfoDTO userInfoDTO = userInfoDao.userInfo(id);
        return userInfoDTO;
    }
}
