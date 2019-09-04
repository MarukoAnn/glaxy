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
public class AddRecruitController {

    private static final Logger logger = LoggerFactory.getLogger(ChangepasswordController.class);


    @Autowired
    AddRecruitService addRecruitService;


    @PostMapping("/addRecruitdata")
    @ResponseBody
    public ResponseVo<String> addRecruitController(@RequestParam("duty") String duty, @RequestParam("dutyName") String dutyName, @RequestParam("treatment") String treatment, @RequestParam("iphone") String iphone, @RequestParam("describe") String describe, @RequestParam("studytype") String studytype, @RequestParam("sid") int sid) {
        try {
            addRecruitService.addRecritInfo(duty,dutyName,treatment,iphone,describe,studytype,sid);
            return ResponseVo.build("200","添加成功");
        } catch (Exception e) {
            logger.error("查询异常，服务处理异常{}",e);
            return ResponseVo.build("500","服务器处理异常");
        }

    }
}
