package com.operators;

public class Increment_DecrementOperator {

	public static void main(String[] args) {
		
		System.out.println("---------------Increment/Decrement Operator");
		int a=9;
		a++;//10
		System.out.println(a++);//11
		System.out.println(a++);//12
		System.out.println(a--);//11
		System.out.println(a--);//10
		System.out.println(a++);//11
		System.out.println(a--);//10
		System.out.println(a--);//9
		System.out.println(a++);//10
		System.out.println(a--);//9
		System.out.println(a--);//8
		System.out.println(a++);//9
		System.out.println(a);
		//final answer is an 9
		
		//same as --a ++a
		
		int b=20;
		System.out.println(++b);//21
		System.out.println(b++);//22
		System.out.println(b--);//21
		System.out.println(--b);//20
		System.out.println(b++);//21
		System.out.println(--b);//20
		System.out.println(--b);//19
		System.out.println(++b);//20
		System.out.println(b--);//19
		System.out.println(b--);//18
		System.out.println(b++);//19
		System.out.println(b);//19
	}

}
