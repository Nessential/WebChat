package com.controller;

import com.main.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/register")
public class UserRegister {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

@RequestMapping("/newregister")
    public String register(String username,String password,String picture,HttpSession session){
        userService.register(username,password,picture);
        return "redirect:/login";
}
}
