package com.practisequestionemo;

//Create a custom exception InvalidAgeException and throw it using throw.
public class Age extends RuntimeException{

	private int age;
	

//	public Age() {
//		
//		this.age = age;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void age(int agee)
	{
		if(agee<=0)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		System.out.println("Valid Age");
	}
	
}
