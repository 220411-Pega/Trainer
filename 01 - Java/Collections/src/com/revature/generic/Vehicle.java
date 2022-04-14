package com.revature.generic;

public class Vehicle {

	public String make, model, year;
	
	public Vehicle(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String toString() {
		return year + " " + make + " " + model;
	}
}
