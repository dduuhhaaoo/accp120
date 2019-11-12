package com.jbit.test;

import com.jbit.dao.UserDao;
import com.jbit.dao.UserDaoImpl;
import com.jbit.pojo.User;
import com.jbit.ref.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
    UserDao userDao =new UserDaoImpl();
    userDao.show();
    }
    @Test
    public  void  show1(){
        //在spring当中 读取配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从spring容器当中获取对象
        //alt+shift+f 鼠标指针放在右方 自动的返回左侧对应的内容
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.show();
    }
    @Test
    public  void  show2(){
        //在spring当中 读取配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从spring容器当中获取对象
       UserDao userDao=(UserDao)   context.getBean("userDao2");
       userDao.show();

    }
    @Test
    public  void  show3(){
        //在spring当中 读取配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    User user= (User) context.getBean("user2");
    user.show();
    }
    @Test
    public  void  show4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Printer printer=(Printer)context.getBean("printer");
        printer.show();
    }
    @Test
    public  void  show5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       User user=(User)context.getBean("useradd");
       user.add();
    }
    @Test
    public  void  show6(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User)context.getBean("useradd");
        user.add2();
    }

}
