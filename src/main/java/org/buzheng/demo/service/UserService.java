package org.buzheng.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.buzheng.demo.dao.UserMapper;
import org.buzheng.demo.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(String id);
	public List<User> getAllUser();
	
}
