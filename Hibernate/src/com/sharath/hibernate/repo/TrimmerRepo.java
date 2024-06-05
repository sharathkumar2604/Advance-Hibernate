package com.sharath.hibernate.repo;

import java.util.List;

import com.sharath.hibernate.dto.TrimmerDto;

public interface TrimmerRepo {
	
	public boolean save(TrimmerDto ... dto);

	public List readAll();
	
	public List readById(int ...id);
	
	public boolean updateColorByName(String color,String name);
	
	public boolean deleteByNameColorAndPrice(String name,String color,int price);
}
