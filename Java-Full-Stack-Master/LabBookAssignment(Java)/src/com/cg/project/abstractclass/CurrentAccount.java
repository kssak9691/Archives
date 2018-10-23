package com.cg.project.abstractclass;
public class CurrentAccount extends Account {
	private final double overDraftLimit=10000;
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(double balance, Person accountHolder) {
		super(balance, accountHolder);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double withdraw) {
		if(withdraw>overDraftLimit || super.getBalance()<500)
			System.out.println("Withdraw limit exceeded or low balance");
		else
		super.withdraw(withdraw);
	}
}