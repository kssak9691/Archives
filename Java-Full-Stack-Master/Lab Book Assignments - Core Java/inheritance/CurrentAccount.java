package com.cg.project.inheritance;
public class CurrentAccount extends Account{
	private final double overDraftLimit=10000;
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(long balance, Person accHolder) {
		super(balance, accHolder);
	}
	public void withdraw(double withdraw) {
		if(withdraw>overDraftLimit || super.getBalance()<500)
			System.out.println("Withdraw limit exceeded or low balance");
		else
			super.withdraw(withdraw);
	}
}
