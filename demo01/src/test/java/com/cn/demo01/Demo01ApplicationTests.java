package com.cn.demo01;

import com.cn.demo01.Mapper.UserMapper;
import com.cn.demo01.Pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo01ApplicationTests {
UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> allUser = userMapper.getAllUser();
        allUser.forEach(System.out::println);
    }

}
