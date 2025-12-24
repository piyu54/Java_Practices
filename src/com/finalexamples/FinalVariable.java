package com.finalexamples;

public class FinalVariable {

	//final variable means we cant change 
	
	int a=10;
	
	final int b=99;
	
	
	void Finalv()
	{
		int c=88;
		final int d=90;
		System.out.println(c);
		System.out.println(d);
		System.out.println("Same with d we cannt change an or assign the different value");
	}
	
	void ValueChange()
	{
		System.out.println("Normal variable");
		System.out.println(a);
		this.Finalv();
		System.out.println("Final Variable");
		System.out.println("Same "+b+" but if we want to change we cannt but we can add the value "+b+" after add the value like 5 add then it will "+(b+5));
		System.out.println("But We cant assign the different value b=15 ");
		this.Finalv();
		
	}
	
	
	public static void main(String[] args) {
		
		FinalVariable f= new FinalVariable();
		f.ValueChange();
	}
	
}
