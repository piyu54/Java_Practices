package com.ops.Polymorphism.Methodoverloading;

/*5.Overload sum() using different data types:
sum(int, int)
sum(float, float)*/
public class Sum {

	void sum(int a, int b) {
		System.out.println("Integer value sum:" + a + b);
	}

	void sum(float a, float b) {
		System.out.println("Float value sum:" + a + b);
	}

	public static void main(String[] args) {
		
		Sum s = new Sum();
		s.sum(1018f, 111f);
		s.sum(19, 10);
	}
	
	

}
