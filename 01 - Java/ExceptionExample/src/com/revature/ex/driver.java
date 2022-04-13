package com.revature.ex;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		//this is example of a try/catch block
		//the try statement lets you execute a block of code for the sake of testing for errors
		try {
			//block of code we want to try
			int[] partyPokemon = {1, 2, 3, 4, 5, 6};
			System.out.println(partyPokemon[4]);
		} 
		//the exception we want to catch, in this case we catch an exception and assign it to variable e
		catch(Exception e){ 
			System.out.println("a party can only have 6 pokemon.");
	}
		//the finally statement executes a line of code after the try/catch blocks, no matter what the result of the try/catch was
		finally {
			System.out.println("the finally statement has run successfully");
		}

		
		//this is our new scanner called userObj for getting user input
		Scanner userObj = new Scanner(System.in);
		//this prompts the user for an input
		//System.out.println("How many pokemon are in your party?");
		//this line takes the next integer that the user inputs and assigns that value to the 'party' variable
		//int party = userObj.nextInt();
		//we are passing the party variable as our parameter for the checkPartySize method
		//myException.checkPartySize(party);
		
		int myInput;
		try {
		System.out.println("What is your favorite number?");
		
		myInput = userObj.nextInt();
		System.out.println("My favorite number is " + myInput);
		
		} catch (Exception e) {
			System.out.println("the data entered is invalid. please input a number");
		}
		
		
}

	
}
