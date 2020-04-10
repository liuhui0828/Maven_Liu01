package com.cn.demo02.Service.Impl;

import com.cn.demo02.Mapper.UserMapper;
import com.cn.demo02.Pojo.User;
import com.cn.demo02.Service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }
}
