package com.conditionalstatement;

public class If_else_if {

	public static void main(String[] args) {
//		int age = 190;

		/*if execute when condition is true and else block execute when condition is
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
	}

}
