package com.constructorposibilities;

public class Parameterized {

	int id;
	String firstname;
	String lastname;

	Parameterized(int id, String firstname) {
		this.id = id;
		this.firstname = firstname;
//		this.display();
	}

	//constructor overloading yes

	Parameterized(int id, String firstname,String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname=lastname;
		
	}
}
