class CarromBoardRunner
{ 
   public static void main(String [] args)
   {
	   
	   //  static String brand;//Synco
// int coinType;
// int totalCoins;//19
	   CarromBoard cboard=new CarromBoard();
	   cboard.brand="Synco";
	   cboard.totalType=3;
	   cboard.totalCoins=19;
	   System.out.println("The CarromBoard Brand is  "+cboard.brand);
	   System.out.println("The CarromBoard mainCoin is  "+cboard.dimension);
	   System.out.println("The CarromBoard total Coins Type is  "+cboard.totalType);
	   System.out.println("The CarromBoard have Total "+cboard.totalCoins +  "Coins"+"\n");
	   
	    CarromBoard cboard1= new CarromBoard("Vinex",3,19 );
	    System.out.println("The CarromBoard Brand is  "+cboard1.brand);
	    System.out.println("The CarromBoard mainCoin is  "+cboard1.dimension);
	    System.out.println("The CarromBoard total Coins Type is  "+cboard1.totalType);
	    System.out.println("The CarromBoard have Total "+cboard1.totalCoins +  "Coins"+"\n");
	   
	   CarromBoard cboard2= new CarromBoard("siscaa",3,19 );
	    System.out.println("The CarromBoard Brand is  "+cboard2.brand); 	
	    System.out.println("The CarromBoard mainCoin is  "+cboard2.dimension);
	    System.out.println("The CarromBoard total Coins Type is  "+cboard2.totalType);
	    System.out.println("The CarromBoard have Total "+cboard2.totalCoins +  "Coins"+"\n");
		
		CarromBoard cboard3= new CarromBoard("stag",3,19 );
	    System.out.println("The CarromBoard Brand is  "+cboard3.brand);
	    System.out.println("The CarromBoard mainCoin is  "+cboard3.dimension);
	    System.out.println("The CarromBoard total Coins Type is  "+cboard3.totalType);
	    System.out.println("The CarromBoard have Total "+cboard3.totalCoins +  "Coins"+"\n");
	   
	   CarromBoard cboard4= new CarromBoard("precise",3,19 );
	    System.out.println("The CarromBoard Brand is  "+cboard4.brand);
	    System.out.println("The CarromBoard mainCoin is  "+cboard4.dimension);
	    System.out.println("The CarromBoard total Coins Type is  "+cboard4.totalType);
	    System.out.println("The CarromBoard have Total "+cboard4.totalCoins +  "Coins"+"\n");
	   
	   
	   
   }

}