package com.cn.demo03.Controller;

import com.cn.demo03.Pojo.User;
import com.cn.demo03.Sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getAllUsers")
    public Object getAllUsers(){
        List<User> users= userService.getAllUsers();
        return users;

    }
}
