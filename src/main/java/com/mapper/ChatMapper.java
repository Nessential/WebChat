package com.mapper;

import com.main.Chat;

import java.util.List;

public interface ChatMapper {

    List<Chat> getChat(int n);

    int newChat(Chat chat);
    List<Chat> getChatByTime(long timestamp);
}
