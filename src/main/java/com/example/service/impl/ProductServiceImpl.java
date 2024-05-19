package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Persistence.ProductDao;
import com.example.entity.Product;
import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.saveAndFlush(product);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int removeProduct(int id) {
		// TODO Auto-generated method stub
		Optional<Product> product = Optional.of(productDao.getById(id));

		if (product != null) {
			productDao.deleteById(id);
			return 1;
		}

		return -1;

	}

	@Override
	public List<Product> findByBuyerId(int id) {
		// TODO Auto-generated method stub
		return productDao.findByBuyerId(id);
	}

	@Override
	public List<Product> findBySellerId(int id) {
		// TODO Auto-generated method stub
		return productDao.findBySellerId(id);
	}

	@Override
	public List<Product> findByLocality(String locality) {
		// TODO Auto-generated method stub
		return productDao.findByLocality(locality);
	}

}
