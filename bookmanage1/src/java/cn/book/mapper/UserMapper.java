package cn.book.mapper;

import cn.book.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
//接口
public interface UserMapper {
//登录
public User Userlist(@Param("name") String name,@Param("password")String password);
}
