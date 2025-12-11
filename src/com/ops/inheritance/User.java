package com.ops.inheritance;

public class User {

	public static void main(String[] args) {
		
		System.out.println("Insta User");
		Insta i = new Insta();
		i.myLogin();
		i.myMsg();
		i.myReels();
		i.myRegister();
		i.myStory();
		
		System.out.println("-------------------------------------");
		System.out.println("Whatsapp User");
		Whatsapp w= new Whatsapp();
		w.myRegister();
		w.myLogin();
		w.myMsg();
		w.myLocation();
		w.myStatus();
		
		System.out.println("-------------------------------------");
		System.out.println("FB User");
		Facebook f= new Facebook();
		f.myRegister();
		f.myLogin();
		f.myMsg();
		f.myPost();
		
	}
}
