class House
{
  String name;//co
  int noOfRooms;//meth
  String area;//meth
  String [] members;//co
  String [] types;//meth
  
  
  House (String name)
  {
	  this.name=name;
  }
  void setNoOfRooms(int noOfRooms)
  {
	  this.noOfRooms=noOfRooms;
  }
  void area( String area)
  {
	  this.area=area;
  }
  void getArray(String [] type)
  {
	  this.types=type;
  }
  void printData()
  {
	  System.out.println("The Name of House is "+this.name);
	  System.out.println("The total no of Room in House is " +this.noOfRooms);
	  
	  
	  
  for ( int mem=0; mem<this.members.length ; mem++)
  {
	  System.out.println("The total members in House is "+this.members[mem]);
  }
  for ( int type=0; type<this.types.length; type++)
   {
	   System.out.println("The Total types of Rooms inside House is "+this.types[type]);
   }	  
  }
}
  
  