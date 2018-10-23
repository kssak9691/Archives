package com.cg.project.Constructor;
public class PersonMain2 {
	public static void main(String[] args) {
		PersonMain2 personMain2 = new PersonMain2();
		personMain2.PrintDetails();
	}
	public void PrintDetails() {
		Person person1=new Person("Geetha","Madhuri",'F');
		UpdatePhoneNo phoneNo1=new UpdatePhoneNo(652314);
		System.out.println("Person Details:\n_________\n\nFirst Name: "+person1.getFirstName()+"\nLast Name: "+person1.getLastName()+"\nGender: "+person1.getGender()+"\nPhone No: "+phoneNo1.getPhoneNo());
	}
}