package com.mapper;

import com.main.Online;
import org.apache.ibatis.annotations.Param;

public interface OnlineMapper {
    public Online getUsername(@Param("username")String username);
    int InsertOnline(@Param("username") String username,@Param("overdue") long time);
    int updateOnline(@Param("username") String username ,@Param("overdue") long time);
}
