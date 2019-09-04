package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.ChangePasswordDao;
import com.syrigmophonia.glaxy.dao.changeUserInfoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class changeUserinfoService {
    private static final Logger logger = LoggerFactory.getLogger(changeUserinfoService.class);

    @Autowired
    private com.syrigmophonia.glaxy.dao.changeUserInfoDao changeUserInfoDao;

    public void changeUserInfo(String iphone, String hobby,String age,String email,String username,String password,String roletype,String rex,int id) {
        changeUserInfoDao.ChangeUserinfo(iphone,hobby,age,email,username,password,roletype,rex,id);
    }
}
