package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.sub.Prepaid;
import com.xworkz.abstracts.sup.SimCard;
import com.xworkz.abstracts.supsub.Postpaid;

public class SimcardRunner {

	public static void main(String[] args) {
		// Prepaid.call();
		SimCard prepaid = new Prepaid();
		// prepaid.call();
		prepaid.checkBalance();
		// prepaid.network();
		prepaid.smsService();
		Prepaid con = (Prepaid) prepaid; // type casting
		con.display();
		System.out.println("Post Paid Class Properties");
		Postpaid postpaid = new Postpaid();
		postpaid.call();
		postpaid.checkBalance();
		postpaid.smsService();
		postpaid.network();
		System.out.println("Type Casting");

	}

}