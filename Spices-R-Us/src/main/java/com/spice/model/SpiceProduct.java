package com.spice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a Spices-R-Us Product
 */
@Entity
public class SpiceProduct {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(length = 1024)
    private String description;

    @Column(length = 1024)
    private String flavourDescription;

	@Column(length = 1024)
    private String pairingDescription;

    private int weight;

    private float price;

    private int spicyLevel;

    private float discountPrice;

    private float discount;

    @Column(length = 1024)
    private String image;

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

	public String getFlavourDescription() {
		return flavourDescription;
	}

	public void setFlavourDescription(String flavourDescription) {
		this.flavourDescription = flavourDescription;
	}

	public String getPairingDescription() {
		return pairingDescription;
	}

	public void setPairingDescription(String pairingDescription) {
		this.pairingDescription = pairingDescription;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSpicyLevel() {
		return spicyLevel;
	}

	public void setSpicyLevel(int spicyLevel) {
		this.spicyLevel = spicyLevel;
	}

	public float getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
