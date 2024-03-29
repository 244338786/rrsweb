package com.wisdom.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisdom.common.model.Role;

public interface RoleMapper {

	void addRole(@Param("name")String name);
	
	List<Role> getAllRoles();
	
	void deleteRoleByName(@Param("name")String name);
	
	Role getRoleByName(@Param("name")String name);
	
	void updateRole(@Param("id")Integer id, @Param("name")String name);
	
	void addPermissionToRole(@Param("r_nam")String role_name, @Param("p_name")String permission_name);
	
	void removePermissionFromRole(@Param("r_nam")String role_name, @Param("p_name")String permission_name);	
	
	void addRolePermission(@Param("r_name")String roleName,@Param("p_name")String permissionName);
}