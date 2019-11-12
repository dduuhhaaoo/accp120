package com.jbit.Test;

import cn.smbms.dao.UserMapper.DevUserMapper;
import cn.smbms.pojo.AppInfo;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.tools.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Resource
    private UserService userService;

    @Resource
    private DevUserMapper devUserMapper;

    @Test
    public  void  test1(){

    User user=userService.login("test001", "123456");
    System.out.println(user.toString());
        Constants constants=new Constants();
        System.out.println(constants);
}
@Test
    public  void  test2(){
    List<AppInfo>list=userService.getInfoList1("机",3, 1, 2, 20, null, 1, 2);
for (AppInfo appInfo:list){
    System.out.println(appInfo.toString());
}
    }

    @Test
    public  void  test3(){
        Integer count=userService.getUserCount();
        System.out.println(count);
    }
}
