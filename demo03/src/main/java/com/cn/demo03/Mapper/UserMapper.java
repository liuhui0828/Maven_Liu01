package com.cn.demo03.Mapper;

import com.cn.demo03.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<User> getAllUsers();
}
