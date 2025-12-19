package com.referenceexamples;

public class ScannerAsObject {

	// es ✅ we can take objects using Scanner, but not directly.

// Scanner cannot read an object in one go.
//We use Scanner to read object’s data (fields), then create the object using those values.

	int id;
	String name;

	ScannerAsObject(int id, String name) {

		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		 System.out.println("Student ID is :"+id + " " +"Student Name is :"+ name);
	}
}
