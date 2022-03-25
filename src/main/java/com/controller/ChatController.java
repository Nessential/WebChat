package com.controller;

import com.alibaba.fastjson.JSON;
import com.main.Chat;
import com.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    @Qualifier("ChatServiceImpl")
    private ChatService chatService;

    @RequestMapping("/newchat")
    public String newChat(Chat chat){
        System.out.println(chat);
        chatService.newChat(chat);
        return "你妈的";
    }

    @RequestMapping("/getchat")
    public String getChat(int n){
        System.out.println(n);
        return JSON.toJSONString(chatService.getChat(n));
    }
    @RequestMapping("/getChatByTime")
    public String getChatByTime(int timestamp){
        return JSON.toJSONString(chatService.getChatByTime(timestamp));
    }
}
