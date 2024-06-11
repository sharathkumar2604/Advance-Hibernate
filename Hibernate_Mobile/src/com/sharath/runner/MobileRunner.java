package com.sharath.runner;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sharath.dto.MobileDto;
import com.sharath.repo.MobileRepo;
import com.sharath.repo.MobileRepoImpl;

public class MobileRunner {

	public static void main(String[] args) {
		
		
		MobileRepo repo = new MobileRepoImpl();

		MobileDto d1 = new MobileDto(1, "Sony", "White", 123333);
		MobileDto d2 = new MobileDto(2, "Xiomi", "Black", 223333);
		MobileDto d3 = new MobileDto(3, "Samsung", "Red", 323333);
		MobileDto d4 = new MobileDto(4, "Oppo", "Green", 423333);
		MobileDto d5 = new MobileDto(5, "Vivo", "Blue", 523333);
		MobileDto d6 = new MobileDto(7, "Oppo1", "gGreen", 423333);
		MobileDto d7 = new MobileDto(6, "Vivo1", "bBlue", 523333);
		
		
//		repo.saveAndSaveAll(d1,d2,d3,d4,d5);
		
		repo.saveAndSaveAll(d7);
		
//		for(MobileDto d: repo.readAll())
//		{
//			System.out.println(d);
//		}
		
	
	
//		for(MobileDto d: repo.readByName("Vivo","Vivo1","samsung"))
//		{
//			System.out.println(d);
//		}
//     List<MobileDto> l = repo.readById(1,5,4,2);
//     
//	Collections.sort(l, new MyCompatrotor());
//		for(MobileDto d:l)
//			{
//				System.out.println(d);
//			}
	
//	System.out.println(repo.updatePriceByName(628437684,"Vivo1"));
//	
//		System.out.println(repo.delesteByName("Vivo1"));
			
	}

		
}
