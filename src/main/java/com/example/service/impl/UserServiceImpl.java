package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Persistence.UserDao;
import com.example.entity.Users;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao userDao;
	
	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
		
	}

	@Override
	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.saveAndFlush(user);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		Optional<Users> user = Optional.of(userDao.getById(id));
		
		if(user!=null) {
			 userDao.deleteById(id);
			 return 1;
		}
		
		return -1;
	}

	@Override
	public Users findUser(String email, String password) {
		// TODO Auto-generated method stub
		return userDao.findByEmailAndPassword(email, password);
	}

	@Override
	public Users findUserByEmail(String email) {
		// TODO Auto-generated method stub
	   return userDao.findByEmail(email);
	}

}
