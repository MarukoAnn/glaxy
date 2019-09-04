package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import com.syrigmophonia.glaxy.dao.SerchIdtableDao;
import com.syrigmophonia.glaxy.dao.viteatableDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeViteaDataService {
    private static final Logger logger = LoggerFactory.getLogger(ChangeViteaDataService.class);

    @Autowired
    private SerchIdtableDao serchIdtableDao;

    public void changeViteaData(int rid,int sid) {
        serchIdtableDao.ChangeViteaData(rid,sid);
    }
}
