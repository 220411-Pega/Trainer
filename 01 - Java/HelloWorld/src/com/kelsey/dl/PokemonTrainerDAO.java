package com.kelsey.dl;

public class PokemonTrainerDAO {

	public static PokemonTrainer addTrainer() {
		
		//this line initializes an instance of the PokemonTrainer model class
		PokemonTrainer pokemonTrainer = new PokemonTrainer();
		
		 pokemonTrainer.firstName = "Kelsey";
		 pokemonTrainer.lastName = "Morrison";
		 pokemonTrainer.age = 25;
		 pokemonTrainer.typeFavorite = "Dragon";
		 pokemonTrainer.badges = 2;
		 
		 System.out.println(pokemonTrainer);
		return pokemonTrainer;
	} 
}
