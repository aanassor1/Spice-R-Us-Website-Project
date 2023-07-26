package com.spice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Represents a Spices-R-Us User Basket
 */
@Entity
public class SpiceBasket {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn
    private SpiceUser user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<BasketProduct> products;

	// GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SpiceUser getUser() {
		return user;
	}

	public void setUser(SpiceUser user) {
		this.user = user;
	}

	public List<BasketProduct> getProducts() {
		return products;
	}

	public void setProducts(List<BasketProduct> products) {
		this.products = products;
	}

}
