package com.controller;

import com.alibaba.fastjson.JSON;
import com.main.User;
import com.mapper.UserMapper;
import com.service.ChatService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
//根据用户名查询user表里的信息
@RequestMapping("/get")
public class GetImformation {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    private ChatService chatService;

    @RequestMapping("/getusers")
    public String getUser(String username){
        return JSON.toJSONString(userService.getUser(username));
    }

//获取在线列表
@RequestMapping("getOnline")

    public String getOnline(){
            long nowTime=System.currentTimeMillis();
            userService.delectTime(nowTime);
        return JSON.toJSONString(userService.getOnline());
}


//增加后台在线时间
    @RequestMapping("addOnlineTime")
    public void addOnlineTime(String username){
            userService.gettime(username);
    }
}