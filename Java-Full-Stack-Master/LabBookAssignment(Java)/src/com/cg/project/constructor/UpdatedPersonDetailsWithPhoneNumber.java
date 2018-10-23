package com.cg.project.constructor;
public class UpdatedPersonDetailsWithPhoneNumber {
	public static void main(String[] args) {
		UpdatedPersonDetailsWithPhoneNumber c=new UpdatedPersonDetailsWithPhoneNumber();
		c.PhoneNumber();
	}
	private void PhoneNumber() {
		ConstructorCreation constructorCreation=new ConstructorCreation("Suprathik", "Barigala", 'M', 987654321);
		System.out.println("Person Details:\n____________\n\nFirst Name: "+constructorCreation.getFirstName()+"\nLast Name: "+constructorCreation.getLastName()+"\nGender: "+constructorCreation.getGender()+"\nPhone Number: "+constructorCreation.getPhoneNumber());	
	}
}