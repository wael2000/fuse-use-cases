package org.rh.model;

import java.io.Serializable;

public class Address implements Serializable{
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	
	String getAddressLine1() {
		return addressLine1;
	}
	void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	String getAddressLine2() {
		return addressLine2;
	}
	void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
}
