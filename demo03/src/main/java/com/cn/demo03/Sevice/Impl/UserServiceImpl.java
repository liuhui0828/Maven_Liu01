package com.cn.demo03.Sevice.Impl;

import com.cn.demo03.Mapper.UserMapper;
import com.cn.demo03.Pojo.User;
import com.cn.demo03.Sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

//    @Override
//    public List<User> getAllUsers() {
//        return null;
//    }

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();

    }

}
