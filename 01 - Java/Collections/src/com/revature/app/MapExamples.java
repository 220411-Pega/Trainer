package com.revature.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	static Map<String, String> favoriteCars;
	
	public static void show() {
		
		favoriteCars = new HashMap<String, String>();
		
		favoriteCars.put("Jacob", "Dodge Dart Ltd");
		favoriteCars.put("Brandy", "Punchbug");
		favoriteCars.put("Mohammed", "Range Rover");
		favoriteCars.put("oMhammed", "Some Car");
		
		String name = "Jacob";
		String faveCar = favoriteCars.get(name);
		System.out.println(name + "'s favorite car is " + faveCar);
		
		// We can get a set of all keys in the Map
		Set<String> keys = favoriteCars.keySet();
		
		//which allows us to iterate through all elements in the map
		for (String s : keys) {
			System.out.println(s);
		}
	}
}
