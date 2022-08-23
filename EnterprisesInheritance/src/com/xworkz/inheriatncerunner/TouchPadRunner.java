package com.xworkz.inheriatncerunner;

import com.xworkz.inheriatnce.sub.TouchPad;
import com.xworkz.inheritance.sup.Keyboard;

public class TouchPadRunner {

	public static void main(String[] args) {
		//System.out.println(super.brand);
	//	System.out.println(super.totalKey);
		//System.out.println(super.longkey);
		//System.out.println(this.firstKey);
		//System.out.println(this.keytoGoback);
		//System.out.println(this.muteKeyno);
		TouchPad tp=new TouchPad();
		tp.brand="HP";
		tp.totalKey=101;
		tp.longkey="Space";
		tp.firstKey="ESC";
		tp.keytoGoback="Backspace";
		tp.muteKeyno=1;
		tp.printData();
		
		Keyboard keyboard = new TouchPad();

		TouchPad convertedfromParent = (TouchPad) keyboard;
		{
			convertedfromParent.brand="HP";	
			convertedfromParent.totalKey=101;
			convertedfromParent.longkey="Space";
			convertedfromParent.firstKey="ESC";
			convertedfromParent.keytoGoback="Backspace";
			convertedfromParent.muteKeyno=1;
			convertedfromParent.printData();
		}
	}

	}