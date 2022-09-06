public class Person
{
	public static void main (String[] args)
	{
		//for (int i=0; i<args.length; i++){
			//System.out.println("name" + i +":" +args[i]);
		if (args.length>4)
	String name=naresh[0];
	String emailID=args[1];
	String age=args[2];
	String area=args[3];
		System.out.println("The Name of Candiate is" + name);
		System.out.println("The emailId of candidate is"+emailID);
		System.out.println("The age of candiate is"+age);
		System.out.println("The area of candidate is"+area);
	
	int age1=Integer.parseInt(age);
	 if(age1>=18)
	 {
		  System.out.println("Candidate is eligible for voting");
	
	
		  if(age1>=21)
		  {
		  System.out.println("Candidate is eligible for marriage");
		  }
		  else
		  {
		  System.out.println("The least of andidate is not eligible for marriage");
		  }
	 }
	 else
	  {
	  System.out.println("The least of candidate is not eligible for voting");
	  }
	 }
	}