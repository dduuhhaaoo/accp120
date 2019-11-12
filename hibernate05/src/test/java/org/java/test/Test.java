package org.java.test;

import lombok.val;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.java.entity.Dept;
import org.java.entity.Emp;
import org.junit.Before;

import java.util.List;

public class Test {
//    @org.junit.Test
//    public  void  show(){
//        //1.读取配置文件
//        Configuration cfg=new Configuration().configure();
//        //2.获取数据工厂
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Emp emp = session.get(Emp.class, 7369);
//        System.out.println(emp);
//    }
    Session session=null;
    @Before
    public  void  before(){
        //加载配置文件
        Configuration cfg=new Configuration().configure();
        //获取数据工程
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        //获取session对象
        session=sessionFactory.openSession();
    }

    @org.junit.Test
    public  void  show(){
        Dept dept = session.get(Dept.class, 30);
        System.out.println(dept);
    }
    @org.junit.Test
    public  void  add(){
        //添加
        session.save(new  Dept(70,"实施部","项目"));
        //事务提交
        session.beginTransaction().commit();
    }
    //修改
    @org.junit.Test
    public  void  update(){
        //load
        Dept dept = session.load(Dept.class, 50);
        dept.setDname("测试部");
        session.update(dept);
        //事务提交
        session.beginTransaction().commit();
    }

    @org.junit.Test
    public  void  update1(){
        session.update(new Dept(60,"a","b"));
   session.beginTransaction().commit();
    }
    @org.junit.Test
    public  void  delete(){
        Dept dept = session.get(Dept.class, 60);
        if (dept!=null){
            session.delete(dept);
            session.beginTransaction().commit();
        }

    }
    @org.junit.Test
    public void  add1(){
     Integer save=     Integer.parseInt(session.save(new Dept(60, "a", "b")).toString());
        System.out.println("======================="+save);
        session.beginTransaction().commit();
    }
    @org.junit.Test
    public  void  show11(){
    // String sql="from Emp";
        String sql=" from  org.java.entity.Emp";
        Query query = session.createQuery(sql);
        List<Emp> list = query.list();
        for (Emp emp:list) {
            System.out.println(emp);
        }

    }
    @org.junit.Test
    public  void select(){

        String sql ="select e from Emp e where ename like '%J%'"; //hql语言
        Query query = session.createQuery(sql);
        List<Emp> list = query.list();
        for (Emp emp:list){
            System.out.println(emp);
        }
    }

    //第一种
    @org.junit.Test
    public void  select1(){
        //条件查询
        String sql=" from  Emp  where  ename=?0";
        Query query = session.createQuery(sql);
      query.setParameter(0, "SMITH");
        List<Emp>list=query.list();
        for (Emp emp:list){
            System.out.println(emp);
        }
    }
    //第二种
    @org.junit.Test
    public  void  select2(){
        //条件查询
        String sql="from  Emp  where ename=:name";
        Query query = session.createQuery(sql);
        query.setParameter("name","SMITH");
        List<Emp> list = query.list();
        for (Emp emp:list){
            System.out.println(emp);
        }
    }
    @org.junit.Test
    public  void  selecte1(){
        //模糊查询
        String sql="from  Emp  ";
        Query query = session.createQuery(sql);
        List<Emp> list = query.list();
        for (Emp emp:list){
            System.out.println(emp);
        }

    }

}
