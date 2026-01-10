package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserializable {

	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("D:\\c bkp\\kiran\\Student.txt");
		ObjectInputStream ois = new ObjectInputStream(f);

		Student s1 = (Student) ois.readObject();

		System.out.println(s1.studId + " " + s1.studName + " " + s1.studClgName + " " + s1.studAddress + " "
				+ s1.studCity + " " + s1.studMob);

		ois.close();
		f.close();
	}
}
