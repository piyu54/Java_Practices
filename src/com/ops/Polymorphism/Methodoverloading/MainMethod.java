package com.ops.Polymorphism.Methodoverloading;

/*9. Can you overload the main() method? Write a program to prove it.*/
public class MainMethod {

	
	public static void main(String[] args) {
        System.out.println("Original main method");
        main(10);
    }

    public static void main(int a) {
        System.out.println("Overloaded main: " + a);
    }
}
