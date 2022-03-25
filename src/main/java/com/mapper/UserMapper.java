package com.mapper;
import com.main.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
  /*  public User getUsername(String username);
    public User getUserpwd(String username);*/

public User userlogin(@Param("username") String username, @Param("password") String password);
public User userRegister(User user);
 List<User> getUser(String name);
}
