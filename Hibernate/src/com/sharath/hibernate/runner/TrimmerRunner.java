package com.sharath.hibernate.runner;

import java.util.Iterator;

import com.sharath.hibernate.dto.TrimmerDto;
import com.sharath.hibernate.repo.TrimmerRepo;
import com.sharath.hibernate.repo.TrimmerRepoImpl;

public class TrimmerRunner {

	public static void main(String[] args) {
		
	TrimmerRepo repo = new TrimmerRepoImpl();
	
	TrimmerDto d1 = new TrimmerDto(1,"Phillips","Stainless steel","BlackBlue",1200, 1);
	TrimmerDto d2 = new TrimmerDto(2,"Nova","Stainless steel","BrownBlue",1400, 3);
	TrimmerDto d3 = new TrimmerDto(3,"Orient","Stainless steel","OrangeWhite",1999, 3);
	TrimmerDto d4 = new TrimmerDto(4,"Havells","Stainless steel","PurpleBlue",1300, 4);
	TrimmerDto d5 = new TrimmerDto(5,"Xiomi","Stainless steel","BlueRed",1699, 2);
	
//		repo.save(d1,d2,d3,d4,d5);
		
//	repo.save(d2);
	
			
//		System.out.println(repo.readAll());
	
//	System.out.println(repo.readById(1,4,3));
	
	
//	System.out.println(repo.updateColorByName("BlackWhite","Nova")?"update successfully": "not updated successfully");
		
	System.out.println(repo.deleteByNameColorAndPrice("Nova","blackwhite",1400)?"deleted successfully": "not deleted successfully");
	
	}
}
