package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.service.ChangePasswordService;
import com.syrigmophonia.glaxy.service.ChangeViteaDataService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChangeViteaDataController {

    private static final Logger logger = LoggerFactory.getLogger(ChangeViteaDataController.class);


    @Autowired
    ChangeViteaDataService changeViteaDataService;


    @PostMapping("/changeViteaRid")
    @ResponseBody
    public ResponseVo<String> changeViteaDataController(@RequestParam("rid") int rid, @RequestParam("sid") int sid) {
        try {
            changeViteaDataService.changeViteaData(rid,sid);
            return ResponseVo.build("200","修改成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");

        }

    }
}
