package com.jzf.thymeleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "demo";
    }
}
