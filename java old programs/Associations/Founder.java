class Founder
{
  String name;
  String from;
  Profession profession;//enum
  int since;
  long income;
 // boolean alive;
  
  
  Founder (String name, String from, int since , Profession profession )
  {
	  this.name=name;
	  this.from=from;
	  this.since=since;
	  this.profession=profession;
	  System.out.println("The Constructor with 3 args");
  }
  void setIncome(long income)
  {
	  this.income=income;
  }
  void printData()
  {
	  System.out.println(this.name);
	   System.out.println(this.from);
	   System.out.println(this.since);
	    System.out.println(this.income);
  }
}
	  