package com.revature.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExamples {

	static Set<String> stringSet = new HashSet<String>();
	
	public static void show() {
		
		stringSet.add("Wow!");
		stringSet.add("Woah!");
		stringSet.add("Jeez!");
		
		// Spawn an iterator using .iterator()
		Iterator<String> it = stringSet.iterator();
		// Using a while loop, we iterate until .hasNext() returns false
		while (it.hasNext()) {
			// In order to move to the next element and get it, we use .next()
			String s = it.next();
			System.out.println(s);
		}
	}
}
