package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("Property data is saved"+dto);
		return false;
	}

}
