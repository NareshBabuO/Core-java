class PSRunner
{
   public static void main(String [] values)
   {
	
	   String [] names = {"Nagesh", "Dyamanna","Dada","Gopi"};
	   
	   PS ps=new PS(names);
	   ps.setNoOfStaff(12);
	   ps.inspectorName="Agni";
	   ps.printData();
   }
}