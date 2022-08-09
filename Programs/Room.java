class Room
{
 static String location;
 static int floor=1;
 static int doornumber;
 static double rent;
 
 static 
 {
	 location="banglore";
 }
 static void setDoornumber()
 {
	 doornumber=232;
	 System.out.println("The Door number of the Room is "+doornumber);
 }
 static void setDoornumber(int value)
 {
	 doornumber=value;
 
 System.out.println("The door 2nd number of the room is"+doornumber);
}
}