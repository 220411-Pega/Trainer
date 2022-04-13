package com.revature.app;

/*
 * Abstract classes are similar interfaces in that they can have abstract methods and methods with a body.
 * They can also have instance variables, unlike an interface.
 */
public abstract class MyAbstractClass {
	
	// Can have instance variables, like a normal class
	int myInt = 10;
	
	// Can have instance methods, like a normal class
	public void doAbstractStuff() {
		System.out.println("Wow, Im so abstract!");
	}
	
	// Can also abstract methods (using the abstract keyword), like interfaces
	public abstract void implementMe();
}
