package com.ops.types.inheritance;

public class Laptop extends Device {

	void laptop() {
		System.out.println("Laptop");
	}

	public static void main(String[] args) {

		Laptop m = new Laptop();
		m.device();
		m.laptop();
	}
}
