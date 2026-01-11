package com.abtraction;

public class MyAppMain {

	public static void main(String[] args) {
		
//		Admin a = new Admin();
//		a.Appname();
//		a.myAuthenticate();
//		User u = new User();
//		u.myAuthenticate();
		
		Login l;
		l=new Admin();
		l.Appname();
		l.myAuthenticate();
		l=new User();
		l.myAuthenticate();
	}
}
