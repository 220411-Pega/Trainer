package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.println(x++);
		System.out.println(x);
		
		// Use the below to declare a new array of 10 numbers
		int[] listOfNumbers = new int[10];
		// [ 1, 2, 3, 4, 5 ,6 7, 8, 9, 10 ]
		// Arrays are fixed length; if you need a bigger array, you have to make a new one
		
		// The below sets the first element of listOfNumbers to 15
		listOfNumbers[0] = 15; // Arrays are zero-indexed, or start at 0 and go up. The first element has an index of 0
		
		/*
		 * for (counter starts at 0; counter meets some condition; increase counter) { do something for every loop }
		 */
		
		// Sets a value for every element in listOfNumbers
		for (int iteration = 0; iteration < listOfNumbers.length; ++iteration) {
			listOfNumbers[iteration] = iteration;
		}
		
		// The below is called an enhanced for loop; it runs its code for every element in the given data structure
		for (int element : listOfNumbers) {
			//Driver.doubleValueAndPrint(element, element);
		}
	}
	
	// This method mutliplies the given value by another given value and then prints it
	public static void doubleValueAndPrint(/*This is an integer parameter*/ int value, int multiplier) {
		System.out.println(value * multiplier);
	}
	
	// If you use the same method name and return type, but change the parameters, we create an "overload"
	// Java determines which overload to used based on the parameters we pass
	public static void doubleValueAndPrint(int value) {
		System.out.println(value * 2);
	}
}
