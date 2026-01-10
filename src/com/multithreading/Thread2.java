package com.multithreading;

public class Thread2 implements A, B, Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void m1() {
		for (int i = 50; i <= 100; i++) {
			System.out.println(" A interface " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void m2() {
		for (int i = 110; i <= 200; i++) {
			System.out.println("B interface " + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
