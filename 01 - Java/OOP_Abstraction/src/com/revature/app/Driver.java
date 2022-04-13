package com.revature.app;

import java.util.Arrays;
import java.util.Collections;

/*
 * Abstraction - Removing the implementation details from a problem
 * and focusing on interaction between systems.
 * 
 * Classic examples include steering wheels in cars and electrical outlets using electric plugs.
 * 
 * In Java, we have two tools for implementing Abstraction:
 * 1.  Interfaces, which describe which methods should be implemented but not how. Also a way to communicate
 *    between developers.
 * 2.  Abstract Classes, which define methods to be inherited but cannot be instantiated
 */

public class Driver {

	public static void main(String[] args) {
		
		Vehicle a = new Vehicle(),
				b = new Vehicle(),
				c = new Vehicle();
		
		a.make = "Honda";
		a.model = "Accord";
		a.year = "2000";
		
		b.make = "Hyundai";
		b.model = "Elantra";
		b.year = "2011";
		
		c.make = "Ford";
		c.model = "Ranger";
		c.year = "1997";
		
		Vehicle[] vehicles = new Vehicle[] { a, b, c };
		Arrays.sort(vehicles);
		System.out.println(Arrays.toString(vehicles));
	}
}
