package com.cg.payroll.services;

import java.util.ArrayList;

import com.cg.payroll.exceptions.*;
import com.cg.payroll.beans.*;

public interface PayrollServices {
	int acceptAssociateDetails(int associateID, int yearlyInvestmentUnder80c,
			String firstName, String lastName, String department,
			String designation, String pancard, String emailId,int accountNumber, String bankName,
			String ifscCode,int basicsalary, int epf,
			int companyPf) throws PayrollServicesDownException;
	
	int calculateNetSalary(int associateId) throws AssociateDetailsNotFoundException,PayrollServicesDownException;
	
	Associate getAssociateDetails(int associateId) throws AssociateDetailsNotFoundException,PayrollServicesDownException;
	
	ArrayList<Associate>getAllAsociateDetails() throws PayrollServicesDownException;
}
