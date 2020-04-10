package com.cn.demo01.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cn.demo01.Pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
