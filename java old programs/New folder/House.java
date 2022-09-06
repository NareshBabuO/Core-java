class House
{
 static String name;
 static String area="BTM";
 static int floor;
 static double rent;
 
 
 static 
 {
	 name="gokula";
 }
 static void setFloor()
 {
	 floor=2;
 System.out.println("the Total FLoor of House is "+floor);
 }
 static void setFloor(int value)
 {
 floor=value;
 System.out.println("The 2nd  total floor value is "+floor);
}
}