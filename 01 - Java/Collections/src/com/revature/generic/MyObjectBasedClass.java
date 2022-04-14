package com.revature.generic;

public class MyObjectBasedClass {

	public Object myPayload;
	
	public MyObjectBasedClass(Object payload) {
		myPayload = payload;
	}
	
	public void showPayload() {
		System.out.println("My payload is: " + myPayload);
	}
}
