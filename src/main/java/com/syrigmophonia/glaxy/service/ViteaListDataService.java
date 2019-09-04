package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import com.syrigmophonia.glaxy.dao.viteatableDao;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViteaListDataService {

    private static final Logger logger = LoggerFactory.getLogger(ViteaListDataService.class);

    @Autowired
    private viteatableDao viteatableDao;
    public viteaDataDto findrecruitInfo(int id) {
        viteaDataDto viteaDataDto = viteatableDao.SerchviteaListData(id);
        return viteaDataDto;
    }
}
