package com.wisdom.common.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.wisdom.common.model.User;
import com.wisdom.common.model.UserRecord;
import com.wisdom.common.model.UserRole;

public interface UserMapper {

	
  User getUserById(Integer uid);
  
  User getUserByMail(String mail);
  
  Integer addUser(User user);

  void deleteUserById(@Param("id")Integer id);
  
  List<UserRole> getAllUsersWithRoles();
  
  List<User> getAllUsers();
  
  Integer updateUser(@Param("id")Integer id, @Param("name")String name, @Param("mail")String mail, @Param("company")String company);

  List<User> getUserByGroup(@Param("mail")String mail);
  
  List<User> getUsersByCompany(@Param("company")String company);
  
  List<User> getUsersByActive(@Param("active")String active);
  
  Integer addRoleToUser(@Param("uid")Integer uid,@Param("rname")String rName);
  
  boolean removeRoleFromUser(@Param("uid")Integer uid,@Param("pname")String pName);
  
  List<User> getUsersByPname(@Param("pname")String pName);
  
  Integer updateUserPassword(@Param("id")Integer id, @Param("password")String password);
  
  boolean activateUpdate(@Param("uid")Integer uid,@Param("num")Integer num);
  
  List<UserRecord> getAllUsersWithWorkRecords();
  
  UserRecord getUserWithWorkRecord(@Param("uid")Integer uid);
} 