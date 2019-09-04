package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import com.syrigmophonia.glaxy.service.SerchRecruitListService;
import com.syrigmophonia.glaxy.service.SerchViteaService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SerchViteaController {

    private static final Logger logger = LoggerFactory.getLogger(SerchViteaController.class);

    @Autowired
    SerchViteaService serchViteaService;

    @GetMapping("/SeachViteaData")
    @ResponseBody
    public List<viteaDataDto> SerchViteaData(@RequestParam("sid") int sid)
    {

        try {
            List<viteaDataDto> viteaDataDtoList = serchViteaService.SerchViteaData(sid);
            return viteaDataDtoList;
        } catch (Exception e) {
            return null;
        }
    }
}
