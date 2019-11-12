package cn.smbms.dao.userMapper;

import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.sql.Connection;
import java.util.List;

public interface UserMapper {
    /**
     * 通过userCode获取User
     * @param
     * @param userCode
     * @return
     * @throws Exception
     */
    public User getLoginUser(@Param("userCode") String userCode);

    /**
     * 通过条件查询-userList
     *
     * @param userName
     * @param userRole
     * @return
     * @throws Exception
     */
    public List<User> getUserList(@Param("userName") String userName, @Param("userRole") int userRole, @Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);

    /**
     * 通过userId获取user
     * @param
     * @param id
     * @return
     * @throws Exception
     */
    public User getUserById(@Param("id") String id);
    /**
     * 增加用户信息
     * @param
     * @param user
     * @return
     * @throws Exception
     */
    public Integer add( User user);

    /**
     * 修改用户信息
     * @param
     * @param user
     * @return
     * @throws Exception
     */
    public Integer modify( User user);
    /**
     * 通过userId删除user
     * @param delId
     * @return
     * @throws Exception
     */
    public Integer deleteUserById(@Param("delId") Integer delId);


}
