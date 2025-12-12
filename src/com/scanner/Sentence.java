package com.scanner;

import java.util.Scanner;

public class Sentence {
//Take a sentence from user using nextLine() and print it.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Sentence");

		String Sentence = s.nextLine();

		System.out.println(Sentence);
	}

}
