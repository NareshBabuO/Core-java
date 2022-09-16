package com.xworkz.bridge.dao;

import com.xworkz.bridge.exception.InvalidCheckIndexException;

public interface PrimeMinisterDAO {

	boolean saveName(String name) throws InvalidCheckIndexException;

	boolean CheckName(String name);

}
