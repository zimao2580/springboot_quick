package com.wcx.controller;

/**
 * @ProjectName springboot_quick
 * @ClassName QuickStartController
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/5 10:06
 * @Version 1.0
 */

import com.wcx.entity.User;
import com.wcx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuickStartController {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功! name="+name+",age="+age;
    }

    @RequestMapping("/test")
    @ResponseBody
    public List test(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
    @RequestMapping("/read")
    @ResponseBody
    public String readRedis(){
        String user = redisTemplate.opsForValue().get("user");
        return user;
    }

}
