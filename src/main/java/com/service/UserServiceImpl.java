package com.service;
import com.main.Chat;
import com.main.User;
import com.mapper.UserMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

import static sun.awt.util.PerformanceLogger.setTime;
@Component
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

    @Override
    public User AddUsername(String username) {
        return usermapper.AddUsername(username);
    }

    @Override
    public User AddPassword(String password) {
        return usermapper.AddPassword(password);
    }

    @Override
    public User AddPicture(String picture) {
        return usermapper.AddPicture(picture);
    }

    @Override
    public int register(String username, String password,String picture) {

        return usermapper.register(username,password,picture);
    }


    @Override
    public List<User> getUser(String username) {
        return usermapper.getUser(username);
    }

    @Override
    public User userlogin(String username, String password) {
        return usermapper.userlogin(username,password);
    }

    @Override
    public long gettime(String username) {
      long time = System.currentTimeMillis();
//      设置过期时间
            return usermapper.gettime(username,time+1*60*1000);
    }
//每隔一分钟执行一词
    @Scheduled(cron ="0 */1 * * * ?")
    public void delectTime(){
        long nowTime=System.currentTimeMillis();
        usermapper.delectTime(nowTime);
    }

}
