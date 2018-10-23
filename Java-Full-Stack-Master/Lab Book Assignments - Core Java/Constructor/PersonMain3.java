package com.cg.project.Constructor;
public class PersonMain3 {
	public static void main(String[] args) {
		PersonMain3 personMain3 = new PersonMain3();
		personMain3.PrintDetails();
	}
	public void PrintDetails() {
		Person2 person1=new Person2("Deepthi","Nallamothu");
		UpdatePhoneNo phoneNo1=new UpdatePhoneNo(652325);
		System.out.println("Person Details:\n_________\n\nFirst Name: "+person1.getFirstName()+"\nLast Name: "+person1.getLastName()+"\nGender: "+EnumGender.Female+"\nPhone No: "+phoneNo1.getPhoneNo());
	}
}