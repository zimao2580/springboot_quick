package com.wcx.springboot_quick2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName springboot_quick
 * @ClassName HelloController
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/7 11:50
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/hai")
    @ResponseBody
    public String hai(){
        return "hai";
    }
}
