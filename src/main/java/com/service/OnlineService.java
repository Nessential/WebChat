package com.service;

import com.main.Online;

public interface OnlineService {

    //获取用户名
    Online getUsername(String username);
    int InsertOnline(String username);
    int updateOnline(String username);
}
