package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import com.syrigmophonia.glaxy.dao.UserInfoDao;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerchRecruitIdService {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    @Autowired
    private SearchcrecruitDao searchcrecruitDao;
    public recruitDataDto findrecruitInfo(int id) {
        recruitDataDto recruitDataDto = searchcrecruitDao.Serchrecruit(id);
        return recruitDataDto;
    }
}
