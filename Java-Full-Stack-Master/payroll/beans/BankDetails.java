package com.cg.payroll.beans;

public class BankDetails {
	private int accountNumber,associateId;
	private String bankName,ifscCode;
	public BankDetails() {
		super();
	}
	public BankDetails(int accountNumber, int associateId, String bankName,
			String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.associateId = associateId;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public BankDetails(int accountNumber, String bankName, String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "BankDetails [accountNumber=" + accountNumber + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + "]";
	}
	
	

}
