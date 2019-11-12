package cn.smbms.service.user;

import cn.smbms.dao.UserMapper.DevUserMapper;
import cn.smbms.pojo.AppInfo;
import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private DevUserMapper devUserMapper;

    @Override
    public User login(String devCode, String devPassword) {
        User user=devUserMapper.getLoginUser(devCode);
          //  User user=new User();
        //匹配密码
        if (null!=user){
            if (!user.getDevPassword().equals(devPassword))
         user=null;
        }

        return user;
    }

    @Override
    public List<AppInfo> getInfoList1(@Param("softwareName")String softwareName, Integer status, Integer flatformId, Integer categoryLevel1, Integer categoryLevel2, Integer categoryLevel3, int currentPageNo, int pageSize) {
       List<AppInfo>appInfoList=null;
       currentPageNo=(currentPageNo-1)*pageSize;

       appInfoList=devUserMapper.getInfoList(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, currentPageNo, pageSize);

        return appInfoList;
    }

    @Override
    public Integer getUserCount() {
        Integer count=0;
        count=devUserMapper.getUserCount();
        return  count;
    }
}
