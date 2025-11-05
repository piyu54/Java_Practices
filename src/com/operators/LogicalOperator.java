package com.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		//logical operator AND &&,OR ||,NOT !
		
		System.out.println("-----------------Logical And &&-------------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("-----------------Real Time Example-------------");
		System.out.println(4>3 && 8>4);
		System.out.println(2>3 && 8>4);
		System.out.println(5>3 && 1>4);
		System.out.println(2>3 && 1>4);
		
		
		System.out.println("-----------------Logical OR ||-------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("-----------------Real Time Example-------------");
		System.out.println(4>3 || 10>4);
		System.out.println(2>3 || 8>4);
		System.out.println(5>3 || 1>4);
		System.out.println(2>3 || 1>4);
		
		
		int a=7,b=9;
		System.out.println("-----------------Logical NOT !-------------");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("-----------------Real Time Example-------------");
		System.out.println(!(a>b));
		System.out.println(!(b>a));
		
		
		
	}

}
