package com.controller;
import com.main.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Userlogin {
@Autowired
@Qualifier("UserServiceImpl")
private UserService userService;

@RequestMapping("/login")
    public String xx(){

    return  "index.jsp";
}


}
