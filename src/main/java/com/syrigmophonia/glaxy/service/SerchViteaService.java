package com.syrigmophonia.glaxy.service;

import com.syrigmophonia.glaxy.dao.SearchcrecruitDao;
import com.syrigmophonia.glaxy.dao.SerchIdtableDao;
import com.syrigmophonia.glaxy.dao.viteatableDao;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerchViteaService {
    private static final Logger logger = LoggerFactory.getLogger(SerchUserDataService.class);

    @Autowired
    private SerchIdtableDao serchIdtableDao;

    public List<viteaDataDto> SerchViteaData(int sid) {
        List<viteaDataDto> viteaDataDto = serchIdtableDao.SerchData(sid);
        return viteaDataDto;

    }
}
