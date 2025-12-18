package com.constructorposibilities;

public class Default {

	//created by compiler only if we can not  /automatically call when object is created
	
	Default()
	{
		System.out.println("Default");
	}
	
	public static void main(String[] args) {
		
		Default d = new Default();
	}
}
