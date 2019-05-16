package com.wcx.controller;

import com.wcx.entity.User;
import com.wcx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName springboot_quick
 * @ClassName MapperController
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/7 17:45
 * @Version 1.0
 */
@Controller
public class MapperController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/queryUser1")
    @ResponseBody
    public List<User> queryUser1(){
        List<User> users = userMapper.queryUserList1();
        return users;
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public List<User> insertUser(){
         userMapper.insertUser();
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public List<User> updateUser(){
        userMapper.updateUser();
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public List<User> deleteUser(){
        userMapper.deleteUser();
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
