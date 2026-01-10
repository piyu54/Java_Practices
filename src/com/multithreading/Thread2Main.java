package com.multithreading;

public class Thread2Main {

	public static void main(String[] args) {
		
		
		Thread2 t = new Thread2();
		t.m1();
		
		Thread t2 = new Thread();
		t2.start();
	}
}
