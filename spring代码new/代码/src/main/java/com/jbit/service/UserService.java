package com.jbit.service;

import com.jbit.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service //代表这个类是我们的业务逻辑层
public class UserService {
    /* 注解注入 会自动的拉取我们已经标记的类 完成对象的注入 */
    @Resource //从容器当中获取对象
   // @Autowired //根据实现类来注入
    private  UserDao userDao;
    public  void  add(){
        System.out.println("我是业务逻辑层的代码");
        userDao.add();
    }
}
