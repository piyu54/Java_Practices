package com.exceptionhandling;

public class InsufffundExcep extends RuntimeException {

	private String message;

	public InsufffundExcep(String message) {
		super(message);
	}
}
