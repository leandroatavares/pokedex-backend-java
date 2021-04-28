package com.leandroatavares.pokedexbackendjava.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "POKEMON")
public class PokemonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer numberId;
	private String name;
	private Integer healthPower;
	private Integer attack;
	private Integer defense;
	private Integer specialAttack;
	private Integer specialDefence;
	private Double height;
	private Double weight;
	private Integer speed;
	@OneToOne
	private PokemonTypeEntity elementType1;
	@OneToOne
	private PokemonTypeEntity elementType2;

	public PokemonTypeEntity getElementType1() {
		return elementType1;
	}

	public void setElementType1(PokemonTypeEntity elementType1) {
		this.elementType1 = elementType1;
	}

	public PokemonTypeEntity getElementType2() {
		return elementType2;
	}

	public void setElementType2(PokemonTypeEntity elementType2) {
		this.elementType2 = elementType2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberId() {
		return numberId;
	}

	public void setNumberId(Integer numberId) {
		this.numberId = numberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealthPower() {
		return healthPower;
	}

	public void setHealthPower(Integer healthPower) {
		this.healthPower = healthPower;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(Integer specialAttack) {
		this.specialAttack = specialAttack;
	}

	public Integer getSpecialDefence() {
		return specialDefence;
	}

	public void setSpecialDefence(Integer specialDefence) {
		this.specialDefence = specialDefence;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}
