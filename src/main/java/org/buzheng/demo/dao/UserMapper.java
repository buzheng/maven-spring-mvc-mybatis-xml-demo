package org.buzheng.demo.dao;

import java.util.List;

import org.buzheng.demo.domain.User;

public interface UserMapper {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(String id);
	public List<User> getAllUser();
}
