package com.service;
import com.main.User;

import java.util.List;

public interface UserService {
//        public User getUsername(User user);
//        public User getUserpsw(User user);

       public User userRegister(User user);
       List<User> getUser(String username);
       public User userlogin(String username ,String password);
}
