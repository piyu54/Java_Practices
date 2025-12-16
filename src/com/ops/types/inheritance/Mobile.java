package com.ops.types.inheritance;

public class Mobile extends Device {

	
	void mobile()
	{
		System.out.println("Mobile");
	}
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.device();
		m.mobile();
	}
}
