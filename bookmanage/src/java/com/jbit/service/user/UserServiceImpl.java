package com.jbit.service.user;

import com.jbit.mapper.UserMapper;
import com.jbit.pojo.User;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(String name, String userPassword) {

            User user = null;
                user = userMapper.getlogin(name);
           if(!user.getPassword().equals(userPassword)) {
               System.out.println("密码错误");
               user = null;

           }
        return user;
    }
    }

