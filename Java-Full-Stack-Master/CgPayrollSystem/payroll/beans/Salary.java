package com.cg.payroll.beans;

public class Salary {
	private int basicsalary,hra,conveyenceAllowance,otherAllowance,personalAllowance,monthlyTax,epf,companyPf,gratuity,grossSalary,netSalary;
	private String bankName;
	public Salary() {
		super();
	}
	
	public Salary(int basicSalary, int epf, int companyPf) {
		super();
		this.basicsalary = basicSalary;
		this.epf = epf;
		this.companyPf = companyPf;
		
	}
	
	public Salary(int basicsalary, int hra, int conveyenceAllowance,
			int otherAllowance, int personalAllowance, int monthlyTax, int epf,
			int companyPf, int gratuity, int grossSalary, int netSalary,
			String bankName) {
		super();
		this.basicsalary = basicsalary;
		this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.gratuity = gratuity;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
		this.bankName = bankName;
	}
	public int getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}
	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getGratuity() {
		return gratuity;
	}
	public void setGratuity(int gratuity) {
		this.gratuity = gratuity;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
