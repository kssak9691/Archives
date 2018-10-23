package com.cg.project.abstractclass;


public abstract class Account {
	private double balance;
	private long accountNumber;
	private static long ACCOUNT_NUMBER=123456789;
	private Person accountHolder;	
	public Account() {
		super();
	}
	public Account(double balance, Person accountHolder) {
		super();
		this.balance = balance;
		this.accountNumber=ACCOUNT_NUMBER;
		this.accountHolder = accountHolder;
		ACCOUNT_NUMBER++;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Person getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void deposit(double deposit) {
			this.setBalance(this.balance+deposit);
	}
	@Override
	public String toString() {
		return "balance=" + this.getBalance() + ", accountNumber="
				+ accountNumber + ", accountHolder=" + this.getAccountHolder();
	}	
	public void withdraw(double withdraw) {}
}
