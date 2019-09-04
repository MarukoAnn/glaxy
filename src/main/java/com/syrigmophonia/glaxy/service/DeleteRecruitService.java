package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.DeleteUserDao;
import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteRecruitService {
    private static final Logger logger = LoggerFactory.getLogger(DeleteRecruitService.class);

    @Autowired
    private SearchcrecruitDao searchcrecruitDao;

    public void DeleteUserInfo(int id) {
        searchcrecruitDao.Deleterecruit(id);
    }
}
