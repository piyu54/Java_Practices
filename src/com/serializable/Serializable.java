package com.serializable;


import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class Serializable {

	public static void main(String[] args) throws Exception{
		
		Student s = new Student(101, "Sakshi", "G H Raisoni", 12345670, "Mahal", "Nagpur");
		
		FileOutputStream file = new FileOutputStream("D:\\c bkp\\kiran\\Student.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(file);
		
		oos.writeObject(s);
		
		System.out.println("File Created Successfully!!!");
		
		oos.close();
		file.close();
		

		
	}
}
