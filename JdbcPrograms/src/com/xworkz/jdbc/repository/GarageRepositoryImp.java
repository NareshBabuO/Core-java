package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.GarageDTO;

public class GarageRepositoryImp implements GarageRepository {

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("Garage Repository saved"+dto);

		
		return false;
	}

}
