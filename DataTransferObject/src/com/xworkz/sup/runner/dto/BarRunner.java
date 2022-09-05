package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.BarDTO;

public class BarRunner {

	public static void main(String[] args) {
//		return "BarDTO [name=" + name + ", location=" + location + ", doorColor=" + doorColor + ",ownerName="
//				+ ownerName + ", mangerName=" + mangerName + ", noOfEmployee=" + noOfEmployee + ", tableColors="
//				+ tableColors + ", type=" + type + "]";
		BarDTO bar = new BarDTO();
		System.out.println(bar.hashCode());
		bar.setName("MRP");
		bar.setOwnerName("Ram");
		bar.setMangerName("Ravi");
		bar.setChairsColors("blue");
		bar.setLocation("BTM");
		bar.setDoorColor("red");
		bar.setTableColors("white");

		System.out.println(bar);

		BarDTO bar1 = new BarDTO();
		System.out.println(bar1.hashCode());
		bar1.setName("MRP");
		bar1.setOwnerName("Ram");
		bar1.setMangerName("Ravi");
		bar1.setChairsColors("blue");
		bar1.setLocation("BTM");
		bar1.setDoorColor("red");
		bar1.setTableColors("white");

		System.out.println(bar1);

	}

}
