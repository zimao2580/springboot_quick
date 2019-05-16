package com.wcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName springboot_quick
 * @ClassName HelloController
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/7 11:09
 * @Version 1.0
 */

@Controller
public class HelloController {
    @RequestMapping("/cx")
    @ResponseBody
    public String hello()
    {
        return "hello zimao";
    }

}
