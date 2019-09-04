package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.service.ChangePasswordService;
import com.syrigmophonia.glaxy.service.ChangeRecritService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class changeRecritController {
    private static final Logger logger = LoggerFactory.getLogger(changeRecritController.class);


    @Autowired
    ChangeRecritService changeRecritService;

    @PostMapping("/changeRecruit")
    @ResponseBody
    public ResponseVo<String> changeRecritController(@RequestParam("id") int id,@RequestParam("duty") String duty, @RequestParam("dutyName") String dutyName,@RequestParam("describe") String describe, @RequestParam("treatment") String treatment,@RequestParam("studytype") String studytype,@RequestParam("iphone") String iphone) {
        try {
            changeRecritService.changeRecritInfo(id,duty,dutyName,describe,treatment,studytype,iphone);
            return ResponseVo.build("200","修改成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");

        }

    }
}
