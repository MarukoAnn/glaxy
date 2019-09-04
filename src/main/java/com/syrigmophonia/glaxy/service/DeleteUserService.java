package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.DeleteUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserService {
    private static final Logger logger = LoggerFactory.getLogger(DeleteUserService.class);

    @Autowired
    private DeleteUserDao DeleteUserInfo;

    public void DeleteUserInfo(int id) {
        DeleteUserInfo.DeleteUser(id);
    }
}
