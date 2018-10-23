package com.cg.project.Constructor;
public class PersonMain {
	public static void main(String[] args) {
		Person person1=new Person("Venkat","Kalyan",'M');
		System.out.println("Person Details:\n_________\n\nFirst Name: "+person1.getFirstName()+"\nLast Name: "+person1.getLastName()+"\nGender: "+person1.getGender());
	}
}