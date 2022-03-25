package com.service;
import com.main.User;
import com.mapper.UserMapper;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserMapper usermapper;


    public void setUserMapper(UserMapper usermapper) {
    this.usermapper = usermapper;
    }


    @Override
    public User userRegister(User user) {
        return usermapper.userRegister(user);
    }

    @Override
    public List<User> getUser(String username) {
        return usermapper.getUser(username);
    }

    @Override
    public User userlogin(String username, String password) {
        return usermapper.userlogin(username,password);
    }




}
