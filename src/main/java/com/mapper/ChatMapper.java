package com.mapper;

import com.main.Chat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatMapper {

    List<Chat> getChat(int n);


    int newChat(Chat chat);
    List<Chat> getChatByTime(long timestamp);
    long Addtime(@Param("username") String name, @Param("addtime") long addtime);
}
