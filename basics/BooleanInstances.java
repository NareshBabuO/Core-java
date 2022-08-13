package com.xworkz.basics;

public class BooleanInstances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean bol=new Boolean("true");
		boolean b=bol.booleanValue();
		System.out.println(b);
		int b1=bol.compareTo(true);
		System.out.println(b1);
		boolean b2=bol.equals(b1);
		System.out.println(b2);
		int b3=bol.hashCode();
		System.out.println(b3);
		String b4=bol.toString();
		System.out.print(b4);
				

	}

}
