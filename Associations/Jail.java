class Jail
{
	String name;//constr
	int noOfCells;//refe
	 int noOfGates;//meth
	 String[] staffNames;//constr
	 
	 
	 Jail(String name)
	 {
		 this.name=name;
	 }
	 Jail (String name , int noOfCells)
	 {
		 this(name);
		 this.noOfCells=noOfCells;
	 }
	 
	 void setNoOfGates(int noOfGates)
	 {
		 
		 this.noOfGates=noOfGates;
	 }
	 void getArray(String [] value)
	 {
	  this.staffNames=value;
	 }
	 void printData()
	 {
		 System.out.println("The name of the jail is "+this.name);
		 System.out.println("The total cells in gail is "+this.noOfCells);
		 System.out.println("The number of gates in gail is "+this.noOfGates);
		 
	 for (int count=0; count < this.staffNames.length; count++)
	 {
		 System.out.println(this.staffNames[count]);
	 }
}
}