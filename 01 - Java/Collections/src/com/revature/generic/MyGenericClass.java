package com.revature.generic;

// Generic classes use <T> to indicate that T is the placeholder for
// whatever class is used with the generic class
public class MyGenericClass <T> {
	
	private T myPayload;
	
	public MyGenericClass(T payload) {
		myPayload = payload;
	}
	
	public void showPayload() {
		System.out.println("My payload is: " + myPayload);
	}
}
