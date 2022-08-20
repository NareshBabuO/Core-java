package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Keyboard;

public class TouchPad extends Keyboard {
	
	public String firstKey;
	public String keytoGoback;
	public int muteKeyno;

	//public TouchPadKeyboard(String firstKey,String keytoGoback,int mutekeyno)
	//{
		//this.firstKey=firstKey;
		//this.keytoGoback=keytoGoback;
		//this.muteKeyno=muteKeyno;
		//System.out.println("Constructor with sub class Args");
	//}
	public TouchPad()
	{
		super();
		System.out.println("Constcrutor with String,String ,int args");
		
	}
	public void printData()
	{
		System.out.println(super.brand);
		System.out.println(super.totalKey);
		System.out.println(super.longkey);
		System.out.println(this.firstKey);
		System.out.println(this.keytoGoback);
		System.out.println(this.muteKeyno);
	}

}
