package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.service.SerchRecruitIdService;
import com.syrigmophonia.glaxy.service.SerchUserDataService;
import com.syrigmophonia.glaxy.service.UserInfoService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SerchrecruitIdController {
    private static final Logger logger = LoggerFactory.getLogger(userInfoController.class);

    @Autowired
    SerchRecruitIdService serchRecruitIdService;

    @PostMapping("/serchRecruitId")
    @ResponseBody
    public ResponseVo userinfoController(@Param("id") int id) {
        try {
            recruitDataDto recruitDataDto = serchRecruitIdService.findrecruitInfo(id);
            if (recruitDataDto!=null){
                return ResponseVo.build("200","查询成功",recruitDataDto);
            }else {
                return ResponseVo.build("400","登录失败",null);
            }

        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");
        }

    }

}
