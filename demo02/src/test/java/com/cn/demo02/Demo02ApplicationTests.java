package com.cn.demo02;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

        User user = new User("erwa","123",18);
        userMapper.insert(user);
//        User user = userMapper.selectById(9);
//        user.setUsername("er");
//        userMapper.updateById(user);
    }

    //删
    @Test
    public void delete_MP(){
        userMapper.deleteById(10);
    }

    @Test
    public void page(){
        Page<User> userPage = new Page<>(1,5);
        userMapper.selectPage(userPage,null);
        for (User user:userPage.getRecords()) {
            System.out.println(user.toString());
        }
        System.out.println(userPage.getTotal());
//        userPage.getRecords().forEach(System.out::println);
    }

}
