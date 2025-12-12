package com.methods;

//methods 

/*
  returnType methodName(parameters) {
    // method body
    // logic
    return value;   // only for return type methods
}


1. No return, No parameters              void    	   none  	void show(){}
2. No return, With parameters            void   	   yes	        void sum(int a, int b){}
3. With return, No parameters     	returns value      none 	int getAge(){}
4. With return, With parameters  	returns value      yes  	int add(int a, int b){}*/

public class Demo {
	
	
	//parameterized method without return type 

	void display(int a)
	{
		System.out.println("parameterized method without return type ");
	}
	
	void cube(int num)
	{
		System.out.println("parameterized method without return type "+num*num*num);
	}
	
	
//	non-parameterized method without return type 
	
	
	void display()
	{
		System.out.println("non-parameterized method without return type ");
	}
	
	void mySquare()
	{
		int num=20;
		System.out.println("non-parameterized method without return type "+num*num);
	}
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display();
		d.display(10);
		d.mySquare();
		d.cube(10);
		
	}
}
