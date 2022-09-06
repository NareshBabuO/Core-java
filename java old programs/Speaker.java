class Speaker
{
 static String type="Lourder";
 String brand;
 int weight;
 double cost;
 
 
 Speaker()
 {
   System.out.println("The Speaker details");
   }
   Speaker(String a1, int a2, double a3)
   {
	   	   System.out.println(" The Speaker inside parameter");
	   brand=a1;
	   weight=a2;
	   cost=a3;

   }
}