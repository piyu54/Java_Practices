package com.conditionalstatement;

public class If_else_if {
//if else ladder
	public static void main(String[] args) {


		/*if execute when condition is true it is always executable and else block execute when condition is
		 false but  when it comes to an if else if  this only execute when if block is false*/
		if (true) {
			System.out.println("you can vote");
		} else if (true){
			System.out.println("you cant vote you are over age ");
		}
		else
		{
			System.out.println("you cant vote first be an 18+");
		}
		//if block is execute bec it is true 
		
		if (false) {
			System.out.println("you can vote");
		} else if (true){
			System.out.println("you cant vote you are over age ");
		}
		else
		{
			System.out.println("you cant vote first be an 18+");
		}
		//here else if block execute
		
		if (false) {
			System.out.println("you can vote");
		} else if (false){
			System.out.println("you cant vote you are over age ");
		}
		else
		{
			System.out.println("you cant vote first be an 18+");
		}
		//here else block is execute bec both if and else if is false
		
		
		int age = 190;
		
		if(age>=18 && age<=150)//true false = false
		{
			System.out.println("you can vote");
		}
		else if(age>150)//this is true bec age is greater than 150 
		{
			System.out.println("you cant vote you are over age ");
		}
		else
		{
			System.out.println("you cant vote first be an 18+");
		}
		//here else if block execute
	}

}
