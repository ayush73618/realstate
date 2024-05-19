package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.entity.Users;
import com.example.service.ProductService;
import com.example.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class MainController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/users")
	public List<Users> getAllUser(){
		return userService.getAllUser();
	}
	
	@PostMapping("/users")
	public Users addUser(@RequestBody Users user) {
		System.out.println(user.toString());
	 	return userService.addUser(user);
	}
	
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public int deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
	
	@GetMapping("/users/{email}/{password}")
	public Users getUserByEmail(@PathVariable String email,@PathVariable String password) {
		return userService.findUser(email,password);
		
	}
	
	@GetMapping("/users/{email}")
	public Users findUserByEmail(@PathVariable String email) {
		//System.out.println(userService.findUserByEmail(email).toString());
		return userService.findUserByEmail(email);
		
	}
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		System.out.println(product);
		return productService.addProduct(product);
		
	}
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
		
	}
	
	@DeleteMapping("/products")
	public int deleteProduct(@PathVariable int id) {
		return productService.removeProduct(id);
	}
	
	@GetMapping("/products/:{sellerId}")
	public List<Product> fincByBuyerId(@PathVariable int sellerId){
		return productService.findByBuyerId(sellerId);
	}
	
	@GetMapping("/products/:{buyerId}")
	public List<Product> fincBySellerId(@PathVariable int buyerId){
		return productService.findBySellerId(buyerId);
	}
	
	@GetMapping("/products/{locality}")
	public List<Product> findByLocality(@PathVariable String locality){
		return productService.findByLocality(locality);
	}
}