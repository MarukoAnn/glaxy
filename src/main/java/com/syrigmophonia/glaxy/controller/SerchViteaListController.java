package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import com.syrigmophonia.glaxy.service.SerchUserDataService;
import com.syrigmophonia.glaxy.service.SerchViteaListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SerchViteaListController {

    private static final Logger logger = LoggerFactory.getLogger(SerchUserDataController.class);

    @Autowired
    SerchViteaListService serchViteaListService;

    @RequestMapping("/SeachViteaList")
    @ResponseBody
    public List<viteaDataDto> SerchUserData()
    {
        List<viteaDataDto> viteaDataDtoList;
        try {
            viteaDataDtoList =  serchViteaListService.SerchViteaListData();
            return viteaDataDtoList;
        } catch (Exception e) {
//            logger.error("查询异常，服务处理异常{}",e);
            return null;
        }
    }
}
