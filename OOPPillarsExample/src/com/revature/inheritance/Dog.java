package com.revature.inheritance;

//I am the child class
public class Dog extends Pet{
	//these are attributes of the Dog class
	String color;
	String hairLength;
	String food;
	
	//this method overrides our sleep() method in the parent Pet class
	public void sleep() {
		System.out.println("Hey, I am trying to sleep!");
	}
	
	//this method will be overloaded
	public String treats(String treats, String food) {
		System.out.println("my pet likes "+ treats + " and " + food);
		return food;
	}
}
