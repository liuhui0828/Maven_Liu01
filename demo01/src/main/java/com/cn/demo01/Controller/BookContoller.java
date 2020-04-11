package com.cn.demo01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("book")
public class BookContoller {

    @GetMapping("getbook")
    public void getbook(){
        return;
    }
}
