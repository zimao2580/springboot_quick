package com.wcx.test;

/**
 * @ProjectName springboot_quick
 * @ClassName MapperTest
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/9 9:50
 * @Version 1.0
 */
import com.wcx.MySpringBootApplication;
import com.wcx.entity.User;
import com.wcx.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
//        for (User user:users
//             ) {
//            System.out.println(user.getId()+user.getName()+user.getPassword()+user.getUsername());
//        }
    }
}