package com.mac.bry.mvc.model;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;


public class Adress {

	private String country;
	private String street;
	private String houseNumber;
	private String localNumber;
	private String zipcode;
	
	private LinkedHashMap<String, String>countryOptions;
	
	public Adress() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("PL", "Polska");
		countryOptions.put("GB", "England");
		countryOptions.put("US", "United States");
	}

	public Adress(String country, String street, String houseNumber, String localNumber, String zipcode) {
		super();
		this.country = country;
		this.street = street;
		this.houseNumber = houseNumber;
		this.localNumber = localNumber;
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
	
	
}
