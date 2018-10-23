package com.cg.project.enumassignment;
public class ConstructorEnumCreation {
	private String firstName,lastName;
	private GenderEnum gender;
	private int phoneNumber;
	public ConstructorEnumCreation() {
		super();
	}
	public ConstructorEnumCreation(String firstName, String lastName,
			GenderEnum gender, int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
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
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person Details:\n____________\n\nFirst Name:"+ firstName
				+ "\nLast Name: " + lastName + "\nGender: " + gender
				+ "\nPhone Number: " + phoneNumber ;
	}
}