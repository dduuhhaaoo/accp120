package cn.smbms.dao.UserMapper;

import cn.smbms.pojo.AppInfo;
import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DevUserMapper {
    //登陆
    public User getLoginUser(@Param("devCode") String devCode);

//查询
    public List<AppInfo> getInfoList(@Param("softwareName")String softwareName, @Param("status") Integer  status,@Param("flatformId")Integer flatformId,@Param("categoryLevel1")Integer categoryLevel1,@Param("categoryLevel2")Integer categoryLevel2,@Param("categoryLevel3")Integer categoryLevel3, @Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);
//页面容量
public Integer getUserCount();

}
