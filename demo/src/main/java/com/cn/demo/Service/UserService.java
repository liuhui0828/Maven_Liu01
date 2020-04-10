package com.cn.demo.Service;

import com.cn.demo.Pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<UserInfo> getAllUsers();
}
