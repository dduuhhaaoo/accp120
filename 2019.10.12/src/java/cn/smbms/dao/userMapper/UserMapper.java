package cn.smbms.dao.userMapper;

import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //登陆
    public User getUserByCode(@Param("userCode") String userCode ,@Param("userPassword") String userPassword);
//用户查询
    public List<User>getUserList(@Param("userName") String userName,@Param("userRole") int userRole,@Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);
}

