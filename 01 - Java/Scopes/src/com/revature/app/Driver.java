package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		MyObject o = new MyObject();
		MyObject p = new MyObject();
		
		o.number = 10;
		o.printName();
		
		MyObject.name = "Something else";
		
		p.number = 11;
		
		// These two statements have different individual values for their numbers but the same static value (name)
		p.printName();
		o.printName(); 
		
		String[] strings = new String[3];
		strings[0] = "Tom";
		strings[1] = "Jerry";
		strings[2] = "Popeye";
		o.testArray(strings);
		
		p.testVarArgs("Jack", "Jill", "John");
		p.testVarArgs(strings);
	}
}
