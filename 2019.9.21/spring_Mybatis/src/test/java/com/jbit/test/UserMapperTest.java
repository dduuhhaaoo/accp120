package com.jbit.test;

import com.jbit.mapper.UserMapper;
import com.jbit.pojo.User;
import com.jbit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;
     @Resource
    private UserService service;
@Test
    public  void  test01(){
    //shift+alt+l 快速生成返回
    List<User> userList = userMapper.findUserList();
    for (User user:userList){
        System.out.println(user.toString());
    }


}
@Test
public  void  update(){
    Integer result=service.update();
    System.out.println(result);
}
}
