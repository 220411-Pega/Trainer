package com.revature.app;

// Here, we have MyBadException which is a child class of Exception thinks 
public class MyBadException extends Exception {

	// We call the superclass (parent class) constructor using the keyword super()
	public MyBadException() {
		super("This is an incredibly bad exception.");
	}
	
	// We can also call parent constructor overloads by passing in parameters
	public MyBadException(String message) {
		super(message);
	}
}
