package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> pokemons= new ArrayList<>();;

    public void anadirpokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }


}
