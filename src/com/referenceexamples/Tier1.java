package com.referenceexamples;

public class Tier1 extends SeatArrangement{

	@Override
	void getSeatAvailability(int seat) {
		
		System.out.println("FirstTier "+ seat);
	}
}
