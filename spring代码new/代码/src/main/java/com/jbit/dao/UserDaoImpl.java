package com.jbit.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao") //相当于我们xml当中 bean id=userdao class=userdaoimpl
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao层对象已经被注入");
        System.out.println("新增了一个对象");
    }
}
