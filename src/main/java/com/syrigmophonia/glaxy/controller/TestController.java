//package com.syrigmophonia.glaxy.controller;
//
//import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
//import com.syrigmophonia.glaxy.service.UserInfoService;
//import com.syrigmophonia.glaxy.util.ResponseVo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.List;
//
//
//@Controller
//public class TestController {
//
//    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
//
//    @Autowired
//    UserInfoService userInfoService;
//
//    @RequestMapping("/userinfo")
//    @ResponseBody
//    public ResponseVo<List<UserInfoDTO>> testController()
//    {
//        List<UserInfoDTO> userInfoDTOS;
//        try {
//            userInfoDTOS =  userInfoService.findUserInfoAll();
//            return ResponseVo.build("200","查询成功",userInfoDTOS);
//        } catch (Exception e) {
//            logger.error("查询异常，服务处理异常{}",e);
//            return ResponseVo.build("500","服务器处理异常");
//        }
//    }
//
//
//
//    @RequestMapping("/picture")
//    @ResponseBody
//    public ResponseVo<String> testUpload(MultipartFile file){
//        try {
//            return ResponseVo.build("200",file.getContentType().toString());
//        }catch (Exception e){
//            return ResponseVo.build("500","异常");
//        }
//    }
//}
