class Trainer
{
 String name;
 long contactNo;
 Gender gender;//eum
 int age;
 double exp;
 
 Trainer( String name, long contactNo, Gender gender , int age)
 {
	 System.out.println("The Trainer details is");
	 this.name=name;
	 this.contactNo=contactNo;
	 this.gender=gender;
	 this.age=age;
	 
 }
 void setExp(double exp)
 {
	 this.exp=exp;
 }
 void printData()
 {
	 System.out.println(this.name);
	 System.out.println(this.contactNo);
	 System.out.println(this.gender.MALE.actualValue);
	 System.out.println(this.age);
 }
}
 