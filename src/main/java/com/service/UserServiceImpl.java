package com.service;
import com.main.User;
import com.mapper.UserMapper;
public class UserServiceImpl implements UserService{
    private UserMapper usermapper;


    public void setUserMapper(UserMapper usermapper) {
    this.usermapper = usermapper;
    }


    @Override
    public User getUsername(String username) {
        return usermapper.getUsername(username);
    }



    @Override
    public User getUserpsw(String password) {
        return usermapper.getUserpwd(password);
    }

}
