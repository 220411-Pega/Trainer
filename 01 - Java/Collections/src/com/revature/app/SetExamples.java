package com.revature.app;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	static Set<String> stringSet;
	
	public static void show() {
		
		stringSet = new HashSet<String>();
		
		stringSet.add("Hello!");
		stringSet.add("Goodbye!");
		
		if (stringSet.contains("Hello!"))
			System.out.println("String Set contains Hello!");
		
		// The main functionality of a set is discarding repeat elements
		stringSet.add("Hello!");
		
		for (String s : stringSet)
			System.out.println(s);
	}
}
