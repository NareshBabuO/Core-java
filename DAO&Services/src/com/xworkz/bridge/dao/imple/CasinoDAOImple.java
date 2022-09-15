package com.xworkz.bridge.dao.imple;

import com.xworkz.bridge.dao.CasinoDAO;

public class CasinoDAOImple implements CasinoDAO {

	private String[] dataStore = new String[5];
	private int index = 0;

	@Override
	public boolean save(String name) {
		//System.out.println("saving names");
		this.dataStore[this.index] = name;
		System.out.println("Savedname=" + name + "," + "index:" + this.index);
		this.index++;
		return true;
	}

	@Override
	public boolean checkname(String name) {
		for (String ref : this.dataStore) {
			if (ref!=null && ref.equals(name))
				System.out.println("it is valid");
			return true;
		}
		return false;
	}
}
