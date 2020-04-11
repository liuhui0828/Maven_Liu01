package com.cn.demo01.Controller;


import com.cn.demo01.Pojo.User;
import com.cn.demo01.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public Object getAllUser(){
        List<User> users = userService.getAllUser();
        return users;
    }

   /**
    * @author liuhui
    * @Description:
           
    * @date 2020/4/11 17:39
    * @param [username, password]
    * @return java.lang.String
    */
    @GetMapping("/userLogin")
    public String userLogin(String username, String password, Map<String,Object> map){
        //1.将传入的数据进行封装成User
        //2.按照username查找数据，是否有，如果有的话就是登录成功，返index,若没有，登陆失败，返回error.html;
        User user = userService.getUserByUsername(username);
        if (user!=null){
            return "index";
        }else{
            map.put("info","登陆失败");
            return "error";
        }
    }

    @GetMapping("/Register")
    public String Register(){
        //这里设置cookie和session
        return "register";
    }

    /*
     * @author liuhui
     * @Description:
            用户注册
     * @date 2020/4/11 18:05
     * @param [username, password]
     * @return java.lang.String
     */
    @GetMapping("/Register.do")
    public String insertUser(String name, String psd, Map<String,Object> map){
        User user = new User(name,psd);
        if(userService.insertUser(user)!=0){

            map.put("successInfo","注册成功");
            return "Success";
        }else{
            map.put("info","注册失败");
            return "error";
        }
    }
}
