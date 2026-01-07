package com.pojo;

public class Employee2 {

	private int id;
	private String name;
	private Address address;
	
	public Employee2(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address=address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getA() {
		return address;
	}

	public void setA(Address address) {
		this.address = address;
	}

	
	
	
}
