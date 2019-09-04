package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.LoginDao;
import com.syrigmophonia.glaxy.pojo.LoginDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private LoginDao loginDao;

    public LoginDto login(String username, String password) {
        LoginDto loginDto = loginDao.login(username, password);
        if (loginDto!=null){
            return loginDto;

        }else {
            return null;
        }

    }
}

