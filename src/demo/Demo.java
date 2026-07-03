package demo;

import java.util.Scanner;

public class Demo {

	
		public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        int arr[] = new int[10];

	        System.out.println("Enter 10 numbers:");

	        
	        for (int i = 0; i < 10; i++) {
	            arr[i] = s.nextInt();
	        }

	        System.out.print("Prime: ");
	        for (int i = 0; i < 10; i++) {
	            int count = 0;

	            for (int j = 1; j <= arr[i]; j++) {
	                if (arr[i] % j == 0) {
	                    count++;
	                }
	            }

	            if (count == 2) {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        System.out.print("\nNot Prime: ");
	        for (int i = 0; i < 10; i++) {
	            int count = 0;

	            for (int j = 1; j <= arr[i]; j++) {
	                if (arr[i] % j == 0) {
	                    count++;
	                }
	            }

	            if (count != 2) {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        s.close();
	}
}
