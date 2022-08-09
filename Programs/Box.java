class Box
{
static String brand;
static String color="silver";
static int cost;
static double weight;



static
 {
   brand="Presitige";
   }
   static void setCost()
   {
	   cost=80;
	   System.out.println("The Cost of the box is "+"\t"+ cost);
   }
   static void  setCost(int value)
   {
	   cost=value;
	   System.out.println("The cost of Box we purchage is"+"\t"+cost);
   }
}
	  
