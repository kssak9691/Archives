package com.cg.payroll.beans;

public class Associate {
	private int  associateID,yearlyInvestmentUnder80c;
	private String  firstName,lastName,department,designation,pancard,emailId;
	private BankDetails bankdetails;
	private Salary salary;
	private static int ASSOCIATE_COUNTER;
	static{
		ASSOCIATE_COUNTER=101;
	}
	public Associate() {
		super();
	}
	
	public Associate(int yearlyInvestmentUnder80C, String firstName, String lastName, String department,
			String designation, String pancard, String emailId, BankDetails bankDetails, Salary salary) {
		super();
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankdetails = bankDetails;
		this.salary = salary;
	}

	public Associate(int associateID, int yearlyInvestmentUnder80C, String firstName, String lastName,
			String department, String designation, String pancard, String emailId) {
		super();
		this.associateID = associateID;
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
	}	
	
	public Associate(int associateID, int yearlyInvestmentUnder80C, String firstName, String lastName,
			String department, String designation, String pancard, String emailId, BankDetails bankDetails,
			Salary salary) {
		super();
		this.associateID = associateID;
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankdetails = bankDetails;
		this.salary = salary;
	}
	
	public int getAssociateID() {
		return associateID;
	}
	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}
	public int getYearlyInvestmentUnder80c() {
		return yearlyInvestmentUnder80c;
	}
	public void setYearlyInvestmentUnder80c(int yearlyInvestmentUnder80c) {
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80c;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public BankDetails getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public static int getASSOCIATE_COUNTER() {
		return ASSOCIATE_COUNTER;
	}
	public static void setASSOCIATE_COUNTER(int aSSOCIATE_COUNTER) {
		ASSOCIATE_COUNTER = aSSOCIATE_COUNTER;
	}
}