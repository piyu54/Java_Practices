package com.conditionalstatement;

public class If {

	public static void main(String[] args) {
		if(22>18) //if block execute only when the condition is true
		{
			System.out.println("You can vote");
		}

		
		int age=24;
		
		if(age>=18)
		{
			System.out.println("you can vote 1!");
		}
		
		
		int age2=5;
		
		if(age2>=18) //here the consition is false thats why if block didnt execute
		{
			System.out.println("you can vote 2");
		}
	}

}
