package com.jdit.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.entity.User;
import org.junit.Before;
import org.junit.Test;

public class test {

    Session session=null;
    @Before
    public  void  before(){
        //1.读取配置文件
        Configuration crf=new Configuration().configure();
        //获取数据工厂
        SessionFactory sessionFactory=crf.buildSessionFactory();
        //获取session
        session=sessionFactory.openSession();
    }

  @Test
  public  void  show(){

    //执行
    User book=session.get(User.class, 2);
    System.out.println(book);
  }


  @Test
    public  void  add(){}{
        //添加
session.save(new User(1, "杜豪", "123456"));
//事务提交
        session.beginTransaction().commit();
    }
@Test
    public  void  update(){
}
}