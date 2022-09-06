class GameRunner
{
   public static void main(String [] args)
   {
	Maps[] tMaps  ={Maps.ERANGAL,Maps.SANWAK,Maps.WANKANDE};
	Lifes[] tLifes={Lifes.ONE,Lifes.TWO};
	
	
	Game game=new Game("PUBG" , tMaps);
	game.setStorage(1400);
	game.setTotalLifes(tLifes);
	game.printData();
   }
}	
   