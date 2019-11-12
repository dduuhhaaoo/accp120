package com.jbit.service;

import com.jbit.mapper.UserMapper;
import com.jbit.pojo.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
public class UserService {
    @Resource
    private UserMapper userMapper;
//spring和mybatis整合的时候 是自动提交
    //在方法当中加入我们的事务控制器
    //必须保持一个业务逻辑层当中方法最好有一个事务

    @Transactional(propagation = Propagation.REQUIRED)
    public  Integer update(){
        User user=new User();
        user.setId(14);
        user.setUserName("赵又廷");
        Integer result = userMapper.update(user);
int a=10/0;
        User user2=new User();
        user2.setId(15);
        user2.setUserName("高圆圆");
        result+=userMapper.update(user2);
           return  result;
    }
}
