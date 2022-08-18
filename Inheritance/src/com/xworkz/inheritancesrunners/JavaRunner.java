package com.xworkz.inheritancesrunners;
import com.xworkz.inheritances.*;
public class JavaRunner {

	public static void main(String[] args) {
		//String name, String lang, int from
		Java java=new Java("java","web ,Mysql",1995);
		java.setSize(76);
		java.PrintData();
	}

}
