package com.cn.demo.Controller;

import com.cn.demo.Pojo.UserInfo;
import com.cn.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/userInfo")
public class UserController {

        @Autowired
        UserService userService;
        @GetMapping("/getAllUsers")
        public Object getAllUsers(){
            List<UserInfo> users = userService.getAllUsers();
        return users;
    }

}
