package cn.book.service.user;

import cn.book.pojo.User;

import java.util.List;
//业务逻辑层
public interface UserService {

    User userlist(String name, String password);

}
