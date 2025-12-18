package com.constructorposibilities;

public class Parameterized2 extends Parameterized {

	
	int mob;
	
	Parameterized2(int id, String firstname,String lastname,int mob) {
		super(id, firstname,lastname);
		this.mob=mob;
		this.display();
	}
	
	private void display() {

		System.out.println(id +" "+firstname);
		System.out.println(id +" "+firstname +" "+lastname);
		System.out.println(id +" "+firstname +" "+lastname +" "+mob);

	}
	
	public static void main(String[] args) {
		Parameterized2 p = new Parameterized2(101, "piyu", "kushwaha", 236360);

	}

	
	
}
