package com.wcx.mapper;

import com.wcx.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ProjectName springboot_quick
 * @InterfaceName UserMapper
 * @Description //TODO
 * @Author WCX
 * @Date 2019/5/7 17:13
 * @Version 1.0
 */
@Mapper
public interface UserMapper  {
    public List<User> queryUserList();

    @Select("select * from user where id=1")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password")
    })
    List<User> queryUserList1();
    @Insert("insert into user(username,password,name) values('wangwu','123','wangwu')")
    void insertUser();

    @Update("update user set name='王五' where username='wangwu'")
    void updateUser();
    @Delete("delete from user where id=4")
    void deleteUser();
}
