package com.practisequestionemo;
//Write a program to create a thread using Thread class.
public class Threadfirst extends Thread{

	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
}
