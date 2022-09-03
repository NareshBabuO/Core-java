package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.CarShowRoomDTO;

public class CarShowRoomRunner {

	public static void main(String[] args) {
		CarShowRoomDTO car=new CarShowRoomDTO();
		System.out.println(car.hashCode());
		car.setOwnerName("Ramu");
		car.setOwnerPhoneNumber(987654321L);
		car.setOwnerVoterId("7D2058EG");
		car.setNoOfCarsInShowroom(35);
		car.setNoOfManagers(10);
		car.setNoOfSecurities(8);
		car.setFoundedYear(1998);
		car.setIsThereAnyOffers(true);
		
		
		CarShowRoomDTO car1=new CarShowRoomDTO();
		System.out.println(car1.hashCode());
		car1.setOwnerName("Ramu");
		car1.setOwnerPhoneNumber(987654321L);
		car1.setOwnerVoterId("7D2058EG");
		car1.setNoOfCarsInShowroom(35);
		car1.setNoOfManagers(10);
		car1.setNoOfSecurities(8);
		car1.setFoundedYear(1998);
		car1.setIsThereAnyOffers(true);
		
		car.equals(car1);

	}

}
