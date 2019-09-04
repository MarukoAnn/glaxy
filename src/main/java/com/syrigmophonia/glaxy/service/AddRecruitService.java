package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.InsertUserDao;
import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddRecruitService {
    private static final Logger logger = LoggerFactory.getLogger(AddRecruitService.class);

    @Autowired
    private SearchcrecruitDao searchcrecruitDao;

    public void addRecritInfo(String duty,String dutyName,String treatment,String iphone,String describe,String studytype,int sid) {
        searchcrecruitDao.InsertChrecruitData(duty,dutyName,treatment,iphone,describe,studytype,sid);
    }
}
