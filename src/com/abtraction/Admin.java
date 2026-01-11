package com.abtraction;

public class Admin extends Login{

	@Override
	public void myAuthenticate() {
		System.out.println("This is an Admin");
		
	}
	
}
