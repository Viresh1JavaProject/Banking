package com.banking.service;

import java.util.List;

import com.banking.entity.User;

public interface UserService {
	
	User saveUser(User user);
	User getUserById(int id);
	User updateUser(int id , User user);
	User deleteUser(int id);
	List<User> getAllUsers();

}
