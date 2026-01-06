package com.pojo;

import java.util.Scanner;

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

	public static void main(String[] args) {
		
		Student s= new Student(101,"piyu",92);
		System.out.println(s);
//		Scanner s = new Scanner (System.in);
//		System.out.println("Enter an student id");
//		int StuId =s.nextInt();
//		System.out.println("Enter an student name");
//		String Stuname=s.next();
//		System.out.println("Enter an student percentage");
//		float StuPer=s.nextFloat();
//
//		Student st = new Student(StuId, Stuname, StuPer );
//		System.out.println(st.getId()+" "+st.getName()+" "+st.getPerc());
	
//		s.close();
	}		
}
