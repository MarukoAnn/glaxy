package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import com.syrigmophonia.glaxy.service.SerchRecruitIdService;
import com.syrigmophonia.glaxy.service.ViteaListDataService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViteaListController {
    private static final Logger logger = LoggerFactory.getLogger(userInfoController.class);

    @Autowired
    ViteaListDataService viteaListDataService;

    @PostMapping("/serchviteaId")
    @ResponseBody
    public ResponseVo userinfoController(@Param("id") int id) {
        try {
            viteaDataDto viteaDataDto = viteaListDataService.findrecruitInfo(id);
            if (viteaDataDto!=null){
                return ResponseVo.build("200","查询成功",viteaDataDto);
            }else {
                return ResponseVo.build("400","登录失败",null);
            }

        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");
        }

    }
}
