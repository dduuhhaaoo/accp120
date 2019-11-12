package cn.smbms.service.role;
import java.sql.Connection;
import java.util.List;

import cn.smbms.dao.BaseDao;
import cn.smbms.dao.role.RoleDao;
import cn.smbms.dao.role.RoleDaoImpl;
import cn.smbms.dao.roleMapper.RoleMapper;
import cn.smbms.pojo.Role;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service
public class RoleServiceImpl implements RoleService{
	@Resource
	private RoleDao roleDao;
	@Resource
    private RoleMapper roleMapper;
	@Override
	public List<Role> getRoleList() {

		// TODO Auto-generated method stub
		//Connection connection = null;
		List<Role> roleList = null;
        roleList = roleMapper.getRoleList();
//		try {
//			connection = BaseDao.getConnection();
//			roleList = roleDao.getRoleList(connection);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			BaseDao.closeResource(connection, null, null);
//		}
		return roleList;
	}
}