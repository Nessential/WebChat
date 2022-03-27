package com.controller;

import com.alibaba.fastjson.JSON;
import com.main.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController

@Scope(value="prototype")
@RequestMapping("/get")
public class GetImformation {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @RequestMapping("/inform")
    public String getUser(String username){

        return JSON.toJSONString(userService.getUser(username));
    }

}