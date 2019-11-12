package com.jbit.test;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springmvc.xml")
public class UserTest {
    @Resource
    private UserService service;

    public static void main(String[] args) {
        System.out.println("aaa");
    }
 @Test
    public void  test01(){
        User user = service.getUserById("1");
        System.out.println(user);
    }
}
