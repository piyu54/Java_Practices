package com.ops.Polymorphism.Methodoverloading;

public class Convert {

	void convert(double celsius) {
        System.out.println("Fahrenheit: " + ((celsius * 9/5) + 32));
    }

    void convert(int fahrenheit, int x) {
        System.out.println("Celsius: " + ((fahrenheit - 32) * 5/9));
    }

    public static void main(String[] args) {
        Convert c = new Convert();
        c.convert(25.0);
        c.convert(77, 0);
    }

}
