package com.ops.Polymorphism.Methodoverloading;

public class Maximum {
/*11. Create a method max() to find maximum of:
two numbers
three numbers*/
	
	int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }
    
    
	public static void main(String[] args) {
		
		Maximum m = new Maximum();
		System.out.println(m.max(10, 20));
		System.out.println(m.max(10, 20, 60));
	}

}
