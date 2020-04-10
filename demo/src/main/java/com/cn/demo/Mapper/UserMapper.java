package com.cn.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cn.demo.Pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper extends BaseMapper<UserInfo> {

}
