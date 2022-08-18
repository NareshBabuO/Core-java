package com.xworkz.inheritancesrunners;

import com.xworkz.inheritances.*;

public class ChromeRunner {

	public static void main(String[] args) {

		Browser chrome = new Browser("Chrome", "Google", 45);
		chrome.setUseage("Public");
		chrome.printData();
	}

}
