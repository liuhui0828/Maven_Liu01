package com.cn.demo01.Controller;


import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class PageContorller {
    @GetMapping("/index")
        public String index(Map<String,Object> map){
            //这里设置cookie和session
            map.put("name","langlang");
            return "index";
    }
    @GetMapping("/")
    public String index1(Map<String,Object> map){
        map.put("name","dada");
        return "Index";
    }

    @GetMapping("/login")
    public String login(Map<String,Object> map){
        //这里设置cookie和session
        map.put("name","langlang");
        return "login";
    }


//    @GetMapping("/Register")
//    public String Register(){
//        //这里设置cookie和session
//        return "redirect:register";
//    }

}
