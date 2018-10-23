package com.cg.project.constructor;
public class PersonMain {
	public static void main(String[] args) {
		ConstructorCreation constructorCreation=new ConstructorCreation("Divya","Bharathi", 'F');
		System.out.println("Person Details:\n____________\n\nFirst Name: "+constructorCreation.getFirstName()+"\nLast Name: "+constructorCreation.getLastName()+"\nGender: "+constructorCreation.getGender());
	}
}