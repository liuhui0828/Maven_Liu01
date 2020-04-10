package com.cn.demo02.Service;

import com.cn.demo02.Pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUser();
}
