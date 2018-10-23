package com.cg.project.inheritance;
public class MainClass {
	public static void main(String[] args) {
		SavingsAccount smith = new SavingsAccount(200, new Person("Smith",25));
		CurrentAccount kathy = new CurrentAccount(300, new Person("Kathy",30));
		smith.deposit(2000);
		System.out.println(smith.toString());
		kathy.withdraw(2000);
		System.out.println(kathy.toString());
	}
}