package com.cn.demo01.Service.Impl;

import com.cn.demo01.Mapper.UserMapper;
import com.cn.demo01.Pojo.User;
import com.cn.demo01.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
