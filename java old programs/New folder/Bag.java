class Bag
{
 static String company;
 static String color="red";
 static double cost;
 static int space;
 
 static 
 {
	 company="puma";
 }
 static void setCost()
 {
	 cost=1450;
	  System.out.println("The cost of the bag is"+"\t"+ cost);
 }
 static void setCost(double value)
 {
	 cost=value;
		   System.out.println("The parchage cost of the bag is "+"\t"+ cost);
 }
}