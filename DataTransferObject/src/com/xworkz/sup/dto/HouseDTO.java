package com.xworkz.sup.dto;

public class HouseDTO {

	private String houseName;
	private String solarHeater;
	private double priceOfHouse;
	private int noOfRooms;
	private double sitePrice;
	private double builtUpArea;
	private int noOfFloors;
	private boolean parking;
	private boolean compound;
	private String externalPaintColor;
	private double heightOfParapetWall;
	private int noOfBedRooms;
	private int noOfMasterBedRooms;
	private double areaOfHall;
	private double areaOfBedroom;
	private int noOfWardrobs;
	private double areaOfBathRoom;
	private boolean poojaRoom;
	private double areaOfPoojaRoom;
	private double areaOfvaranda;
	private int noOfChairs;
	private String country;
	private String state;
	private String city;
	private String colony;
	private String typeOfColony;
	private double constructionCost;
	private int noOfColumnsUsed;
	private int noOfBeamsUsed;
	private double steelQuantityUsed;
	private double concreteQuantityUsed;
	private int noOfDoors;
	private int noOfWindows;
	private int noOfFans;
	private int noOfAlarms;
	private int noOfbeds;
	private int noOfCots;
	private int noOfAc;
	private int noOfSwitches;
	private int noOfTubeLights;
	private int noOfcomodes;
	private int noOfTaps;
	private int noOfMirrors;
	private int pincode;
	private boolean diningTable;

	public HouseDTO() {
		System.out.println("default Constructor");
	}

	public HouseDTO(String houseName, double priceOfHouse, int noOfRooms, double sitePrice, double builtUpArea,
			int noOfFloors, boolean parking, boolean compound, String externalPaintColor, double heightOfParapetWall,
			int noOfBedRooms, int noOfMasterBedRooms, double areaOfHall, double areaOfBedroom, int noOfWardrobs,
			double areaOfBathRoom, boolean poojaRoom, double areaOfPoojaRoom, double areaOfvaranda, int noOfChairs,
			String country, String state, String city, String colony, String typeOfColony, double constructionCost,
			int noOfColumnsUsed, int noOfBeamsUsed, double steelQuantityUsed, double concreteQuantityUsed,
			int noOfDoors, int noOfWindows, int noOfFans, int noOfAlarms, int noOfbeds, int noOfCots, int noOfAc,
			int noOfSwitches, String solarHeater, int noOfTubeLights, int noOfcomodes, int noOfTaps, int noOfMirrors,
			int pincode, boolean diningTable) {
		super();
		this.houseName = houseName;
		this.priceOfHouse = priceOfHouse;
		this.noOfRooms = noOfRooms;
		this.sitePrice = sitePrice;
		this.builtUpArea = builtUpArea;
		this.noOfFloors = noOfFloors;
		this.parking = parking;
		this.compound = compound;
		this.externalPaintColor = externalPaintColor;
		this.heightOfParapetWall = heightOfParapetWall;
		this.noOfBedRooms = noOfBedRooms;
		this.noOfMasterBedRooms = noOfMasterBedRooms;
		this.areaOfHall = areaOfHall;
		this.areaOfBedroom = areaOfBedroom;
		this.noOfWardrobs = noOfWardrobs;
		this.areaOfBathRoom = areaOfBathRoom;
		this.poojaRoom = poojaRoom;
		this.areaOfPoojaRoom = areaOfPoojaRoom;
		this.areaOfvaranda = areaOfvaranda;
		this.noOfChairs = noOfChairs;
		this.country = country;
		this.state = state;
		this.city = city;
		this.colony = colony;
		this.typeOfColony = typeOfColony;
		this.constructionCost = constructionCost;
		this.noOfColumnsUsed = noOfColumnsUsed;
		this.noOfBeamsUsed = noOfBeamsUsed;
		this.steelQuantityUsed = steelQuantityUsed;
		this.concreteQuantityUsed = concreteQuantityUsed;
		this.noOfDoors = noOfDoors;
		this.noOfWindows = noOfWindows;
		this.noOfFans = noOfFans;
		this.noOfAlarms = noOfAlarms;
		this.noOfbeds = noOfbeds;
		this.noOfCots = noOfCots;
		this.noOfAc = noOfAc;
		this.noOfSwitches = noOfSwitches;
		this.solarHeater = solarHeater;
		this.noOfTubeLights = noOfTubeLights;
		this.noOfcomodes = noOfcomodes;
		this.noOfTaps = noOfTaps;
		this.noOfMirrors = noOfMirrors;
		this.pincode = pincode;
		this.diningTable = diningTable;
	}

	@Override
	public int hashCode() {
		return 570;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			System.out.println("Object is not equal to Null");
		{
			if (obj instanceof HouseDTO) {
				HouseDTO casted = (HouseDTO) obj;
				if (casted.houseName.equals(this.houseName) && (casted.city.equals(this.city)
						&& (casted.colony.equals(this.colony) && (casted.country.equals(this.country)
								&& (casted.state.equals(this.state) && (casted.solarHeater.equals(this.solarHeater)
										&& (casted.externalPaintColor.equals(this.externalPaintColor)))))))) {
					System.out.println("Both are same");
				} 
			}
			else {
					System.err.println("both are not same");
				}
		}
		return super.equals(obj);
	}

	public String getHouseNo() {
		return houseName;
	}

	public void setHouseNo(String houseName) {
		this.houseName = houseName;
	}

	public String getSolarHeater() {
		return solarHeater;
	}

	public void setSolarHeater(String solarHeater) {
		this.solarHeater = solarHeater;
	}

	public double getPriceOfHouse() {
		return priceOfHouse;
	}

	public void setPriceOfHouse(double priceOfHouse) {
		this.priceOfHouse = priceOfHouse;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public double getSitePrice() {
		return sitePrice;
	}

	public void setSitePrice(double sitePrice) {
		this.sitePrice = sitePrice;
	}

	public double getBuiltUpArea() {
		return builtUpArea;
	}

	public void setBuiltUpArea(double builtUpArea) {
		this.builtUpArea = builtUpArea;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isCompound() {
		return compound;
	}

	public void setCompound(boolean compound) {
		this.compound = compound;
	}

	public String getExternalPaintColor() {
		return externalPaintColor;
	}

	public void setExternalPaintColor(String externalPaintColor) {
		this.externalPaintColor = externalPaintColor;
	}

	public double getHeightOfParapetWall() {
		return heightOfParapetWall;
	}

	public void setHeightOfParapetWall(double heightOfParapetWall) {
		this.heightOfParapetWall = heightOfParapetWall;
	}

	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}

	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}

	public int getNoOfMasterBedRooms() {
		return noOfMasterBedRooms;
	}

	public void setNoOfMasterBedRooms(int noOfMasterBedRooms) {
		this.noOfMasterBedRooms = noOfMasterBedRooms;
	}

	public double getAreaOfHall() {
		return areaOfHall;
	}

	public void setAreaOfHall(double areaOfHall) {
		this.areaOfHall = areaOfHall;
	}

	public double getAreaOfBedroom() {
		return areaOfBedroom;
	}

	public void setAreaOfBedroom(double areaOfBedroom) {
		this.areaOfBedroom = areaOfBedroom;
	}

	public int getNoOfWardrobs() {
		return noOfWardrobs;
	}

	public void setNoOfWardrobs(int noOfWardrobs) {
		this.noOfWardrobs = noOfWardrobs;
	}

	public double getAreaOfBathRoom() {
		return areaOfBathRoom;
	}

	public void setAreaOfBathRoom(double areaOfBathRoom) {
		this.areaOfBathRoom = areaOfBathRoom;
	}

	public boolean isPoojaRoom() {
		return poojaRoom;
	}

	public void setPoojaRoom(boolean poojaRoom) {
		this.poojaRoom = poojaRoom;
	}

	public double getAreaOfPoojaRoom() {
		return areaOfPoojaRoom;
	}

	public void setAreaOfPoojaRoom(double areaOfPoojaRoom) {
		this.areaOfPoojaRoom = areaOfPoojaRoom;
	}

	public double getAreaOfvaranda() {
		return areaOfvaranda;
	}

	public void setAreaOfvaranda(double areaOfvaranda) {
		this.areaOfvaranda = areaOfvaranda;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getTypeOfColony() {
		return typeOfColony;
	}

	public void setTypeOfColony(String typeOfColony) {
		this.typeOfColony = typeOfColony;
	}

	public double getConstructionCost() {
		return constructionCost;
	}

	public void setConstructionCost(double constructionCost) {
		this.constructionCost = constructionCost;
	}

	public int getNoOfColumnsUsed() {
		return noOfColumnsUsed;
	}

	public void setNoOfColumnsUsed(int noOfColumnsUsed) {
		this.noOfColumnsUsed = noOfColumnsUsed;
	}

	public int getNoOfBeamsUsed() {
		return noOfBeamsUsed;
	}

	public void setNoOfBeamsUsed(int noOfBeamsUsed) {
		this.noOfBeamsUsed = noOfBeamsUsed;
	}

	public double getSteelQuantityUsed() {
		return steelQuantityUsed;
	}

	public void setSteelQuantityUsed(double steelQuantityUsed) {
		this.steelQuantityUsed = steelQuantityUsed;
	}

	public double getConcreteQuantityUsed() {
		return concreteQuantityUsed;
	}

	public void setConcreteQuantityUsed(double concreteQuantityUsed) {
		this.concreteQuantityUsed = concreteQuantityUsed;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public int getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}

	public int getNoOfAlarms() {
		return noOfAlarms;
	}

	public void setNoOfAlarms(int noOfAlarms) {
		this.noOfAlarms = noOfAlarms;
	}

	public int getNoOfbeds() {
		return noOfbeds;
	}

	public void setNoOfbeds(int noOfbeds) {
		this.noOfbeds = noOfbeds;
	}

	public int getNoOfCots() {
		return noOfCots;
	}

	public void setNoOfCots(int noOfCots) {
		this.noOfCots = noOfCots;
	}

	public int getNoOfAc() {
		return noOfAc;
	}

	public void setNoOfAc(int noOfAc) {
		this.noOfAc = noOfAc;
	}

	public int getNoOfSwitches() {
		return noOfSwitches;
	}

	public void setNoOfSwitches(int noOfSwitches) {
		this.noOfSwitches = noOfSwitches;
	}

	public int getNoOfTubeLights() {
		return noOfTubeLights;
	}

	public void setNoOfTubeLights(int noOfTubeLights) {
		this.noOfTubeLights = noOfTubeLights;
	}

	public int getNoOfcomodes() {
		return noOfcomodes;
	}

	public void setNoOfcomodes(int noOfcomodes) {
		this.noOfcomodes = noOfcomodes;
	}

	public int getNoOfTaps() {
		return noOfTaps;
	}

	public void setNoOfTaps(int noOfTaps) {
		this.noOfTaps = noOfTaps;
	}

	public int getNoOfMirrors() {
		return noOfMirrors;
	}

	public void setNoOfMirrors(int noOfMirrors) {
		this.noOfMirrors = noOfMirrors;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public boolean isDiningTable() {
		return diningTable;
	}

	public void setDiningTable(boolean diningTable) {
		this.diningTable = diningTable;
	}

	@Override
	public String toString() {
		return "HouseDTO [houseName=" + houseName + ", solarHeater=" + solarHeater + ", externalPaintColor="
				+ externalPaintColor + ", country=" + country + ", state=" + state + ", city=" + city + ", colony="
				+ colony + "]";
	}

}
