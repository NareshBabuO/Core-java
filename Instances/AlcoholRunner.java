class AlcoholRunner
{
 public static void main(String [] args)
 {
 Alcohol alcohol= new Alcohol();
 alcohol.shopName="Baa Guru Kudi";
 alcohol.brand="Tropichi";
 alcohol.cost=1300;
 System.out.println("The Type of Alcohol is "+Alcohol.type);
 System.out.println("The Shope name is"+alcohol.shopName);
 System.out.println("The Alcohol Brand is "+alcohol.brand);
 System.out.println("The alcohol cost is "+alcohol.cost+"\n");
 
 Alcohol alcohol1= new Alcohol("Red Rock ","Melbac", 1500);
 System.out.println("The Type of Alcohol is "+Alcohol.type);
 System.out.println("The Shope name is"+alcohol1.shopName);
 System.out.println("The Alcohol Brand is "+alcohol1.brand);
 System.out.println("The alcohol cost is "+alcohol1.cost+"\n");
 
 Alcohol alcoho2= new Alcohol();
  Alcohol.type="HOT";
 alcohol.shopName="MRP";
 alcohol.brand="100 pipes";
 alcohol.cost=1300;
 System.out.println("The Type of Alcohol is "+Alcohol.type);
 System.out.println("The Shope name is"+alcohol.shopName);
 System.out.println("The Alcohol Brand is "+alcohol.brand);
 System.out.println("The alcohol cost is "+alcohol.cost+"\n");
 
 Alcohol alcohol3= new Alcohol("Lakshmi wine","IB", 200);
 System.out.println("The Type of Alcohol is "+Alcohol.type);
 System.out.println("The Shope name is"+alcohol3.shopName);
 System.out.println("The Alcohol Brand is "+alcohol3.brand);
 System.out.println("The alcohol cost is "+alcohol3.cost+"\n");
 
 Alcohol alcohol4= new Alcohol("Manjunaths Wines","RC", 1000);
 System.out.println("The Type of Alcohol is "+Alcohol.type);
 System.out.println("The Shope name is"+alcohol4.shopName);
 System.out.println("The Alcohol Brand is "+alcohol4.brand);
 System.out.println("The alcohol cost is "+alcohol4.cost+"\n");
 }
}