package com.capgemini.bank.bean;
import java.sql.Date;
public class DemandDraft {
	private String customerName;
	long phoneNumber;
	private String inFavorOf;
	private int transactionId;
	private Date dateOfTransation;
	private int ddAmount,ddCommission;
	private String ddDescription;
	public DemandDraft() {
		super();
	}
	
	public DemandDraft(String customerName, long phoneNumber, String inFavorOf,
			int ddAmount, String ddDescription) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.inFavorOf = inFavorOf;
		this.ddAmount = ddAmount;
		this.ddDescription = ddDescription;
	}

	public DemandDraft(String customerName, long phoneNumber, String inFavorOf,
			int transactionId, Date dateOfTransation, int ddAmount,
			int ddCommission, String ddDescription) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.inFavorOf = inFavorOf;
		this.transactionId = transactionId;
		this.dateOfTransation = dateOfTransation;
		this.ddAmount = ddAmount;
		this.ddCommission = ddCommission;
		this.ddDescription = ddDescription;
	}
	
	public DemandDraft(String customerName, long phoneNumber, String inFavorOf,
			Date dateOfTransation, int ddAmount, int ddCommission,
			String ddDescription) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.inFavorOf = inFavorOf;
		this.dateOfTransation = dateOfTransation;
		this.ddAmount = ddAmount;
		this.ddCommission = ddCommission;
		this.ddDescription = ddDescription;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInFavorOf() {
		return inFavorOf;
	}
	public void setInFavorOf(String inFavorOf) {
		this.inFavorOf = inFavorOf;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDateOfTransation() {
		return dateOfTransation;
	}
	public void setDateOfTransation(Date dateOfTransation) {
		this.dateOfTransation = dateOfTransation;
	}
	public int getDdAmount() {
		return ddAmount;
	}
	public void setDdAmount(int ddAmount) {
		this.ddAmount = ddAmount;
	}
	public int getDdCommission() {
		return ddCommission;
	}
	public void setDdCommission(int ddCommission) {
		this.ddCommission = ddCommission;
	}
	public String getDdDescription() {
		return ddDescription;
	}
	public void setDdDescription(String ddDescription) {
		this.ddDescription = ddDescription;
	}

	@Override
	public String toString() {
		return "DemandDraft [customerName=" + customerName + ", phoneNumber="
				+ phoneNumber + ", inFavorOf=" + inFavorOf + ", transactionId="
				+ transactionId + ", dateOfTransation=" + dateOfTransation
				+ ", ddAmount=" + ddAmount + ", ddCommission=" + ddCommission
				+ ", ddDescription=" + ddDescription + "]";
	}
	
	
}
