package com.service;

import com.main.Chat;
import com.mapper.ChatMapper;

import java.util.List;

public class ChatServiceImpl implements ChatService{
    public ChatMapper getChatMapper() {
        return chatMapper;
    }

    public void setChatMapper(ChatMapper chatMapper) {
        this.chatMapper = chatMapper;
    }

    public ChatServiceImpl() {
    }

    public ChatServiceImpl(ChatMapper chatMapper) {
        this.chatMapper = chatMapper;
    }

    private ChatMapper chatMapper;
    @Override
    public List<Chat> getChat(int n) {
        return this.chatMapper.getChat(n);
    }

    @Override
    public List<Chat> getChatByTime(long timestamp) {
        return this.chatMapper.getChatByTime(timestamp);
    }

    @Override
    public long Addtime(Chat chat) {
        long addtime = 15*60*1000;
        String name =chat.getName();
        return this.chatMapper.Addtime(name,addtime);
    }

    @Override
    public int newChat(Chat chat) {
//      System.currentTimeMillis()  获取时间戳
        chat.setTime(System.currentTimeMillis());
        return this.chatMapper.newChat(chat);
    }
}
