package com.cn.demo01;

import com.cn.demo01.Mapper.UserMapper;
import com.cn.demo01.Pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class Demo01ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        //增
//       User user = new User("zhangsan","123",12);
//       userMapper.insert(user);
        //删
//        userMapper.deleteById(1);
        //改
//        User newUser = new User(3,"langlangChange","1234567Change");
//        userMapper.updateById(newUser);

        //默认字段（create_time,updatetime的更新操作）
        User user = new User("erwa1","1234567dasda",13);
        user.setId(6);
        userMapper.updateById(user);
        //查
//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
    }

}
