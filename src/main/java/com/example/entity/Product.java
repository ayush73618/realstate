package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int product_id;
	
	@Column(name="society_name")
	private String societyName;
	
	@Column(name="place")
	private String place;
	
	@Column(name="area")
	private String area;
	
	@Column(name="no_of_bedroom")
	private int noOfBedroom;
	
	@Column(name="no_of_bathroom")
	private int noOfBathroom;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="seller_id")
	private int sellerId;
	
	@Column(name="buyer_id")
	private int buyerId;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String societyName, String place, String area, int noOfBedroom, int noOfBathroom,
			String locality, int sellerId, int buyerId) {
		super();
		this.societyName = societyName;
		this.place = place;
		this.area = area;
		this.noOfBedroom = noOfBedroom;
		this.noOfBathroom = noOfBathroom;
		this.locality = locality;
		this.sellerId = sellerId;
		this.buyerId = buyerId;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getNoOfBedroom() {
		return noOfBedroom;
	}
	public void setNoOfBedroom(int noOfBedroom) {
		this.noOfBedroom = noOfBedroom;
	}
	public int getNoOfBathroom() {
		return noOfBathroom;
	}
	public void setNoOfBathroom(int noOfBathroom) {
		this.noOfBathroom = noOfBathroom;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", societyName=" + societyName + ", place=" + place + ", area="
				+ area + ", noOfBedroom=" + noOfBedroom + ", noOfBathroom=" + noOfBathroom + ", locality=" + locality
				+ ", sellerId=" + sellerId + ", buyerId=" + buyerId + "]";
	}
	
	
	
}
