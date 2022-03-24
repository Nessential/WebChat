package com.controller;

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

    @RequestMapping("/newChat")
    public String newChat(Chat chat){
        System.out.println(chat);
        chatService.newChat(chat);
        return "新对话插入成功";
    }
}
