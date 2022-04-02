package com.service;

import com.main.Online;
import com.mapper.OnlineMapper;

public class OnlineServiceImpl implements OnlineService {
    OnlineMapper onlineMapper;

    public OnlineMapper getOnlineMapper() {
        return onlineMapper;
    }

    public void setOnlineMapper(OnlineMapper onlineMapper) {
        this.onlineMapper = onlineMapper;
    }

    @Override
    public Online getUsername(String username) {
        return onlineMapper.getUsername(username);
    }

    @Override
    public int InsertOnline(String username) {
        long time = System.currentTimeMillis();
        return onlineMapper.InsertOnline(username,time+1*60*1000);
    }

    @Override
    public int updateOnline(String username) {
        long time = System.currentTimeMillis();
        return onlineMapper.updateOnline(username,time+1*6*1000);
    }
}
