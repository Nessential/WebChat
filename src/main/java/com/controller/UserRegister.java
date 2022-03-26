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

@RequestMapping("/newregiter")
    public String register(User user,HttpSession session){
    userService.userRegister(user);
    return "/WEB-INF/register.jsp";
}
}