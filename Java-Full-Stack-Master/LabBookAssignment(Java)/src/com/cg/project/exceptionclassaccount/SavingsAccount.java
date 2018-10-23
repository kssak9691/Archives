package com.cg.project.exceptionclassaccount;
public class SavingsAccount extends Account {
	private final double minimumBalance=500;
	public SavingsAccount() {
		super();	
	}
	public SavingsAccount(double balance, Person accountHolder) {
		super(balance, accountHolder);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double withdraw) {
		if(super.getBalance()<minimumBalance || super.getBalance()-withdraw<minimumBalance )
			System.out.println("Transaction cant be done");
		else
			super.withdraw(withdraw);
	}	
}