package com.controller;
import com.alibaba.fastjson.JSON;
import com.main.Online;
import com.main.User;
import com.mapper.UserMapper;
import com.service.OnlineService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;

@Controller


@RequestMapping("/login")
public class Userlogin {
  @Autowired
  @Qualifier("UserServiceImpl")
  private UserService userService;
    @Autowired
    @Qualifier("OnlineServiceImpl")
private OnlineService onlineService;

  @RequestMapping(value = "/newlogin", method = RequestMethod.POST)
  public String login(String username, String password, HttpSession session, HttpServletResponse response,HttpServletRequest request) {

    User login = userService.userlogin(username, password);
    if (login != null) {
        session.setAttribute("username",username);
//            userService.gettime(username);
        Online exist = onlineService.getUsername(username);

        if(exist==null){
            onlineService.InsertOnline(username);
        }
        else {
            onlineService.updateOnline(username);
        }
        return "redirect:/mainchat";
    } else {
      return "/index.jsp";
    }
   }






}
