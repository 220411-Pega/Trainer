package com.revature.ex;

public class myException {
		//this is an example of a custom exception
		//this is a method that throws a custom exception if the partySize is greater than 6
		static void checkPartySize(int partySize) {
			if (partySize > 6) {
				//this uses the throw keyword
				throw new ArithmeticException("No more than 6 pokemon can be in your party at one time");
			}
			else {
				System.out.println("Party size accepted");
			}
		}
}
