package com.example.Persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entity.Product;


public interface ProductDao extends JpaRepository<Product, Integer> {
	
	public List<Product> findBySellerId(int id);
	public List<Product> findByBuyerId(int id);
	public List<Product> findByLocality(String locality);

}
