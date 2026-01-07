package com.pojo;


//7. Create class Address (city, state).
//Create class Employee (id, name) which has-a Address.
//Take details using Scanner
//Print employee along with address
//(Shows object inside object)

public class Address {

	private String city;
	private String state;
	
	Address()
	{
		
	}
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
