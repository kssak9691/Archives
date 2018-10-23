package com.cg.project.inheritance;
public class MainClass {
	public static void main(String[] args) {
		SavingsAccount smith=new SavingsAccount(400, new Person("Smith", 26));
		CurrentAccount kathy=new CurrentAccount(400, new Person("Kathy", 31));
		smith.deposit(2000);
		System.out.println(smith.toString());
		kathy.withdraw(1000000);
		System.out.println(kathy.toString());
	}
}