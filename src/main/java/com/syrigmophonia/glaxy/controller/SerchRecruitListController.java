package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.service.SerchRecruitListService;
import com.syrigmophonia.glaxy.service.SerchrecruitService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SerchRecruitListController {

    private static final Logger logger = LoggerFactory.getLogger(SearchRecruitController.class);

    @Autowired
    SerchRecruitListService serchRecruitListService;

    @RequestMapping("/SeachrecruitListData")
    @ResponseBody
    public List<recruitDataDto> SerchUserData(@Param("sid") int sid)
    {
        List<recruitDataDto> recruitDataDtoList;
        try {
            recruitDataDtoList =  serchRecruitListService.SerchUserData(sid);
            return recruitDataDtoList;
        } catch (Exception e) {
            return null;
        }
    }
}
