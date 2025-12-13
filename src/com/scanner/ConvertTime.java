package com.scanner;
import java.util.*;
public class ConvertTime {
// Take time in seconds and convert into minutes and seconds.
	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an Time Here in seconds");
		
	        int totalSec = s.nextInt();

	        int minutes = totalSec / 60;
	        int seconds = totalSec % 60;

	        System.out.println("Minutes = " + minutes);
	        System.out.println("Seconds = " + seconds);

	}

}
