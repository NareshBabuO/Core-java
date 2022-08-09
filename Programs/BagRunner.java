class BagRunner
{
   public static void main(String[] args)
   {
	   String company=Bag.company;
	   {
		   System.out.println("The Bag Company is "+"\t"+company);
	   }
	   String color=Bag.color;
	   {
		   System.out.println("The Bag Color  is "+"\t"+color);
	   }
	   Bag.setCost();
	   Bag.setCost(1200);
	   int space=Bag.space;
	   {
		   space=3;
	   System.out.println("The Total space in the bag is "+"\t"+space);
	   }
   }
}