package com.cn.demo.Service.Impl;

import com.cn.demo.Mapper.UserMapper;
import com.cn.demo.Pojo.UserInfo;
import com.cn.demo.Service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getAllUsers() {

        return userMapper.selectList(null);

    }
}


