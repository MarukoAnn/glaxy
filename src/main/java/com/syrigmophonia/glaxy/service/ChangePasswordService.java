package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.ChangePasswordDao;
import com.syrigmophonia.glaxy.dao.LoginDao;
import com.syrigmophonia.glaxy.pojo.LoginDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangePasswordService {
    private static final Logger logger = LoggerFactory.getLogger(ChangePasswordService.class);

    @Autowired
    private ChangePasswordDao changePasswordDao;

    public void changePassword(String password, int id) {
        changePasswordDao.ChangePassword(password, id);
    }
}
