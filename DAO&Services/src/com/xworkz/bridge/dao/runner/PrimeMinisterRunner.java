package com.xworkz.bridge.dao.runner;

import com.xworkz.bridge.dao.PrimeMinisterDAO;
import com.xworkz.bridge.dao.imple.PMImple;
import com.xworkz.bridge.dao.service.PrimeMinisterService;
import com.xworkz.bridge.dao.service.imple.PMServiceImple;
import com.xworkz.bridge.exception.InvalidCheckIndexException;
import com.xworkz.bridge.exception.InvalidateNameException;

public class PrimeMinisterRunner {

	public static void main(String[] args) {

		PrimeMinisterDAO daoPM = new PMImple();

		PrimeMinisterService pmService = new PMServiceImple(daoPM);
		try {
			pmService.ValiddateAndSave("Jawahar Lal Nehru");
			pmService.ValiddateAndSave("Indira Gandhi");
			//pmService.ValiddateAndSave("Indira Gandhi");
			pmService.ValiddateAndSave("Rajiv Gandhi");
			pmService.ValiddateAndSave("Atal Bihari Vajpayee");
			pmService.ValiddateAndSave("H. D. Deve Gowda");
			pmService.ValiddateAndSave("Atal Bihari Vajpayee");
			pmService.ValiddateAndSave("Narendra Modi");
		} catch (InvalidateNameException pine) {
			pine.getMessage();
			pine.getClass();
		} catch (InvalidCheckIndexException picie) {
			picie.getMessage();
		}

	}

}
