package com.sharath.repo;

import java.util.List;

import com.sharath.dto.MobileDto;

public interface MobileRepo {
	
	
public boolean saveAndSaveAll(MobileDto...dtos );
	
	
	public List<MobileDto> readAll();

	public List<MobileDto> readByName(String...name);
//
//
	public List<MobileDto> readById(int...id);
//	
	public boolean updatePriceByName(int price,String name);
//	
	public boolean deleteByName(String name);

}
