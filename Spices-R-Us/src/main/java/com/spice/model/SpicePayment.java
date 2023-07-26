package com.spice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Represents a Spices-R-Us Payment entity.
 */
@Entity
public class SpicePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cardNumber;

    private String expDate;

    private String CVV;

    private String firstName;

    private String lastName;

    private String addressL1;

    private String addressL2;

    private String city;

    private String county;

    private String postcode;

    @Transient
    private String error;

	// GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
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

	public String getAddressL1() {
		return addressL1;
	}

	public void setAddressL1(String addressL1) {
		this.addressL1 = addressL1;
	}

	public String getAddressL2() {
		return addressL2;
	}

	public void setAddressL2(String addressL2) {
		this.addressL2 = addressL2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

    
    
}
