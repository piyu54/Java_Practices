package com.methods;

public class MyInfo {

	String firstName;
	String lastName;
	int mobNum;
	long drivingL;
	String pancard;
	String votingCard;
	String passPort;

	public void myInfo(String firstName, String lastName, int mobNum, long drivingL, String pancard, String votingCard,
			String passPort) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNum = mobNum;
		this.drivingL = drivingL;
		this.pancard = pancard;
		this.votingCard = votingCard;
		this.passPort = passPort;

		System.out.println("My first name is " + firstName);
		System.out.println("My lastName name is " + lastName);
		System.out.println("My mobNum is " + mobNum);
		System.out.println("My drivingL is " + drivingL);
		System.out.println("My pancard is " + pancard);
		System.out.println("My votingCard is " + votingCard);
		System.out.println("My passPort is " + passPort);

	}

}
