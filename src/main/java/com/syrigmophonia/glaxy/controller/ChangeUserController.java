package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.service.ChangePasswordService;
import com.syrigmophonia.glaxy.service.changeUserinfoService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChangeUserController {
    private static final Logger logger = LoggerFactory.getLogger(ChangeUserController.class);


    @Autowired
    changeUserinfoService changeUserinfoService;


    @PostMapping("/changeUerinfo")
    @ResponseBody
    public ResponseVo<String> changepasswordController(@RequestParam("iphone") String iphone,@RequestParam("hobby") String hobby,@RequestParam("age") String age,@RequestParam("email") String email, @RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("roletype") String roletype,@RequestParam("rex") String rex,@RequestParam("id") int id) {
        System.out.println(username);
        try {
            changeUserinfoService.changeUserInfo(iphone,hobby,age,email,username,password,roletype,rex,id);
            return ResponseVo.build("200","修改成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");

        }

    }
}
