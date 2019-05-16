package com.wcx.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wcx.MySpringBootApplication;
import com.wcx.entity.User;
import com.wcx.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ProjectName springboot_quick
 * @ClassName RedisTest
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/9 16:33
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class RedisTest {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
//        redisTemplate.opsForValue().set("中文","中文乱码测试");
//        redisTemplate.opsForValue().set("user",users.toString());
    }
    @Test
    public void readRedis(){
        String user = redisTemplate.opsForValue().get("user");
        System.out.println(user);
    }
}
