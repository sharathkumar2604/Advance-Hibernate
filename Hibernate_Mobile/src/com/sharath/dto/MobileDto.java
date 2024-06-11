package com.sharath.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="mobileDto")

public class MobileDto {
	
	@Id
//	@OrderBy
	private int id;

	private String name;

	private String color;

	private int price;

	public MobileDto() {
	}

	public MobileDto(int id, String name, String color, int price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "MobileDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
