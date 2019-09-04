package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.service.AddRecruitService;
import com.syrigmophonia.glaxy.service.InsertUserService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InserDataController {

    private static final Logger logger = LoggerFactory.getLogger(ChangepasswordController.class);


    @Autowired
    InsertUserService insertUserService;


    @PostMapping("/addUserdata")
    @ResponseBody
    public ResponseVo<String> addUserController(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("roletype") String roletype, @RequestParam("iphone") String iphone, @RequestParam("rex") String rex) {
        try {
            insertUserService.changeUserInfo(username,password,roletype,rex,iphone);
            return ResponseVo.build("200","添加成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");
        }

    }
}
