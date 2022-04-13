package com.revature.app;

public interface MyInterface {
	
	// All variables are final in an interface, that is, they cannot be changed during runtime
	public int i = 0;
	
	// Interfaces may only have "abstract methods", that is, methods 
	// with no body and which are appended with a ;
	public void doSomething();
	
	// ... Unless we use the default keyword
	public default void doMoreThings() {
		System.out.println("Doing more things!");
	}
}