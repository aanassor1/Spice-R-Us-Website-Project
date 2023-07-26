package com.spice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 * Represents a Spices-R-Us User
 */
@Entity
public class SpiceUser {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String username;
    
    @Column(unique = true, nullable = true)
    private String email;
    
    @Column(nullable = false)
    private String password;

    @Column(name = "confirmPassword")
    @Transient
    private String confirmPassword;

	private String firstName;
    
    private String lastName;
    
    @Column(nullable = false)
    private String roles;

    @OneToOne
    private SpiceBasket basket;

    @OneToOne
    private SpicePayment payment;

	// GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public SpiceBasket getBasket() {
		return basket;
	}

	public void setBasket(SpiceBasket basket) {
		this.basket = basket;
	}

	public SpicePayment getPayment() {
		return payment;
	}

	public void setPayment(SpicePayment payment) {
		this.payment = payment;
	}
    
}
