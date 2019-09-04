package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SerchUserDao;
import com.syrigmophonia.glaxy.dao.viteatableDao;
import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerchViteaListService {
    private static final Logger logger = LoggerFactory.getLogger(SerchViteaListService.class);

    @Autowired
    private viteatableDao viteatableDao;

    public List<viteaDataDto> SerchViteaListData() {
        List<viteaDataDto> viteaDataDtoList = viteatableDao.SerchviteaData();
        return viteaDataDtoList;

    }
}
