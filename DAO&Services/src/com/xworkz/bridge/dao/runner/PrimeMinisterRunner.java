package com.xworkz.bridge.dao.runner;

import com.xworkz.bridge.dao.PrimeMinisterDAO;
import com.xworkz.bridge.dao.imple.PMImple;
import com.xworkz.bridge.dao.service.PrimeMinisterService;
import com.xworkz.bridge.dao.service.imp.PMServiceImple;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		
		PrimeMinisterDAO daoPM=new PMImple();
		
		PrimeMinisterService pmService = new PMServiceImple(daoPM);
		this {
			pmService.ValiddateAndSave("")
		}
		
		
	}

}
