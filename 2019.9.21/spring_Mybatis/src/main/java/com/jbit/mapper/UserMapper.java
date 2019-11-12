package com.jbit.mapper;

import java.util.List;
import java.util.Map;

import com.jbit.pojo.User;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
	/**
	 * ��ѯ����
	 * 
	 * @return
	 */
	public List<User> findUserList();

	/**
	 * ������ѯ
	 * 
	 * @param user
	 * @return
	 */
	User findUserByUser(User user);

	/**
	 * ����
	 * 
	 * @param user
	 * @return
	 */
	Integer addUser(User user);

	Integer update(User user);

	Integer delete(User user);

	List<User> getList(@Param("name") String name);

	List<User> findUserRoleName();

	//public List<Role> getRoles();
  
	  User findUserRoleNameById(Integer id);
	User findAddressList(Integer id);
	
	Integer updateUserTrim(User user);
	//@param ����г���һ�����ϵĲ�������ô����xml�����parameterType�Ͳ�ʵ���ˣ�����������Ҫע��@Param�������Ǵ��ݲ���
	//��ö�ʹ�ö������������5�����£����Կ���ע��ķ�ʽ
	List<User> findByUserNameAndUserRole(@Param("userName") String userName, @Param("userRole") Integer userRole);
   
	Integer updateUser(User user);

	List<User> findUser_array(Integer[] array);
	
	List<User> findUser_lisList(List<Integer> list);
	
	List<User> findUser_map(Map<String, Object> map);
  /**
   * �������Ĳ�����������С������Ҳ����������Ͳ�һ�� ��ô���ǿ���ʹ��@paramע�� 
   * �����������ע�� ʵ�����оͲ���ʹ��parameterType��
   * @param roleName
   * @return
   */
	List<User>  findByRoleName(@Param("roleName") String roleName);
}
