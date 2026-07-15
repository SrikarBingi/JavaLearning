package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	
	@Id
	private int id;
	
	private String passportNumber;
	
	@OneToOne(mappedBy = "passport")
	private Person person;

	public Passport() {
		super();
	}

	public Passport(int id, String passportNumber) {
		super();
		this.id = id;
		this.passportNumber = passportNumber;
	}
	
	public Passport(int id, String passportNumber, Person person) {
		super();
		this.id = id;
		this.passportNumber = passportNumber;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber + "]";
	}
	
	
	
}
