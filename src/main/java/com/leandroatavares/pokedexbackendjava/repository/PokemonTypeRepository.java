package com.leandroatavares.pokedexbackendjava.repository;

import com.leandroatavares.pokedexbackendjava.entity.PokemonTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface PokemonTypeRepository extends CrudRepository<PokemonTypeEntity, Integer> {
}
