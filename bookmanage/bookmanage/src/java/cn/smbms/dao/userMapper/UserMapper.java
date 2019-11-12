package cn.smbms.dao.userMapper;

import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User getLoginUser(@Param("name") String name,@Param("password") String password);
}
