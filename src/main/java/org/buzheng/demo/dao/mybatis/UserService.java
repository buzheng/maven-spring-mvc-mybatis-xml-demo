package org.buzheng.demo.dao.mybatis;

import java.util.List;

import org.buzheng.demo.domain.User;

public interface UserService {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(String id);
	public List<User> getAllUser();
}
