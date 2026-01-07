package com.pojo;

public class B extends A {

	B() {
		this(10);
		System.out.println("THIS IS AN CHILD CLASS NO ARG CONST");

	}

	B(int x) {
		super();
		System.out.println("THIS IS AN CHILD CLASS  ARG CONST");
	}
}
