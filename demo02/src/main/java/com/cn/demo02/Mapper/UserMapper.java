package com.cn.demo02.Mapper;

import com.cn.demo02.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Repository
public interface UserMapper {
    public List<User> getAllUser();
}
