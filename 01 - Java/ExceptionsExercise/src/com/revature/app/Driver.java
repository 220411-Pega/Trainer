package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("What's that? It's... It's..!");
		try {
			// Here we call the method that will throw the exception. Can be found below
			Driver.throwMyException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// The throws keyword marks a method as potentially throwing exceptions, followed by the kinds of possible exceptions to throw
	public static void throwMyException() throws MyBadException {
		throw new MyBadException();
	}
}
