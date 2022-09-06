class PS
{
 String name="Micho Layout";
 int noOfStaff;
 String inspectorName;
 String []  kaidiNames;
 
 
 PS(String[] kaidiNames)
 {
	 this.kaidiNames=kaidiNames;
 }
 void setNoOfStaff(int noOfStaff)
 {
	 this.noOfStaff=noOfStaff;
 }
 void printData()
 {
	 System.out.println(this.name);
	 System.out.println(this.noOfStaff);
	 System.out.println(this.inspectorName);
 
	 for (int count=0 ; count < this.kaidiNames.length ; count++)
	 {
		 System.out.println(this.kaidiNames[count]);
	 }
 }
}