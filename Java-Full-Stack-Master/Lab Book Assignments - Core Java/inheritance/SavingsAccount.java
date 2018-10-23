package com.cg.project.inheritance;
public class SavingsAccount extends Account{
	private final double minBalance=500;
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(long balance, Person accHolder) {
		super(balance, accHolder);
	}
	public void withdraw(double amount) {
		if(super.getBalance()<minBalance || super.getBalance()-amount<minBalance)
			System.out.println("Transaction cannot be done");
		else
			super.withdraw(amount);
	}
}