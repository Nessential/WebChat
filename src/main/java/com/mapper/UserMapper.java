package com.mapper;
import com.main.User;


public interface UserMapper {
    public User getUsername(int uid);
    public User getUserpwd(int uid);

}
