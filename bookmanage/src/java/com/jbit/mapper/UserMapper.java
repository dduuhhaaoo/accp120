package com.jbit.mapper;

import com.jbit.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
public User getlogin(@Param("name") String name);

}
