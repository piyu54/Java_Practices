package com.ops.types.inheritance;

public class S extends R{

	void s()
	{
		System.out.println("this is an S");
	}
	
	public static void main(String[] args) {
		
		S s = new S();
		s.p();
		s.r();
		s.s();
	
	}
}
