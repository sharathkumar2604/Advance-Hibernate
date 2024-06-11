package com.sharath.runner;

import java.util.Comparator;

import com.sharath.dto.MobileDto;

public class MyCompatrotor implements Comparator<MobileDto> {

	@Override
	public int compare(MobileDto o1, MobileDto o2) {
		
		Integer i1 = o1.getId();
		Integer i2 = o2.getId();
		
		
		return  i1.compareTo(i2);
	}

}
