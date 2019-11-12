package com.jbit.test;

import com.jbit.pojo.User;
import com.jbit.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


  @org.junit.Test
  public  void  show1(){
      //在spring当中读取配置文件
      ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      //增强是在我们创建对象的时候增强
      User user=(User) context.getBean("user");
      //执行方法是在创建对象之后
      //第一次是我们增强出来的
      //第二次是我们执行出来的
      System.out.println(user.name());
  }
  @org.junit.Test
    public  void  show2(){
      ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      UserService userservice = (UserService) context.getBean("userservice");
   userservice.add();
  }
}
