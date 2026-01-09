package com.practisequestionemo;

public class InvalidAgeException extends RuntimeException {

	
	private String message;
	
	InvalidAgeException(String message)
	{
		super(message);
	}
}
