class BusStopRunner
{
  public static void main(String [] values)
  {
	  String [] names={"Shidarth", " Nandan" ,"Shaaho"};
	  double [] times={07.30, 8.20,10.45};
	  
	  BusStop bs= new BusStop("BTM" , "pumb house", names);
	  bs.setEndPoint("silk Board");
	  bs.setTotalBench(6);
	  bs.getArray(times);
	  bs.printData();
  }
}