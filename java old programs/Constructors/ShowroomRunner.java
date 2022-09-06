class ShowroomRunner
{
   public static void main(String [] args)
   {
	     
	   Showroom showroom1=new Showroom();
	   
	   showroom1.brand="Maruti Suzuki";
	   showroom1.model="Alto";
	   showroom1.price=500000;
	   
	   System.out.println("The Showroom is in "+Showroom.place);
	   System.out.println("The Vehicle Brand is "+showroom1.brand);
	   System.out.println("The Car model is "+showroom1.model);
	   System.out.println("The Price of the Vehicle is"+showroom1.price+"\n");
	   
	   Showroom showroom2= new Showroom("Maruthi","Shift",8000000);
	   System.out.println("The Showroom is in "+Showroom.place);
	   System.out.println("The Vehicle Brand is "+showroom2.brand);
	   System.out.println("The Car model is "+showroom2.model);
	   System.out.println("The Price of the Vehicle is"+showroom2.price+"\n");
	   
	   Showroom showroom3 = new Showroom();
	   Showroom.place="Tumkur";
	   showroom1.brand="Maruti";
	   showroom1.model="Ritz";
	   showroom1.price=750000;
	   	   System.out.println("The Showroom is in "+Showroom.place);
	   System.out.println("The Vehicle Brand is "+showroom2.brand);
	   System.out.println("The Car model is "+showroom3.model);
	   System.out.println("The Price of the Vehicle is"+showroom3.price+"\n");
	   
	   	   Showroom showroom4= new Showroom("Audi","A2",20000000);
	   System.out.println("The Showroom is in "+Showroom.place);
	   System.out.println("The Vehicle Brand is "+showroom4.brand);
	   System.out.println("The Car model is "+showroom4.model);
	   System.out.println("The Price of the Vehicle is" +showroom4.price+"\n");
	   
	    Showroom showroom5= new Showroom("Audi","A3",40000000);
	   System.out.println("The Showroom is in "+Showroom.place);
	   System.out.println("The Vehicle Brand is "+showroom5.brand);
	   System.out.println("The Car model is "+showroom5.model);
	   System.out.println("The Price of the Vehicle is" +showroom5.price+"\n");
   }
}

	   