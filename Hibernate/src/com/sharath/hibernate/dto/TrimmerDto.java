package com.sharath.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrimmerDto")
public class TrimmerDto {
	
	
	@Id
	private int id;
	
	private String brand;
	
	private String madeof;
	
	private String color;
	
	private int price;
	
	private int warranty;

	public TrimmerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrimmerDto(int id, String brand, String madeof, String color, int price, int warranty) {
		super();
		this.id = id;
		this.brand = brand;
		this.madeof = madeof;
		this.color = color;
		this.price = price;
		this.warranty = warranty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadeof() {
		return madeof;
	}

	public void setMadeof(String madeof) {
		this.madeof = madeof;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "TrimmerDto [id=" + id + ", brand=" + brand + ", madeof=" + madeof + ", color=" + color + ", price="
				+ price + ", warranty=" + warranty + "]";
	}
	
	
	
	
	

}
