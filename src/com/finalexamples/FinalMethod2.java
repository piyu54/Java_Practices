package com.finalexamples;

public class FinalMethod2 extends FinalMethod{

	
	@Override
	void m1() {
		super.m1();
		System.out.println("This is an override method");
	}
	
	
	public static void main(String[] args) {
		
		FinalMethod2 f = new FinalMethod2();
		f.m1();
		f.m2();

	}

}
