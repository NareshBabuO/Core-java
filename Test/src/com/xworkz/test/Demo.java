package com.xworkz.test;

public class Demo {
	public static void main(String args[]) {
		int arr[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		System.out.println("Length of initial array = " + arr.length);
		int len = arr.length;
		int newArray[] = new int[len * 2];
		System.arraycopy(arr, 0, newArray, 0, len);
		System.out.println("Length of new array = " + newArray.length);
	}
}