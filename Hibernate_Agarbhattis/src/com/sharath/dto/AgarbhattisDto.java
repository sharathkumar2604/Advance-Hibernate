package com.sharath.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agarbhattisDto")
public class AgarbhattisDto {

	
	@Id
	private int id;
	
	private String brand;
	
	private String flovor;
	
	private String qty;
	
	private int price;

	public AgarbhattisDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgarbhattisDto(int id, String brand, String flovor, String qty, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.flovor = flovor;
		this.qty = qty;
		this.price = price;
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

	public String getFlovor() {
		return flovor;
	}

	public void setFlovor(String flovor) {
		this.flovor = flovor;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AgarbhattisDto [id=" + id + ", brand=" + brand + ", flovor=" + flovor + ", qty=" + qty + ", price="
				+ price + "]";
	}
	
	
}
