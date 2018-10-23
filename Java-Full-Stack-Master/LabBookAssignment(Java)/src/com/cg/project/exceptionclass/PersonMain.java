package com.cg.project.exceptionclass;
public class PersonMain {
	public static void main(String[] args) throws FullNameNotFoundException{
		ConstructorCreation constructorCreation=new ConstructorCreation(null,"Bharathi", 'F');
		if(constructorCreation.getFirstName()=="" || constructorCreation.getLastName()=="" || constructorCreation.getFirstName()==null || constructorCreation.getLastName()==null)
			throw new FullNameNotFoundException();
		else
		System.out.println("Person Details:\n____________\n\nFirst Name: "+constructorCreation.getFirstName()+"\nLast Name: "+constructorCreation.getLastName()+"\nGender: "+constructorCreation.getGender());
	}
}