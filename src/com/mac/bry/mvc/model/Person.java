package com.mac.bry.mvc.model;

import java.util.LinkedHashMap;

public class Person {

	private String firstName;
	private String lastName;
	private String pesel;
	private int age;
	private Sex sex;
	private Adress adress;
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String pesel, int age, Sex sex, Adress adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pesel = pesel;
		this.age = age;
		this.sex = sex;
		this.adress = adress;
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

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
	
}
