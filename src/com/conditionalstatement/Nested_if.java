package com.conditionalstatement;

public class Nested_if {

	public static void main(String[] args) {
		if(true)
		{
			if(true)
			{
				System.out.println("Hie");
			}
			
		}
		else
		{
			System.out.println("invaild");
		}
		//hie is execute
		
		
		if(false)
		{
			if(true)
			{
				System.out.println("Hie");
			}
			
		}
		else
		{
			System.out.println("invaild");
		}
		//here  invalid execute
		if(true)
		{
			if(false)
			{
				System.out.println("Hie");
			}
			
		}
		else
		{
			System.out.println("invaild");
		}
		//here blank 
	}

}
