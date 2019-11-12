package com.jbit.test;

import cn.smbms.dao.roleMapper.RoleMapper;
import cn.smbms.dao.userMapper.UserMapper;
import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
import cn.smbms.service.role.RoleService;
import cn.smbms.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Usertest {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RoleService roleService;

    @Test
    public  void  test01(){
       User user=    userService.getUserById("1");
        System.out.println(user);
    }
    @Test
    public  void  test02(){
        //登陆
        User user = userMapper.getLoginUser("田丰");
        System.out.println(user.toString());
    }
    @Test
    public  void  test03(){
        //多表联合查询和分页
        List<User>list=userService.getUserList("系", 1, 2, 1);
    for (User user :list){
        System.out.println(user.toString());
    }
    }
    @Test
    public  void  test04(){
        //查询
       List<Role>list=   roleService.getRoleList();
       for (Role role:list){
           System.out.println(role.toString());
       }
    }
    @Test
    public  void  test05(){
        //根据id进行查询
        User user=userService.getUserById("1");
        System.out.println(user.toString());
    }

}
