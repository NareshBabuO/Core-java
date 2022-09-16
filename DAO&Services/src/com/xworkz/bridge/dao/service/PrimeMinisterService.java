package com.xworkz.bridge.dao.service;

import com.xworkz.bridge.exception.InvalidateNameException;

public interface PrimeMinisterService {
	
	boolean ValiddateAndSave(String name)throws InvalidateNameException;

}
