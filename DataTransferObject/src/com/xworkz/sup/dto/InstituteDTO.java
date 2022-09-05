package com.xworkz.sup.dto;

public class InstituteDTO {

	private String name;
	private String type;
	private String owner;
	private int ageOfOwner;
	private double rating;
	private String typeOfCourse;
	private String noOfTraineers;
	private String noOfStudents;
	private double fees;
	private int noOfHr;
	private String country;
	private String state;
	private String city;
	private String location;
	private boolean projector;
	private boolean ac;
	private int noOfAc;
	private boolean fireFighting;
	private long contactNo;
	private String hrName;
	private int noOfChairs;
	private int noOfTables;
	private int noOfScreens;
	private boolean speaker;
	private int noOfSpeaker;
	private double priceOfSpeaker;
	private double priceOfProjector;
	private int noOfFans;
	private int noOfTubeLights;
	private int noOfLedBulbs;
	private double priceOfFan;
	private double priceOfTubeLights;
	private double priceOfLedBulbs;
	private double priceOfChairs;
	private int noOfFloors;
	private boolean parking;
	private boolean auditorium;
	private double areaOfAuditorium;
	private int noOfClassRoom;
	private int noOfMarkers;
	private double priceOfMarkers;
	private double widthOfScreen;
	private double heightOfScreen;
	private int noOfWindows;
	private int noOfDoors;

	public InstituteDTO() {
		System.out.println("default Constrctor");
	}

	public InstituteDTO(String name, String type, String owner, int ageOfOwner, double rating, String typeOfCourse,
			String noOfTraineers, String noOfStudents, double fees, int noOfHr, String country, String state,
			String city, String location, boolean projector, boolean ac, int noOfAc, boolean fireFighting,
			long contactNo, String hrName, int noOfChairs, int noOfTables, int noOfScreens, boolean speaker,
			int noOfSpeaker, double priceOfSpeaker, double priceOfProjector, int noOfFans, int noOfTubeLights,
			int noOfLedBulbs, double priceOfFan, double priceOfTubeLights, double priceOfLedBulbs, double priceOfChairs,
			int noOfFloors, boolean parking, boolean auditorium, double areaOfAuditorium, int noOfClassRoom,
			int noOfMarkers, double priceOfMarkers, double widthOfScreen, double heightOfScreen, int noOfWindows,
			int noOfDoors) {
		super();
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.ageOfOwner = ageOfOwner;
		this.rating = rating;
		this.typeOfCourse = typeOfCourse;
		this.noOfTraineers = noOfTraineers;
		this.noOfStudents = noOfStudents;
		this.fees = fees;
		this.noOfHr = noOfHr;
		this.country = country;
		this.state = state;
		this.city = city;
		this.location = location;
		this.projector = projector;
		this.ac = ac;
		this.noOfAc = noOfAc;
		this.fireFighting = fireFighting;
		this.contactNo = contactNo;
		this.hrName = hrName;
		this.noOfChairs = noOfChairs;
		this.noOfTables = noOfTables;
		this.noOfScreens = noOfScreens;
		this.speaker = speaker;
		this.noOfSpeaker = noOfSpeaker;
		this.priceOfSpeaker = priceOfSpeaker;
		this.priceOfProjector = priceOfProjector;
		this.noOfFans = noOfFans;
		this.noOfTubeLights = noOfTubeLights;
		this.noOfLedBulbs = noOfLedBulbs;
		this.priceOfFan = priceOfFan;
		this.priceOfTubeLights = priceOfTubeLights;
		this.priceOfLedBulbs = priceOfLedBulbs;
		this.priceOfChairs = priceOfChairs;
		this.noOfFloors = noOfFloors;
		this.parking = parking;
		this.auditorium = auditorium;
		this.areaOfAuditorium = areaOfAuditorium;
		this.noOfClassRoom = noOfClassRoom;
		this.noOfMarkers = noOfMarkers;
		this.priceOfMarkers = priceOfMarkers;
		this.widthOfScreen = widthOfScreen;
		this.heightOfScreen = heightOfScreen;
		this.noOfWindows = noOfWindows;
		this.noOfDoors = noOfDoors;
	}

	@Override
	public int hashCode() {
		return 520;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof InstituteDTO) {
				InstituteDTO casted = (InstituteDTO) obj;
				if (casted.city.equals(this.city) && (casted.country.equals(this.country)
						&& (casted.hrName.equals(this.hrName) && (casted.location.equals(this.location)
								&& (casted.name.equals(this.name) && (casted.owner.equals(this.owner)
										&& (casted.state.equals(this.state) && (casted.type.equals(this.type)
												&& (casted.typeOfCourse.equals(this.typeOfCourse))))))))))
					System.out.println("Both are equals");
			}
		} else {
			System.out.println("Both are not equals");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "InstituteDTO [name=" + name + ", type=" + type + ", owner=" + owner + ", typeOfCourse=" + typeOfCourse
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", location=" + location
				+ ", contactNo=" + contactNo + ", hrName=" + hrName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAgeOfOwner() {
		return ageOfOwner;
	}

	public void setAgeOfOwner(int ageOfOwner) {
		this.ageOfOwner = ageOfOwner;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getTypeOfCourse() {
		return typeOfCourse;
	}

	public void setTypeOfCourse(String typeOfCourse) {
		this.typeOfCourse = typeOfCourse;
	}

	public String getNoOfTraineers() {
		return noOfTraineers;
	}

	public void setNoOfTraineers(String noOfTraineers) {
		this.noOfTraineers = noOfTraineers;
	}

	public String getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getNoOfHr() {
		return noOfHr;
	}

	public void setNoOfHr(int noOfHr) {
		this.noOfHr = noOfHr;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isProjector() {
		return projector;
	}

	public void setProjector(boolean projector) {
		this.projector = projector;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getNoOfAc() {
		return noOfAc;
	}

	public void setNoOfAc(int noOfAc) {
		this.noOfAc = noOfAc;
	}

	public boolean isFireFighting() {
		return fireFighting;
	}

	public void setFireFighting(boolean fireFighting) {
		this.fireFighting = fireFighting;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getHrName() {
		return hrName;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public boolean isSpeaker() {
		return speaker;
	}

	public void setSpeaker(boolean speaker) {
		this.speaker = speaker;
	}

	public int getNoOfSpeaker() {
		return noOfSpeaker;
	}

	public void setNoOfSpeaker(int noOfSpeaker) {
		this.noOfSpeaker = noOfSpeaker;
	}

	public double getPriceOfSpeaker() {
		return priceOfSpeaker;
	}

	public void setPriceOfSpeaker(double priceOfSpeaker) {
		this.priceOfSpeaker = priceOfSpeaker;
	}

	public double getPriceOfProjector() {
		return priceOfProjector;
	}

	public void setPriceOfProjector(double priceOfProjector) {
		this.priceOfProjector = priceOfProjector;
	}

	public int getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(int noOfFans) {
		this.noOfFans = noOfFans;
	}

	public int getNoOfTubeLights() {
		return noOfTubeLights;
	}

	public void setNoOfTubeLights(int noOfTubeLights) {
		this.noOfTubeLights = noOfTubeLights;
	}

	public int getNoOfLedBulbs() {
		return noOfLedBulbs;
	}

	public void setNoOfLedBulbs(int noOfLedBulbs) {
		this.noOfLedBulbs = noOfLedBulbs;
	}

	public double getPriceOfFan() {
		return priceOfFan;
	}

	public void setPriceOfFan(double priceOfFan) {
		this.priceOfFan = priceOfFan;
	}

	public double getPriceOfTubeLights() {
		return priceOfTubeLights;
	}

	public void setPriceOfTubeLights(double priceOfTubeLights) {
		this.priceOfTubeLights = priceOfTubeLights;
	}

	public double getPriceOfLedBulbs() {
		return priceOfLedBulbs;
	}

	public void setPriceOfLedBulbs(double priceOfLedBulbs) {
		this.priceOfLedBulbs = priceOfLedBulbs;
	}

	public double getPriceOfChairs() {
		return priceOfChairs;
	}

	public void setPriceOfChairs(double priceOfChairs) {
		this.priceOfChairs = priceOfChairs;
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

	public boolean isAuditorium() {
		return auditorium;
	}

	public void setAuditorium(boolean auditorium) {
		this.auditorium = auditorium;
	}

	public double getAreaOfAuditorium() {
		return areaOfAuditorium;
	}

	public void setAreaOfAuditorium(double areaOfAuditorium) {
		this.areaOfAuditorium = areaOfAuditorium;
	}

	public int getNoOfClassRoom() {
		return noOfClassRoom;
	}

	public void setNoOfClassRoom(int noOfClassRoom) {
		this.noOfClassRoom = noOfClassRoom;
	}

	public int getNoOfMarkers() {
		return noOfMarkers;
	}

	public void setNoOfMarkers(int noOfMarkers) {
		this.noOfMarkers = noOfMarkers;
	}

	public double getPriceOfMarkers() {
		return priceOfMarkers;
	}

	public void setPriceOfMarkers(double priceOfMarkers) {
		this.priceOfMarkers = priceOfMarkers;
	}

	public double getWidthOfScreen() {
		return widthOfScreen;
	}

	public void setWidthOfScreen(double widthOfScreen) {
		this.widthOfScreen = widthOfScreen;
	}

	public double getHeightOfScreen() {
		return heightOfScreen;
	}

	public void setHeightOfScreen(double heightOfScreen) {
		this.heightOfScreen = heightOfScreen;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

}
