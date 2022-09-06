class HouseRunner
{
  public static void main (String [] args)
  {
     String [] mem= {"Mom" , "Dad" , "brother","me"};
	 String [] type={"Hall", "2 Bed Room" , "kitichen" , "2 Bathroom"};
	 
	 
	 House house = new House("Mathushree nilaya" );//, mem);
	 house.members=(mem);
	 house.setNoOfRooms(4);
	 house.area("Pavagada");
	 house.getArray(type);
	 house.printData();
  }
}
	 
		 