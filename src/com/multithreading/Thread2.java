package com.multithreading;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println("Thread"+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public void m1() {
		for(int i=100;i<=199;i++)
		{
			System.out.println("m1 logic"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
