public class StringinPDT {

	public static void main(String[] args) {
		
	//byte,char,short,Int,long,float,double	
		String s="120";
		byte b=Byte.parseByte(s);
		if (b<127)
		{
		System.out.println("* the given String is in byte Range")	;
		System.out.println("The byte Value of given String is " +"\t" +b + "\n");
		}
		else {
			System.out.println("out of byte range");
		}
			
		
		String s1="no one";
		char c=s1.charAt(3);
		System.out.println("* The charactor value is "+"\t" + c +"\n");
		
		String s2="80";
		short sh=Short.parseShort(s2);
		System.out.println("*The Short value is "+"\t" + sh +"\n");
		
				
		
		String S="500";
		int i=Integer.parseInt(S);
		System.out.println("*The integer Value of given String is " +"\t" +i + "\n");
		
		
		String S1="500.00050";
		double d=Double.parseDouble(S1);
		System.out.println("*  The double Value of given String is " +"\t" +d + "\n");
		
		String S2="500.500";
		float f=Float.parseFloat(S2);
		System.out.println("*The float Value of given String is " +"\t" +f + "\n");
		
		
	    String S3="true";
		String S4="trUe";
		String S5="no";
		
		boolean b1=Boolean.parseBoolean(S3);
		boolean b2=Boolean.parseBoolean(S4);
		boolean b3=Boolean.parseBoolean(S5);
		System.out.println("the boolean value is "+"\n" + b1 +"\n"+b2+"\n"+b3);
	}
}