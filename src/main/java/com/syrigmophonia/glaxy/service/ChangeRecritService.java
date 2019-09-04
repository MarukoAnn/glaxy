package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeRecritService {
    private static final Logger logger = LoggerFactory.getLogger(ChangeRecritService.class);

    @Autowired
    private SearchcrecruitDao searchcrecruitDao;

    public void changeRecritInfo(int id,String duty,String dutyName,String describe,String treatment,String studytype,String iphone) {
        searchcrecruitDao.ChangeChrecruitData(id,duty,dutyName,treatment,iphone,describe,studytype);
    }
}
