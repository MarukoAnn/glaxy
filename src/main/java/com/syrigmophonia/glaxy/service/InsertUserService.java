package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.InsertUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserService {
    private static final Logger logger = LoggerFactory.getLogger(InsertUserService.class);

    @Autowired
    private InsertUserDao insertUserDao;

    public void changeUserInfo(String username, String password,String roletype,String rex,String iphone) {
        insertUserDao.insertUserData(username,password,roletype,rex,iphone);
    }
}
