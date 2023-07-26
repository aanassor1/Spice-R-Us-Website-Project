package com.spice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Represents a Spices-R-Us Basket Products
 */
@Entity
public class BasketProduct {
    
    private static int productId = 0;

    @Id
    private int id;

    private int initialBasketWeight;

    private int quantity = 1;

    @OneToOne
    private SpiceProduct product;

    public BasketProduct() {
        id = ++productId;
    }

	// GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInitialBasketWeight() {
		return initialBasketWeight;
	}

	public void setInitialBasketWeight(int initialBasketWeight) {
		this.initialBasketWeight = initialBasketWeight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public SpiceProduct getProduct() {
		return product;
	}

	public void setProduct(SpiceProduct product) {
		this.product = product;
	}
    
    
}
