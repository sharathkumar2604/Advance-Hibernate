package com.sharath.repo;

import java.util.List;

import com.sharath.dto.AgarbhattisDto;

public interface AgarbhattisRepo {
	
	
	
	public boolean saveAndSaveAll(AgarbhattisDto...dtos);
	
	
	public List<AgarbhattisDto> readAll();
	
	public List<AgarbhattisDto> readByName(String...name);
	
	
	public List<AgarbhattisDto> readById(int...id);
	
	
	public boolean updatePriceByBrandAndFlover(int price,String brand,String flover);
	
	
	public boolean deleteByName(String brand);
	
	

}
