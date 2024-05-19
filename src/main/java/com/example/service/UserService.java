package com.example.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Users;



@Service
public interface UserService {
	
	public List<Users> getAllUser();
	public Users addUser(Users user);
	public Users updateUser(Users user);
	public int deleteUser(int id);
	public Users findUser(String email,String password);
	public Users findUserByEmail(String email);

}