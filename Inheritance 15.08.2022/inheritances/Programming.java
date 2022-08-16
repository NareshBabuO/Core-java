package com.xworkz.inheritances;

public class Programming {

	public String name;
	public String lang;
	public double size;
	public String founder = "james Gosling";
	public int from;

	public Programming(String name, String lang, int from) {
		this.name = name;
		this.lang = lang;
		this.from = from;
		System.out.println("Constructor with Argsuments");
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void PrintData() {
		System.out.println(this.name);
		System.out.println(this.lang);
		System.out.println(this.size);
		System.out.println(this.founder);
		System.out.println(this.from);
	}

}
