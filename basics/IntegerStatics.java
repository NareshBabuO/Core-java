package com.xworkz.basics;

public class IntegerStatics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in=new Integer("12");
		 int i1=in.bitCount(2);
		System.out.println(i1);
		int i2=in.compareTo(3);//dout
		System.out.println(i2);
		int i3=in.compareUnsigned(1, 4);
		System.out.println(i3);
		Integer i4=in.decode("6");
		System.out.println(i4);
		int i5=in.divideUnsigned(2,5);
		System.out.println(i5);
		Integer i6=in.getInteger("7");
		System.out.println(i6);
		Integer i7=in.getInteger("3", 5);
		System.out.println(i7);
		int i8=in.reverse(4);
		System.out.println(i8);
		int i9=in.signum(5);
		System.out.println(i9);
	
	}

}
