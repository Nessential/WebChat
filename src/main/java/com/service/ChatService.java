package com.service;

import com.main.Chat;

import java.util.List;

public interface ChatService {
    List<Chat> getChat(int n);
    int newChat(Chat chat);
    List<Chat> getChatByTime(long timestamp);
    long Addtime(Chat chat);

}
