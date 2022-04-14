package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		MyArrayList<String> strings = new MyArrayList<String>();
		strings.add("Hello!");
		strings.add("Goodbye!");
		strings.add("One More.");
		
		for (int i = 0; i < strings.getSize(); ++i) {
			System.out.println(strings.get(i));
		}
	}
}
