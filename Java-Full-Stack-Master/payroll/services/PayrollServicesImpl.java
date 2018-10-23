package com.cg.payroll.services;

import java.util.ArrayList;

import com.cg.payroll.beans.*;
import com.cg.payroll.dao.*;
import com.cg.payroll.exceptions.*;

public class PayrollServicesImpl implements PayrollServices {
	
	private AssociateDAO associateDAO = new AssociateDAOImpl() ;

	@Override
	public int acceptAssociateDetails(int associateID,
			int yearlyInvestmentUnder80c, String firstName, String lastName,
			String department, String designation, String pancard,
			String emailId, int accountNumber, String bankName,
			String ifscCode, int basicsalary, int epf, int companyPf)
			throws PayrollServicesDownException {
			Associate associate = new Associate(yearlyInvestmentUnder80c, firstName, lastName, department, designation, pancard, emailId, new BankDetails(accountNumber, bankName, ifscCode),new Salary(basicsalary, epf, companyPf));
			associate=associateDAO.save(associate);
			return associate.getAssociateID();
	}

	@Override
	public int calculateNetSalary(int associateId)
			throws AssociateDetailsNotFoundException,
			PayrollServicesDownException {
		Associate associate=getAssociateDetails(associateId);
		
		associate.getSalary().setHra((30*associate.getSalary().getBasicsalary())/100);
		associate.getSalary().setConveyenceAllowance((5*associate.getSalary().getBasicsalary())/100);
		associate.getSalary().setOtherAllowance((20*associate.getSalary().getBasicsalary())/100);
		associate.getSalary().setPersonalAllowance((25*associate.getSalary().getBasicsalary())/100);
		associate.getSalary().setGrossSalary(associate.getSalary().getBasicsalary()+associate.getSalary().getHra()+associate.getSalary().getConveyenceAllowance()+associate.getSalary().getOtherAllowance()+associate.getSalary().getPersonalAllowance());
		
		int yearlySalary=(associate.getSalary().getGrossSalary()*12);
		if(yearlySalary<=250000){
			associate.getSalary().setMonthlyTax(0);
		}
		else if(yearlySalary>250000 && yearlySalary<=500000)
			associate.getSalary().setMonthlyTax((5*(yearlySalary-250000))/(100*12));
		else if(yearlySalary>500000 && yearlySalary<=1000000){
			int taxUpto5Lakh=25000;
			int taxUpto10Lakh=(20*(yearlySalary-500000))/100;
			associate.getSalary().setMonthlyTax((taxUpto5Lakh+taxUpto10Lakh)/12);
			}
		else if(yearlySalary>1000000){
			int taxUpto5Lakh=25000;
			int taxUpto10Lakh=100000;
			int taxAbove10Lakh=(30*(yearlySalary-1000000))/100;
			associate.getSalary().setMonthlyTax((taxUpto5Lakh+taxUpto10Lakh+taxAbove10Lakh)/12);
			}
		associate.getSalary().setNetSalary(associate.getSalary().getGrossSalary()-associate.getSalary().getMonthlyTax());
		return associate.getSalary().getNetSalary();
	}

	@Override
	public Associate getAssociateDetails(int associateId)
			throws AssociateDetailsNotFoundException,
			PayrollServicesDownException {
			Associate associate=associateDAO.findOne(associateId);
			if(associate==null) throw new AssociateDetailsNotFoundException("Associate Details Not Found");			
		return associate;
	}

	@Override
	public ArrayList<Associate> getAllAsociateDetails()
			throws PayrollServicesDownException {
		return associateDAO.findAll();
	}


	
	
}