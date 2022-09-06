class HouseRunner
{
  public static void main ( String [] args)
  { 
     String name=House.name;
	 {
		 System.out.println("The Name of house is "+ name);
	 }
	 {
		 System.out.println("The House located in"+House.area);
	 }
	 House.setFloor();
	 House.setFloor(1);
	 House.rent=9500;
	 {
	 System.out.println("The rent of house is"+ "\t"+ House.rent);
	 }
  }
}