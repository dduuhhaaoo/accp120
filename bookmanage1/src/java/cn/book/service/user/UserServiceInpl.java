package cn.book.service.user;


import cn.book.mapper.UserMapper;
import cn.book.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceInpl  implements UserService{

    @Resource
    private UserMapper userMapper;


    @Override
    public User userlist(String name, String password) {
        User userlist = userMapper.Userlist(name, password);
        return userlist;
    }
}
