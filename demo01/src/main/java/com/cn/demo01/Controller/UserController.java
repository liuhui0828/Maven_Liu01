package com.cn.demo01.Controller;


import com.cn.demo01.Pojo.User;
import com.cn.demo01.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public Object getAllUser(){
        List<User> users = userService.getAllUser();
        return users;
    }

}
