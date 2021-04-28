package com.leandroatavares.pokedexbackendjava.repository;

import com.leandroatavares.pokedexbackendjava.entity.PokemonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<PokemonEntity, Integer> {
}
