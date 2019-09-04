package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.service.DeleteUserService;
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
public class DelectUserController {
    private static final Logger logger = LoggerFactory.getLogger(ChangeUserController.class);


    @Autowired
    private DeleteUserService deleteUserService;


    @PostMapping("/delectUser")
    @ResponseBody
    public ResponseVo<String> deleteUserController(@RequestParam("id") int id) {
//        System.out.println(username);
        try {
            deleteUserService.DeleteUserInfo(id);
            return ResponseVo.build("200","删除成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}");
            return ResponseVo.build("500","服务器处理异常");

        }

    }
}
