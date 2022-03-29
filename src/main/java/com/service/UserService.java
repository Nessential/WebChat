package com.service;
import com.main.User;

import java.util.List;

public interface UserService {
        public User getUsername(String username);
      public User getUserpsw(String password);


      public User AddUsername(String username);
      public User AddPassword(String password);
      public User AddPicture(String picture);
         public int register(String username,String password,String picture);
       List<User> getUser(String username);
       public User userlogin(String username ,String password);
      public long gettime(String username);
//获取在线用户
    List<User> getOnline();

}
