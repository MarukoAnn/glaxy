package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.service.ChangePasswordService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChangepasswordController {
    private static final Logger logger = LoggerFactory.getLogger(ChangepasswordController.class);


    @Autowired
    ChangePasswordService changePasswordService;


    @PostMapping("/changepassword")
    @ResponseBody
    public ResponseVo<String> changepasswordController(@RequestParam("password") String password, @RequestParam("id") int id) {
        try {
            changePasswordService.changePassword(password,id);
              return ResponseVo.build("200","修改成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");

        }

    }
}
