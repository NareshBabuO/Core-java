package com.xworkz.sup.dto;

import com.xworkz.sup.dto.CricketDTO;

public class PgDTO {

	private String pgname;
	private String area;
	private String city;
	private String state;
	private int totalshare;
	private int totalFloor;
	private int totalPersons;
	private int TotalPersoninroom;
	private double costPerPerson;
	private String foodType;
	private String vegDetails;
	private String nonVegDetails;
	private String ownerName;
	private String ownerWifename;
	private int TotalOwnerfamily;
	private int totalfriendsinPG;
	private String friend1Name;
	private String friend2Name;
	private String friend3Name;
	private String friend4Name;
	private String friend5Name;
	private String friend6Name;

	public PgDTO() {
		System.out.println("Default constrctor");
	}

	public PgDTO(String pgname, String area, String city, String state, int totalshare, int totalFloor,
			int totalPersons, int totalPersoninroom, double costPerPerson, String foodType, String vegDetails,
			String nonVegDetails, String ownerName, String ownerWifename, int totalOwnerfamily, int totalfriendsinPG,
			String friend1Name, String friend2Name, String friend3Name, String friend4Name, String friend5Name,
			String friend6Name) {
		super();
		this.pgname = pgname;
		this.area = area;
		this.city = city;
		this.state = state;
		this.totalshare = totalshare;
		this.totalFloor = totalFloor;
		this.totalPersons = totalPersons;
		this.TotalPersoninroom = totalPersoninroom;
		this.costPerPerson = costPerPerson;
		this.foodType = foodType;
		this.vegDetails = vegDetails;
		this.nonVegDetails = nonVegDetails;
		this.ownerName = ownerName;
		this.ownerWifename = ownerWifename;
		this.TotalOwnerfamily = totalOwnerfamily;
		this.totalfriendsinPG = totalfriendsinPG;
		this.friend1Name = friend1Name;
		this.friend2Name = friend2Name;
		this.friend3Name = friend3Name;
		this.friend4Name = friend4Name;
		this.friend5Name = friend5Name;
		this.friend6Name = friend6Name;
	}

	@Override
	public int hashCode() {
		return 35;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PgDTO) {
				PgDTO casted = (PgDTO) obj;
				if (casted.pgname.equals(this.pgname) && (casted.area.equals(this.area))) {
					System.out.println("Both are same/equal");
					return true;
				}
			} else {
				System.err.println("Both are not same/deffent");
			}
		}
		return super.equals(obj);
	}

	public String getPgname() {
		return pgname;
	}

	public void setPgname(String pgname) {
		this.pgname = pgname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTotalshare() {
		return totalshare;
	}

	public void setTotalshare(int totalshare) {
		this.totalshare = totalshare;
	}

	public int getTotalFloor() {
		return totalFloor;
	}

	public void setTotalFloor(int totalFloor) {
		this.totalFloor = totalFloor;
	}

	public int getTotalPersons() {
		return totalPersons;
	}

	public void setTotalPersons(int totalPersons) {
		this.totalPersons = totalPersons;
	}

	public int getTotalPersoninroom() {
		return TotalPersoninroom;
	}

	public void setTotalPersoninroom(int totalPersoninroom) {
		TotalPersoninroom = totalPersoninroom;
	}

	public double getCostPerPerson() {
		return costPerPerson;
	}

	public void setCostPerPerson(double costPerPerson) {
		this.costPerPerson = costPerPerson;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getVegDetails() {
		return vegDetails;
	}

	public void setVegDetails(String vegDetails) {
		this.vegDetails = vegDetails;
	}

	public String getNonVegDetails() {
		return nonVegDetails;
	}

	public void setNonVegDetails(String nonVegDetails) {
		this.nonVegDetails = nonVegDetails;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerWifename() {
		return ownerWifename;
	}

	public void setOwnerWifename(String ownerWifename) {
		this.ownerWifename = ownerWifename;
	}

	public int getTotalOwnerfamily() {
		return TotalOwnerfamily;
	}

	public void setTotalOwnerfamily(int totalOwnerfamily) {
		TotalOwnerfamily = totalOwnerfamily;
	}

	public int getTotalfriendsinPG() {
		return totalfriendsinPG;
	}

	public void setTotalfriendsinPG(int totalfriendsinPG) {
		this.totalfriendsinPG = totalfriendsinPG;
	}

	public String getFriend1Name() {
		return friend1Name;
	}

	public void setFriend1Name(String friend1Name) {
		this.friend1Name = friend1Name;
	}

	public String getFriend2Name() {
		return friend2Name;
	}

	public void setFriend2Name(String friend2Name) {
		this.friend2Name = friend2Name;
	}

	public String getFriend3Name() {
		return friend3Name;
	}

	public void setFriend3Name(String friend3Name) {
		this.friend3Name = friend3Name;
	}

	public String getFriend4Name() {
		return friend4Name;
	}

	public void setFriend4Name(String friend4Name) {
		this.friend4Name = friend4Name;
	}

	public String getFriend5Name() {
		return friend5Name;
	}

	public void setFriend5Name(String friend5Name) {
		this.friend5Name = friend5Name;
	}

	public String getFriend6Name() {
		return friend6Name;
	}

	public void setFriend6Name(String friend6Name) {
		this.friend6Name = friend6Name;
	}

	@Override
	public String toString() {
		return "PgDTO [pgname=" + pgname + ", area=" + area + "]";
	}

}
