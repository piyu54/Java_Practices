package com.scanner;
import java.util.*;
public class CheckVowel {
//Take a character from user and check whether it is vowel or consonant.
	public static void main(String[] args) {
		//a,e,u,i,o 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your Character");
		
		char vowel =s.next().charAt(0);
		
		if(vowel=='a'||vowel=='e'||vowel=='u'||vowel=='i'||vowel=='o'||vowel=='A'||vowel=='E'||vowel=='U'||vowel=='I'||vowel=='O')
		{
			System.out.println("This is  an vowel ");
		}
		else
		{
			System.out.println("This is  an consonant");
		}
		
		

	}

}
