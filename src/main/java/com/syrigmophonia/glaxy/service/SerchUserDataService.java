package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.LoginDao;
import com.syrigmophonia.glaxy.dao.SerchUserDao;
import com.syrigmophonia.glaxy.pojo.LoginDto;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerchUserDataService {
    private static final Logger logger = LoggerFactory.getLogger(SerchUserDataService.class);

    @Autowired
    private SerchUserDao serchUserDao;

    public List<UserInfoDTO> SerchUserData() {
        List<UserInfoDTO> userInfoDTOSList = serchUserDao.SerchallData();
        return userInfoDTOSList;

    }
}
