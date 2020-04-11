package com.cn.demo01.Service;

import com.cn.demo01.Pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUser();

    public User getUserByUsername(String username);
    public int insertUser(User user);
}
