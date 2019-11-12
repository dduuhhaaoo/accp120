package com.jbit.dao;
//比如说这个地方我们是访问的Oracle
public class UserDaoImpl2 implements UserDao {
    @Override
    public void show() {

        System.out.println("新增了一个对象，是Oracle");
    }
}
