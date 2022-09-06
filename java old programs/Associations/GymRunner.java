class GymRunner
{
	public static void main (String [] workouts)
	{
		String [] equ={"Dumbels","Bar","weights","Theridmiles"};
		
		Trainer trainer=new Trainer("Raghu" ,785412652,Gender.MALE,27);
		trainer.setExp(3);
		trainer.printData();
		
		
		
		Gym gym= new Gym("Gold",3700,equ,trainer);
		gym.printData();
	//	trainer.printData();
	}
}
