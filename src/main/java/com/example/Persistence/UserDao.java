package com.example.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Users;



public interface  UserDao extends JpaRepository<Users, Integer> {
	
	public Users findByEmailAndPassword(String email,String password);
	
	public Users findByEmail(String email);

}