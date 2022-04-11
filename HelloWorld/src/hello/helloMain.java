package hello;

import com.kelsey.dl.PokemonTrainerDAO;

public class helloMain {

	int x;

	// this is the constructor that creates an instance of the helloMain class
	public helloMain() {

		x = 5;
	}

	// created a method that is static with a void return type called myMethod
	static void myMethod() {

		System.out.println("My cat is fluffy");
	}

	// this is our main method
	public static void main(String[] args) {

		// here we are calling our method
		PokemonTrainerDAO.addTrainer();

	}

}
