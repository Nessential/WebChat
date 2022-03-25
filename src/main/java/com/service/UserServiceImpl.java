package com.service;
import com.main.User;
import com.mapper.UserMapper;
public class UserServiceImpl implements UserService{

    private UserMapper usermapper;


    public void setUserMapper(UserMapper usermapper) {
    this.usermapper = usermapper;
    }



    @Override
    public User userlogin(User user) {
        return usermapper.userlogin(user);
    }




}
