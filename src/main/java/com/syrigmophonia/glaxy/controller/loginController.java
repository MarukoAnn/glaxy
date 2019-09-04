package com.syrigmophonia.glaxy.controller;

import com.syrigmophonia.glaxy.dao.LoginDao;
import com.syrigmophonia.glaxy.pojo.LoginDto;
import com.syrigmophonia.glaxy.service.ChangePasswordService;
import com.syrigmophonia.glaxy.service.LoginService;
import com.syrigmophonia.glaxy.util.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class loginController {
    private static final Logger logger = LoggerFactory.getLogger(loginController.class);

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseVo loginController(@Param("username") String username, @Param("password") String password) {
        System.out.println(username);
        try {
            LoginDto  loginDto = loginService.login(username,password);
            if (loginDto!=null){
                return ResponseVo.build("200","登录成功",loginDto);
            }else {
                return ResponseVo.build("400","登录失败",loginDto);
            }

        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");
        }

    }
}
