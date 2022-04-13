package com.revature.inheritance;

//I am the parent class
public class Pet {
	//these are attributes of the Pet class
	static String size = "large";
	String sound;
	String treats;

	//this method gets overridden in the child Dog class
	public void sleep() {
		System.out.println("zzz");
	}
	//this method will be overloaded
		public void treats(String treats) {
			System.out.println("my pet likes "+ treats);
		}

}