package com.wisdom.user.service;

import java.util.List;
import java.util.Map;
import com.wisdom.common.model.UserRole;

public interface IUserService {

	public Integer checkUserValidate(String id, String password);
	
	public Boolean addUser(String name, String company, String roleName);
	
	public Boolean deleteUser(Integer deleteUID);
	
	public List<UserRole>getAllUsersWithRoles();
	
	public List<Map<String, String>>getAllUsers();

	public List<Map<String, String>> getUsersByCompany(String company);

	public List<Map<String, String>> getUsersByActive(String active);

	public boolean addRoleToUser(Integer uId, String rName);

	public boolean removeRoleFromUser(Integer uId, String pName);

	public List<Map<String, String>> getUsersByPname(String pName);

	public boolean updateUser(Integer id, String email, String name, String company);

	public boolean updateUserPassword(Integer id, String oldPassword, String newPassword);

	public boolean activateUser(Integer id);

	public boolean deactivateUser(Integer id);
	
	public List<List<String>> getAllUsersWithWorkRecords();
	
	public List<String> getUserWithWorkRecords(Integer uid);
}
