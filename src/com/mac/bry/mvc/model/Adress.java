package com.mac.bry.mvc.model;

public class Adress {

	private String country;
	private String street;
	private String houseNumber;
	private String localNumber;
	private String zipcode;
	
	public Adress() {
		super();
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
	
	
	
}
