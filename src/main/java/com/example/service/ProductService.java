package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Product;

@Service
public interface ProductService {
	
	public List<Product> getAllProduct();
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public int removeProduct(int id);
	public List<Product> findByBuyerId(int id);
	public List<Product> findBySellerId(int id);
	public List<Product> findByLocality(String locality);
	

}
