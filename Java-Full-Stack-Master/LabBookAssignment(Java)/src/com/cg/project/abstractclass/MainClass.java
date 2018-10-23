package com.cg.project.abstractclass;
public class MainClass {
	public static void main(String[] args) {
		SavingsAccount smith=new SavingsAccount(400, new Person("Smith", 26));
		CurrentAccount kathy=new CurrentAccount(400, new Person("kathy", 26));
		smith.deposit(2000);
		System.out.println(smith.toString());
		kathy.withdraw(1000000);
		System.out.println(kathy.toString());
	}
}