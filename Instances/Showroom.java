class Showroom
{
 static String place="Bangalore";
  String brand;
  String model;
  int price;
  
  
  Showroom()
  {
	  System.out.println("Inside No Arguement Constructor");
  }
  Showroom(String a1, String a2 ,int a3 )
  {
	  
	  	System.out.println("Inside Parameterised constructor ");
	 brand=a1;
	 model=a2;
	 price=a3;
  
	  
  }
}
	  