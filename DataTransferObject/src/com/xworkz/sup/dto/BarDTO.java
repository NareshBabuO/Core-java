package com.xworkz.sup.dto;

public class BarDTO {

	private String name;
	private String location;
	private String totalArea;
	private String ownerName;
	private String mangerName;
	private Double collectionPerDay;
	private Double collectionPerMonth;
	private Double noOfEmployee;
	private Double noOfWorkers;
	private String createdBy;
	private String updatedBy;
	private Double noOfFloors;
	private Double noOfRooms;
	private Double noOfChairs;
	private Double noOfTables;
	private String chairsColors;
	private String tableColors;
	private Double noOfPans;
	private Double noOfAC;
	private Double totalNoItems;
	private Double beerPrice;
	private Double lunchPrice;
	private String type;
	private Double noOfDoors;
	private Double noWindows;
	private Double noOfCounter;
	private Double noOfColumns;
	private Double totalConstructionCost;
	private String typeOfDoor;
	private Integer slno;
	private String typeofWindows;
	private String doorColor;
	private String windowColor;
	private String typeOfTables;
	private String typeOfChairs;
	private String dreescodeColor;
	private Double mangerSalary;
	private Double employeeSalary;
	private Double workerSalary;
	private Double avgCollectionPerHours;
	private Double totalOpeningHours;

	public BarDTO() {
		System.out.println("Default Constructor");
	}

	public BarDTO(String name, String location, String totalArea, String ownerName, String mangerName,
			Double collectionPerDay, Double collectionPerMonth, Double noOfEmployee, Double noOfWorkers,
			String createdBy, String updatedBy, Double noOfFloors, Double noOfRooms, Double noOfChairs,
			Double noOfTables, String chairsColors, String tableColors, Double noOfPans, Double noOfAC,
			Double totalNoItems, Double beerPrice, Double lunchPrice, String type, Double noOfDoors, Double noWindows,
			Double noOfCounter, Double noOfColumns, Double totalConstructionCost, String typeOfDoor, Integer slno,
			String typeofWindows, String doorColor, String windowColor, String typeOfTables, String typeOfChairs,
			String dreescodeColor, Double mangerSalary, Double employeeSalary, Double workerSalary,
			Double avgCollectionPerHours, Double totalOpeningHours) {
		super();
		this.name = name;
		this.location = location;
		this.totalArea = totalArea;
		this.ownerName = ownerName;
		this.mangerName = mangerName;
		this.collectionPerDay = collectionPerDay;
		this.collectionPerMonth = collectionPerMonth;
		this.noOfEmployee = noOfEmployee;
		this.noOfWorkers = noOfWorkers;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.noOfFloors = noOfFloors;
		this.noOfRooms = noOfRooms;
		this.noOfChairs = noOfChairs;
		this.noOfTables = noOfTables;
		this.chairsColors = chairsColors;
		this.tableColors = tableColors;
		this.noOfPans = noOfPans;
		this.noOfAC = noOfAC;
		this.totalNoItems = totalNoItems;
		this.beerPrice = beerPrice;
		this.lunchPrice = lunchPrice;
		this.type = type;
		this.noOfDoors = noOfDoors;
		this.noWindows = noWindows;
		this.noOfCounter = noOfCounter;
		this.noOfColumns = noOfColumns;
		this.totalConstructionCost = totalConstructionCost;
		this.typeOfDoor = typeOfDoor;
		this.slno = slno;
		this.typeofWindows = typeofWindows;
		this.doorColor = doorColor;
		this.windowColor = windowColor;
		this.typeOfTables = typeOfTables;
		this.typeOfChairs = typeOfChairs;
		this.dreescodeColor = dreescodeColor;
		this.mangerSalary = mangerSalary;
		this.employeeSalary = employeeSalary;
		this.workerSalary = workerSalary;
		this.avgCollectionPerHours = avgCollectionPerHours;
		this.totalOpeningHours = totalOpeningHours;
	}

	@Override
	public int hashCode() {
		return 240;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not equal to zero");
			if (obj instanceof BarDTO) {
				BarDTO casted = (BarDTO) obj;
				if (casted.name.equals(this.name) && (casted.location.equals(this.location) && (casted.doorColor
						.equals(this.doorColor)
						&& (casted.mangerName.equals(this.mangerName) && (casted.ownerName.equals(this.ownerName)
								&& (casted.tableColors.equals(this.tableColors) && (casted.type.equals(this.type)
										&& (casted.typeOfChairs.equals(this.typeOfChairs) && (casted.tableColors
												.equals(this.tableColors)
												&& (casted.workerSalary.equals(this.workerSalary)
														&& (casted.noOfEmployee.equals(this.noOfEmployee)))))))))))) {
					System.out.println("Both are equal");
				} else {
					System.err.println("Both are not same");

				}
			}
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "BarDTO [name=" + name + ", location=" + location + ", doorColor=" + doorColor + ",ownerName="
				+ ownerName + ", mangerName=" + mangerName + ", noOfEmployee=" + noOfEmployee + ", tableColors="
				+ tableColors + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getMangerName() {
		return mangerName;
	}

	public void setMangerName(String mangerName) {
		this.mangerName = mangerName;
	}

	public Double getCollectionPerDay() {
		return collectionPerDay;
	}

	public void setCollectionPerDay(Double collectionPerDay) {
		this.collectionPerDay = collectionPerDay;
	}

	public Double getCollectionPerMonth() {
		return collectionPerMonth;
	}

	public void setCollectionPerMonth(Double collectionPerMonth) {
		this.collectionPerMonth = collectionPerMonth;
	}

	public Double getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(Double noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public Double getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(Double noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Double getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Double noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Double getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Double noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public Double getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(Double noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public Double getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(Double noOfTables) {
		this.noOfTables = noOfTables;
	}

	public String getChairsColors() {
		return chairsColors;
	}

	public void setChairsColors(String chairsColors) {
		this.chairsColors = chairsColors;
	}

	public String getTableColors() {
		return tableColors;
	}

	public void setTableColors(String tableColors) {
		this.tableColors = tableColors;
	}

	public Double getNoOfPans() {
		return noOfPans;
	}

	public void setNoOfPans(Double noOfPans) {
		this.noOfPans = noOfPans;
	}

	public Double getNoOfAC() {
		return noOfAC;
	}

	public void setNoOfAC(Double noOfAC) {
		this.noOfAC = noOfAC;
	}

	public Double getTotalNoItems() {
		return totalNoItems;
	}

	public void setTotalNoItems(Double totalNoItems) {
		this.totalNoItems = totalNoItems;
	}

	public Double getBeerPrice() {
		return beerPrice;
	}

	public void setBeerPrice(Double beerPrice) {
		this.beerPrice = beerPrice;
	}

	public Double getLunchPrice() {
		return lunchPrice;
	}

	public void setLunchPrice(Double lunchPrice) {
		this.lunchPrice = lunchPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(Double noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public Double getNoWindows() {
		return noWindows;
	}

	public void setNoWindows(Double noWindows) {
		this.noWindows = noWindows;
	}

	public Double getNoOfCounter() {
		return noOfCounter;
	}

	public void setNoOfCounter(Double noOfCounter) {
		this.noOfCounter = noOfCounter;
	}

	public Double getNoOfColumns() {
		return noOfColumns;
	}

	public void setNoOfColumns(Double noOfColumns) {
		this.noOfColumns = noOfColumns;
	}

	public Double getTotalConstructionCost() {
		return totalConstructionCost;
	}

	public void setTotalConstructionCost(Double totalConstructionCost) {
		this.totalConstructionCost = totalConstructionCost;
	}

	public String getTypeOfDoor() {
		return typeOfDoor;
	}

	public void setTypeOfDoor(String typeOfDoor) {
		this.typeOfDoor = typeOfDoor;
	}

	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	public String getTypeofWindows() {
		return typeofWindows;
	}

	public void setTypeofWindows(String typeofWindows) {
		this.typeofWindows = typeofWindows;
	}

	public String getDoorColor() {
		return doorColor;
	}

	public void setDoorColor(String doorColor) {
		this.doorColor = doorColor;
	}

	public String getWindowColor() {
		return windowColor;
	}

	public void setWindowColor(String windowColor) {
		this.windowColor = windowColor;
	}

	public String getTypeOfTables() {
		return typeOfTables;
	}

	public void setTypeOfTables(String typeOfTables) {
		this.typeOfTables = typeOfTables;
	}

	public String getTypeOfChairs() {
		return typeOfChairs;
	}

	public void setTypeOfChairs(String typeOfChairs) {
		this.typeOfChairs = typeOfChairs;
	}

	public String getDreescodeColor() {
		return dreescodeColor;
	}

	public void setDreescodeColor(String dreescodeColor) {
		this.dreescodeColor = dreescodeColor;
	}

	public Double getMangerSalary() {
		return mangerSalary;
	}

	public void setMangerSalary(Double mangerSalary) {
		this.mangerSalary = mangerSalary;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Double getWorkerSalary() {
		return workerSalary;
	}

	public void setWorkerSalary(Double workerSalary) {
		this.workerSalary = workerSalary;
	}

	public Double getAvgCollectionPerHours() {
		return avgCollectionPerHours;
	}

	public void setAvgCollectionPerHours(Double avgCollectionPerHours) {
		this.avgCollectionPerHours = avgCollectionPerHours;
	}

	public Double getTotalOpeningHours() {
		return totalOpeningHours;
	}

	public void setTotalOpeningHours(Double totalOpeningHours) {
		this.totalOpeningHours = totalOpeningHours;
	}
}
