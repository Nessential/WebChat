package com.controller;

import com.main.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/register")
public class UserRegister {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

@RequestMapping("/newregister")
    public String register(String username,String password,String picture,HttpSession session){
//判断用户名是否包含中英文
    Pattern p = Pattern.compile("^[a-zA-Z\\u4e00-\\u9fa5]+$");
    Matcher m = p.matcher(username);
//    若用户名合法且密码和头像都不为空，允许登录
    if(m.find() & password!=null & picture!=null) {
        userService.register(username, password, picture);
        return "redirect:/login";
    }
    return "redirect:/register";
}
}
