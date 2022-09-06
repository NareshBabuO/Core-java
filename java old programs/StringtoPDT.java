class StringtoPDT
{
	public static void main(String[] args)
	{
		
			
		//byte ,char,int , long ,float,double,boolean
		String s="120";
		byte b=Byte.parseByte(s);
		System.out.println("the value of byte is " +"\n" +b);
		
		String s1="1210";
		char c=s1.charAt(2);
		System.out.println("the value of Char is" +"\n" +c);
		
		String s2="120";
		short sh=Short.parseShort(s2);
		System.out.println(" the value of Short is " +"\n" +sh);
		
		String s3="120";
		int i=Integer.parseInt(s3);
		System.out.println(" the value of Integer is " +"\n" +i);
		
		String s4="1200000";
		long l=Long.parseLong(s4);
		System.out.println(" the value of long is " +"\n" + l); 
		
		String s5="12.00";
		float f=Float.parseFloat(s5);
		System.out.println(" the value of float is " +"\n" +f);
		
		String s6="120545.0225";
		double d=Double.parseDouble(s6);
		System.out.println("the value of double is "+"\n"+d);
		
		String s7="true";
		String s8="trUe";
		String s9="tue";
		boolean b1=Boolean.parseBoolean(s7);
		boolean b2=Boolean.parseBoolean(s8);
		boolean b3=Boolean.parseBoolean(s9);
		System.out.println(" the boolean value is " +"\n" +b1 +"\n" +b2 +"\n" +b3);
		
		
	}
}
		
		