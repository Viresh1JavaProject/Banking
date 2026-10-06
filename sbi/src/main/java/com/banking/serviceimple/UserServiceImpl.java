package com.banking.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.User;
import com.banking.repository.UserRepository;
import com.banking.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User updateUser(int id, User user) {
		// TODO Auto-generated method stub
		User existUser = userRepository.findById(id).orElse(null);
		if (existUser !=null) {
			existUser.setUsername(user.getUsername());
			existUser.setPassword(user.getPassword());
			existUser.setEmail(user.getEmail());
			existUser.setCustomer(user.getCustomer());
			existUser.setRole(user.getRole());
			existUser.setLastLogin(user.getLastLogin());
			
			return userRepository.save(existUser);
		}
		return null;
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		User existUser=userRepository.findById(id).orElse(null);
		if (existUser!=null) {
			userRepository.delete(existUser);
			return existUser;
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
