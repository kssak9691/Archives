package com.cg.project.inheritance;
public class Account {
	private  static long  ACCOUNT_NUMBER =123456001;
	private long accNum;
	private double balance;
	private Person accHolder;
	public Account() {
		super();
	}
	public Account(long balance, Person accHolder) {
		super();
		this.accNum = ACCOUNT_NUMBER;
		this.balance = balance;
		this.accHolder = accHolder;
		ACCOUNT_NUMBER+=10;
	}
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount){
		this.setBalance((long)(this.getBalance()+amount));
	}
	public void withdraw(double amount){
		this.setBalance((long)(this.getBalance()-amount));
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + this.getAccHolder()+ "]";
	}
}
