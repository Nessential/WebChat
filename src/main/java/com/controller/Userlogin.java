package com.controller;
import com.main.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

@Controller
@RequestMapping("/login")
public class Userlogin {
  @Autowired
  @Qualifier("UserServiceImpl")
  private UserService userService;

  @RequestMapping("/newlogin")
//  我们在Controller层的Action类中编写的方法返回值通常会有三种：
//  ModelAndView、String、Void；通常在项目中使用时，若不使用ajax传递数据，
//  则选择使用String返回值；如果使用ajax,则使用void返回值；ModelAndView的返回值几乎不使用！\

  public  String login(User user) {

    User login = userService.userlogin(user);

  if(login !=null){
   
    return "/WEB-INF/test.jsp";
    
}
  else{
    return "/index.jsp";
  }





/*    ModelAndView mv = new ModelAndView();
    User login = userService.userlogin(user);

//根据用户名和密码查询user，如果存在，则跳转到 success.jsp 页面
    if (login != null) {
      mv.addObject("username", login.getUsername());
      mv.addObject("user", login.getPassword());
      mv.setViewName("/WEB-INF/test.jsp");
    } else {
      //如果不存在，则跳转到 login.jsp页面重新登录
      return new ModelAndView("redirect:/index.jsp");
    }
    return mv;*/
  }
}
