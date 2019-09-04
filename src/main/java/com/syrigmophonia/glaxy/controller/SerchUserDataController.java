package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.service.SerchUserDataService;
import com.syrigmophonia.glaxy.service.UserInfoService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SerchUserDataController {
    private static final Logger logger = LoggerFactory.getLogger(SerchUserDataController.class);

    @Autowired
    SerchUserDataService serchUserDataService;

    @RequestMapping("/SeachUserData")
    @ResponseBody
    public List<UserInfoDTO> SerchUserData()
    {
        List<UserInfoDTO> userInfoDTOS;
        try {
            userInfoDTOS =  serchUserDataService.SerchUserData();
            return userInfoDTOS;
        } catch (Exception e) {
//            logger.error("查询异常，服务处理异常{}",e);
            return null;
        }
    }
}
