package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.HospitalDTO;
import com.xworkz.jdbc.service.HospitalService;
import com.xworkz.jdbc.service.HospitalServiceImp;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO = new HospitalDTO(1, "Java Deva", "Cardiac", "CN Manjunath", 1970);
		HospitalService hs = new HospitalServiceImp();
		hs.vaildateAndSave(hospitalDTO);
	}

}
