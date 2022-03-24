package com.service;

import com.main.Chat;
import com.mapper.ChatMapper;

import java.util.List;

public class ChatServiceImpl implements ChatService{
    private ChatMapper chatMapper;
    @Override
    public List<Chat> getChat(int n) {
        return null;
    }

    @Override
    public int newChat(Chat chat) {
        return this.chatMapper.newChat(chat);
    }
}
