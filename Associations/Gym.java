class Gym
{
	
	String name;
	int fees;
	String [] equipments;//array
	Trainer trainer;//class
	
	Gym(String name, int fees, String [] equipments, Trainer trainer)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
		this.trainer=trainer;
		System.out.println("The Constructor with 4 args");
	}
	void printData()
	{
		//this.trainer.printData();
		System.out.println(this.name);
		System.out.println(this.fees);
	
	for (int equ=0; equ<equipments.length; equ++)
	{
		System.out.println(this.equipments[equ]);
	}
	
}
}
	