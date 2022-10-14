package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.HospitalDTO;

public class HospitalRepositoryImp implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Hospital Data is saved"+dto);
		return false;
	}

}
