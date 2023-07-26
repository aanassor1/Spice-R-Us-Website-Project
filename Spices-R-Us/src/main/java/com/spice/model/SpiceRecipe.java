package com.spice.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a Spices-R-Us Recipe
 */
@Entity
public class SpiceRecipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(length = 1024)
    private String description;

    @Column(length = 1024)
    private String spiceDescription;

	private int weight;

    private int spicyLevel;

    @Column(length = 1024)
    private String image;

    @Column(length = 1024)
    private ArrayList<String> ingredients;
    
    @Column(length = 1024)
    private ArrayList<String> instructions;

	// GETTERS AND SETTERS

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpiceDescription() {
		return spiceDescription;
	}

	public void setSpiceDescription(String spiceDescription) {
		this.spiceDescription = spiceDescription;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSpicyLevel() {
		return spicyLevel;
	}

	public void setSpicyLevel(int spicyLevel) {
		this.spicyLevel = spicyLevel;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}

	public ArrayList<String> getInstructions() {
		return instructions;
	}

	public void setInstructions(ArrayList<String> instructions) {
		this.instructions = instructions;
	}

}
