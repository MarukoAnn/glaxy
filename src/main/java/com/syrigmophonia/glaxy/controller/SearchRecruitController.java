package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.service.SerchUserDataService;
import com.syrigmophonia.glaxy.service.SerchrecruitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SearchRecruitController {
    private static final Logger logger = LoggerFactory.getLogger(SearchRecruitController.class);

    @Autowired
    SerchrecruitService serchrecruitService;

    @RequestMapping("/SeachrecruitData")
    @ResponseBody
    public List<recruitDataDto> SerchUserData()
    {
        List<recruitDataDto> recruitDataDtoList;
        try {
            recruitDataDtoList =  serchrecruitService.SerchUserData();
            return recruitDataDtoList;
        } catch (Exception e) {
//            logger.error("查询异常，服务处理异常{}",e);
            return null;
        }
    }
}
