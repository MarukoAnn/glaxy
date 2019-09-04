package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import com.syrigmophonia.glaxy.dao.viteatableDao;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddViteaService {
    private static final Logger logger = LoggerFactory.getLogger(AddViteaService.class);

    @Autowired
    private viteatableDao viteatableDao;

    public void addViteaInfo(String name,String dutyName,String treatment,String studytype,String describe,String sex,String iphone,int sid) {
        viteatableDao.InsertviteaData(name, dutyName, treatment,studytype,describe,sex,iphone,sid);
    }
}
