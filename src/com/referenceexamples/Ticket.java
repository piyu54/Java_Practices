package com.referenceexamples;

public class Ticket {

	public static void main(String[] args) {
		
		
		SeatArrangement t;
//		t=new SeatArrangement();
//		t.getSeatAvailability(0);
		
		t=new Tier1();
		t.getSeatAvailability(6);
		
		t=new Tier2();
		t.getSeatAvailability(77);
		
		t=new Tier3();
		t.getSeatAvailability(99);
	}
}
