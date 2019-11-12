package com.jbit.test;
import com.jbit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class) //spring集成的测试
@ContextConfiguration("classpath:applicationContext.xml") //读取我们的xml配置
public class Test1 {
    @Resource //从spring容器当中获取我们的资源或者说是对象
    private UserService userService;
    @Test
    public  void  show1(){
        userService.add();
    }
}