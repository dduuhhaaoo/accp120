package com.jbit.test;

import com.jbit.pojo.Singleton;
import com.jbit.pojo.Singleton2;
import com.jbit.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public  void  show1(){
        Singleton  singleton=Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1);
    }
    @org.junit.Test
    public  void  show2(){
        Singleton2 singleton=Singleton2.getInstance();
        System.out.println(singleton);
        Singleton2 singleton1=Singleton2.getInstance();
        System.out.println(singleton1);
    }
    @org.junit.Test
    public  void  show3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user= (User) context.getBean("user");
        System.out.println(user);
        User user2= (User) context.getBean("user");
        System.out.println(user2);
    }
}
