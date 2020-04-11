package com.cn.demo03.Sevice;

import com.cn.demo03.Pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getAllUsers();
}
