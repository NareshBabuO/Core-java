package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.PropertyDTO;
import com.xworkz.jdbc.service.PropertySerivceImp;
import com.xworkz.jdbc.service.PropertyService;

public class PropertyRunner {

	public static void main(String[] args) {
		
		PropertyDTO propertyDTO = new PropertyDTO(2027, "Naresh", "Bangalore", 250000);
		PropertyService ps = new PropertySerivceImp();
		ps.validdateANdSave(propertyDTO);

	}

}
