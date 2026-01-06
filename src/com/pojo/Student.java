package com.pojo;



public class Student {

	private int id;
	private String name;
	private float perc;
	
	Student()
	{
		
	}
	
	Student(int id,String name,float perc)
	{
		this.id=id;
		this.name=name;
		this.perc=perc;
		
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
	public float getPerc() {
		return perc;
	}
	public void setPerc(float perc) {
		this.perc = perc;
	}
	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}

	
		
}
