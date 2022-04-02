package com.controller;

import com.main.Online;
import com.service.OnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class OnlineController {
    @Autowired
    @Qualifier("OnlineServiceImpl")
    private OnlineService onlineService;
    @RequestMapping("/online")
    public void insertOnline(String username){
        Online exist = onlineService.getUsername(username);
        if(exist==null){
                onlineService.InsertOnline(username);
        }
        else {
                onlineService.updateOnline(username);
        }


    }
}
