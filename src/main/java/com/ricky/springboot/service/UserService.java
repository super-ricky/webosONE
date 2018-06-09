package com.ricky.springboot.service;

import java.util.List;

import com.ricky.springboot.model.User;

public interface UserService {

	public User findById(Long id);
	
	public User findByName(String name);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUserById(Long id);
	
	public void deleteAllUsers();
	
	public List<User> findAllUsers();

	public boolean isUserExist(User user);
}
