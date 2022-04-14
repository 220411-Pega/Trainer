package com.revature.otherpackage;

public class Parent {

	private int privateInt = 5;
	
	// When using private variables, as is good practice, you should also provide getters and/or setters,
	// depending on how you want developers to interact with your variables
	// The below is a Getter (it returns the current value):
	public int getPrivateInt() {
		return privateInt;
	}
	// This is a Setter (it changes the current value):
	public void setPrivateInt(int value) {
		privateInt = value;
	}
	
	
	protected int protectedInt = 16;
	int defaultInt = 2;
	public int publicInt = 7;
}
