package com.sharath.runner;

import com.sharath.dto.AgarbhattisDto;
import com.sharath.repo.AgarbhattisRepo;
import com.sharath.repo.AgarbhattisRepoImpl;

public class AgarbhattisRunner {

	public static void main(String[] args) {
		
		AgarbhattisRepo repo = new AgarbhattisRepoImpl();
		
		AgarbhattisDto d1 = new AgarbhattisDto(1,"Ullas","jasmin","100grams", 100);
		AgarbhattisDto d2 = new AgarbhattisDto(2,"Champa","champa","100grams", 80);
		AgarbhattisDto d3 = new AgarbhattisDto(3,"CycleBrand","dupa","100grams", 60);
		AgarbhattisDto d4 = new AgarbhattisDto(4,"MatchStick","jasmin-lavender","100grams", 30);
		AgarbhattisDto d5 = new AgarbhattisDto(5,"Hrudhayam","lavender","100grams", 30);
		
		
//      repo.saveAndSaveAll(d1,d2,d3,d4,d5);		
		
		
//		for(AgarbhattisDto d :repo.readAll())
//		{
//			System.out.println(d);
//		}
		
//		for(AgarbhattisDto d :repo.readByName("Cyclebrand","hrudhayam"))
//		{
//			System.out.println(d);
//		}
//		for(AgarbhattisDto d :repo.readById(1,4,5))
//		System.out.println(d);
//		
//		
		

//		System.out.println(repo.updatePriceByBrandAndFlover(66,"cyclebrand","dupa")?"updated successfully":"!failed to update");
	
		
		System.out.println(repo.deleteByName("cyclebrad")?"deleted successfully":"!failed to deleted");
		
	
	}

}
