class BusStop 
{
 String stopName;//con
 String startingPoint;//con
   String endPoint;//me
   int totalBench;//me
   String [] passengerNames;//con
   double [] timeOfArrival;//me
   
   // BusStop( String stopName)
   // {
	   // this.stopName=stopName;
   // }
   // BusStop(String stopName , String startingPoint)
   // {
	   // this(stopName);
	   // this.startingPoint=startingPoint;
   // }
   void setEndPoint(String endPoint)
   {
	   this.endPoint=endPoint;
   }
   void setTotalBench(int totalBench)
   {
	   this.totalBench=totalBench;
   }
   BusStop(String stopName , String startingPoint , String [] names)
   {
	   this.stopName=stopName;
	   this.startingPoint=startingPoint;
   this.passengerNames=names;
   }
   void getArray(double [] times)
   {
	   this.timeOfArrival=times;
   }
   void printData()
   {
	   System.out.println(this.stopName);
	   System.out.println(this.startingPoint);
	System.out.println(this.endPoint);
	System.out.println(this.totalBench);
	
	for (int count=0; count<this.passengerNames.length; count++)
	{
		System.out.println(this.passengerNames[count]);
	}
	for (int total=0; total<this.timeOfArrival.length; total++)
	{
		System.out.println(this.timeOfArrival[total]);
	}
   }
}
			 
  

	   
   
