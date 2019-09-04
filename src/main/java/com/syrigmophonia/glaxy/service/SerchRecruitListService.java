package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SerchRecruitListService {
    private static final Logger logger = LoggerFactory.getLogger(SerchUserDataService.class);

    @Autowired
    private SearchcrecruitDao searchcrecruitDao;

    public List<recruitDataDto> SerchUserData(int sid) {
        List<recruitDataDto> recruitDataDtoList = searchcrecruitDao.SerchrecruitList(sid);
        return recruitDataDtoList;

    }
}
