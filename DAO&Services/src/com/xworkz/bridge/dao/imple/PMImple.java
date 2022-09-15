package com.xworkz.bridge.dao.imple;

import com.xworkz.bridge.dao.PrimeMinisterDAO;

public class PMImple implements PrimeMinisterDAO {

	private String[] pmWork = new String[5];
	private int index;

	@Override
	public boolean save(String name) {
		this.pmWork[this.index] = name;
		System.out.println("Saved =" + name + "," + "Index is =" + this.index);
		index++;
		return true;
	}

	@Override
	public boolean CheckName(String name) {
		for (String ref : this.pmWork) {
			if (ref != null && ref.equals(name));
			return true;
		}
		return false;
	}

}
//for (String ref : this.namesofSports) {
//	if (ref != null && ref.equals(name))
//		System.out.println("name is valid");
//	return true;
