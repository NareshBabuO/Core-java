package com.xworkz.test;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Independent";

		String reverse = "";

		char ch;

		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);// extracts each character
			reverse = ch + reverse; // adds each character in front of the existing string
		}
		System.out.println(reverse);

	}

}
