package com.xworkz.test;

import java.util.Scanner;

public class NoOfCharesctor {
	public static void main(String args[]) {
		String str;
		System.out.print("\nEnter a string :");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int i = 0;
		for (char c : str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string : " + i);
	}
}