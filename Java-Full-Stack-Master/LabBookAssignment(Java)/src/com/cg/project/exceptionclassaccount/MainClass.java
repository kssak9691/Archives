package com.cg.project.exceptionclassaccount;
public class MainClass {
	public static void main(String[] args) throws AgeExceededException{
		SavingsAccount smith=new SavingsAccount(400, new Person("Smith", 26));
		CurrentAccount kathy=new CurrentAccount(400, new Person("Kathy", 14));
		if(smith.getAccountHolder().getAge()<15)
			throw new AgeExceededException();
		else{
			smith.deposit(2000);
			System.out.println(smith.toString());
		}
		if(kathy.getAccountHolder().getAge()<15)
			throw new AgeExceededException();
		else{
			kathy.withdraw(1000000);
			System.out.println(kathy.toString());
		}
	}
}