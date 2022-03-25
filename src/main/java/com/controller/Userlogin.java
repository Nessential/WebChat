package com.controller;
import com.alibaba.fastjson.JSON;
import com.main.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

  @RequestMapping(value = "/newlogin", method = RequestMethod.GET)
  public String login(String username, String password, HttpSession session, Model model) {

    User login = userService.userlogin(username, password);
    session.setAttribute("user",username);
//    ModelAndView mv = new ModelAndView();
    if (login != null) {
//mv.setViewName("/index.jsp");
      return "/WEB-INF/test.jsp";
    } else {
      return "/index.jsp";
    }
   }
   @RequestMapping (value = "/username" ,method = RequestMethod.GET)
   public String login(String username, String password){
     User login = userService.userlogin(username, password);
       return JSON.toJSONString(userService.getUser(username));
   }




}
