package org.buzheng.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.buzheng.demo.dao.UserMapper;
import org.buzheng.demo.domain.User;
import org.buzheng.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	@Override
	public void saveUser(User user) {
		this.userMapper.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		this.userMapper.updateUser(user);		
	}

	@Override
	public void deleteUser(String id) {
		this.userMapper.deleteUser(id);
	}

	@Override
	public List<User> getAllUser() {
		return this.userMapper.getAllUser();
	}

}
