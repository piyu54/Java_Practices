package com.encapsulation;

public class Admin {

	public static void main(String[] args) {
		
		
		UserAccount u = new UserAccount();
		u.setUsername("piyali");
		u.setPass("piyali1234@.");
		
		System.out.println("User Username and User Password ");
		System.out.println(" Username is :"+u.getUsername());
		System.out.println(" Password is :"+u.GetPass());

	}

}
