package com.ops.types.inheritance;

public class C3 extends B3 {

	void showC() {
		System.out.println("this is an class C");
	}

	public static void main(String[] args) {

		C3 c = new C3();
		c.showA();
		c.showB();
		c.showC();
	}
}
