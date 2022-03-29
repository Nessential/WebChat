package com.mapper;
import com.main.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    public User getUsername(String username);
   public User getUserpwd(String password);


public User userlogin(@Param("username") String username, @Param("password") String password);
//注册
public User AddUsername(String username);
public User AddPassword(String password);
public User AddPicture(String picture);

public int register(@Param("username") String username,@Param("password") String password,@Param("picture") String picture);

List<User> getUser(String username);
public long gettime(@Param("username") String username,@Param("time") long time);
public void delectTime(long nowtime);
//获取在线用户
    List<User> getOnline();
}
