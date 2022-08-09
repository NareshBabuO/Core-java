class Game
{
	String name;//con
	double storage;//met
	Maps[] totalMaps;//con
	Lifes[] totalLifes;//met

	Game(String name , Maps[] totalMaps)
	{
		this.name=name;
		this.totalMaps=totalMaps;
	}
	void setStorage(double Storage)
	{
		this.storage=Storage;
	}
	void setTotalLifes(Lifes[] tLifes)
	{
		this.totalLifes=tLifes;
	}
	void printData()
	{
		System.out.println("The Game name is "+this.name);
		System.out.println("The Total Storage of Game is "+this.storage);
		
		
		for (int tm=0; tm<totalMaps.length; tm++)
		{
			System.out.println("The Total maps in game is "+totalMaps[tm]);
		}
		for (int tl=0; tl<totalLifes.length; tl++)
		{
			System.out.println("The Total lifes in Game is "+this.totalLifes[tl]);
		}
	}
}
		