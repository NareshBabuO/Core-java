class JailRunner
{
  public static void main(String [] values)
  {
	  String [] names ={"Raja", "Krishnappa","Bairya","RockyBhai"};
	  
	  Jail jail=new Jail("Parappanahara",15);
	  jail.setNoOfGates(4);
	  jail.getArray(names);
	  jail.printData();
  }
}