class Hospital
{
String name;
Sepcilaization sepcilaization;//enum
String [] equipments;//array
double consultationFees;
Founder founder;//another class


Hospital (String name, double consultationFees,Founder founder,Sepcilaization sepcilaization, String [] equipments)
{
	this.name=name;
	this.consultationFees=consultationFees;
	this.founder=founder;
	this.sepcilaization=sepcilaization;
	this.equipments=equipments;
	System.out.println("The Constructor with 5 args");
}	
	void printData()
	{
		//this.founder.printData();
		System.out.println(this.name);
		System.out.println(this.consultationFees);
		
		for (int eqip=0; eqip<equipments.length; eqip++)
		{
			System.out.println(this.equipments[eqip]);
		}
	}
}
