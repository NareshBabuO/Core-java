package com.xworkz.basics;

public class BooleanStatics {

	public static void main(String[] args) {
		
		Boolean bl = new Boolean("true");
		int i = bl.compare(true, false);
		System.out.println(i);
		boolean i1 = bl.getBoolean("Naresh");
		System.out.println(i1);
		int i2=bl.hashCode();
		System.out.println(i2);
		boolean i3=bl.logicalAnd(true,false);
		System.out.println(i3);
		boolean i4=bl.logicalOr(false, true);
		System.out.println(i4);
		boolean i5=bl.parseBoolean("Nare");
		System.out.println(i5);
		String i6=bl.toString();
		System.out.println(i6);
		
	}

}
