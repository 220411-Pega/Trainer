package com.revature.otherpackage;

public class Child extends Parent {

	public void testVisibility() {
		// privateInt = 10; // Never visible
		protectedInt = 6; // Visible because its a child and in the same package as Parent
		defaultInt = 9; // Visible because this class is in the same package as Parent
		publicInt = 11; // Always visible
	}
}
