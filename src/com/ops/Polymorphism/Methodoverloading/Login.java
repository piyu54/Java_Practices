package com.ops.Polymorphism.Methodoverloading;

/*15. Overload a method login() with:
username
username and password*/

public class Login {
	
	
	void login(String username)
	{
		System.out.println("Username is: "+username);
	}
	
	void login(String username,String password)
	{
		System.out.println("Username is: " +username +" And Password is: "+password);
		
	}
	
	public static void main(String[] args) {
		
		Login l = new Login();
		l.login("piyu");
		l.login("piyu", "piyu123@.");
	}

}
