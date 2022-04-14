package com.revature.app;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

	// You can declare variables with an Interface type...
	static List<String> strings;
	
	public static void show() {
		
		// ... but you cannot instantiate them.
		// strings = new List<String>();
		
		// Instead, you must instantiate a type that implements the interface
		strings = new ArrayList<String>();
		
		// If we want to add a string
		strings.add("Hello!");
		
		// We can also remove elements by index or value
		//strings.remove(0);
		//strings.remove("Hello!");
		
		// To retrieve values, use get with an index
		String s = strings.get(0);
		
		s = "Goodbye!";
		
		System.out.println(strings.get(0));
		
		// To change an element at a particular index, we use set
		strings.set(0, "Goodbye!");
		
		System.out.println(strings.get(0));
	}
}
