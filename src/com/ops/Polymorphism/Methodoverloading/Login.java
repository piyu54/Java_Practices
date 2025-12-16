package com.ops.Polymorphism.Methodoverloading;

/*15. Overload a method login() with:
username
username and password*/

public class Login {
	
	
	void login(String username)
	{
		System.out.println(username);
	}
	
	void login(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	public static void main(String[] args) {
		
		Login l = new Login();
		l.login("piyu");
		l.login("piyali", "abcccccc");
	}

}
