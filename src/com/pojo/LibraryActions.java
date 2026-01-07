package com.pojo;

public abstract class LibraryActions {

	
	public static final int LateFee=200;
	
	public  abstract  void issueBook();
	public abstract void returnBook(int dayslate);
	
}
