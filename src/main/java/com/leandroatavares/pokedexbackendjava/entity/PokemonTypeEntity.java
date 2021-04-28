package com.leandroatavares.pokedexbackendjava.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "POKEMON_TYPE")
public class PokemonTypeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer typeId;
	private String typeName;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

//	public List<PokemonEntity> getPokemon() {
//		return pokemon;
//	}
//
//	public void setPokemon(List<PokemonEntity> pokemon) {
//		this.pokemon = pokemon;
//	}
}
