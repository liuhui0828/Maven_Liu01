package com.cn.demo02;

import com.cn.demo02.Mapper.UserMapper;
import com.cn.demo02.Pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo02ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
    }

}
