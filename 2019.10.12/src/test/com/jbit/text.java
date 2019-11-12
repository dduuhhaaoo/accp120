package com.jbit;

import cn.smbms.dao.userMapper.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class text {
    @Resource
    private UserService userService;
@Resource
private UserMapper userMapper;
    @Test
    public  void  show1(){
User user=userService.login("admin", "1234567");
        System.out.println(user.toString());
    }

}
