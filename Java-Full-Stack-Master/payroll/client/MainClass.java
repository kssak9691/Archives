package com.cg.payroll.client;

import com.cg.payroll.beans.*;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.*;

public class MainClass {
	public static void main(String[] args) throws PayrollServicesDownException,AssociateDetailsNotFoundException{

		/*
		BankDetails bankDetails1=new BankDetails(990,243,"SBI","SBI123456");

		Salary salary1=new  Salary(10000,0,0,0,0,0,0,0,0,0,0,"SBI");

		Associate associate1=new Associate(243,1000,"Venkat","Kalyan","ECE","Con","123456","vk243@gmail.com",bankDetails1,salary1);
		Associate associate2=new Associate(244,2000,"Virat","Kaushik","CSE","Sr.Con","357355","sbf254@gmail.com",new BankDetails(991,244,"HDFC","HDFC357355"),new  Salary(1856431,1564,154,154414,1544,1544,1544,165743,5656,16886,15686,"HDFC"));
		Associate associate3=new Associate(323,3000,"Shivam","Mishra","MECH","Asst.Con","543236","jgfk1453@gmail.com",new BankDetails(992,323,"ICICI","ICICI543236"),new Salary(456,41564,18567465,1674,732,5732,454258,3672,3842,35432,355,"ICICI"));
		System.out.println("Full Name := "+associate1.getFirstName()+" "+associate1.getLastName());

		System.out.println(Associate.getASSOCIATE_COUNTER());

		System.out.println("Basic Salary = "+associate1.getSalary().getBasicsalary());

		associate1.getSalary().setHra(30*associate1.getSalary().getBasicsalary()/100);

		System.out.println("HRA = "+associate1.getSalary().getHra());

		associate1.getSalary().setPersonalAllowance(associate1.getSalary().getBasicsalary()/4);

		associate1.getSalary().setOtherAllowance(associate1.getSalary().getBasicsalary()/5);

		System.out.println("Personal Allowance = "+associate1.getSalary().getPersonalAllowance());

		System.out.println("Other Allowance = "+associate1.getSalary().getOtherAllowance());

		associate1.getSalary().setConveyenceAllowance(associate1.getSalary().getBasicsalary()/5);

		System.out.println("Conveyence Allowance = "+associate1.getSalary().getConveyenceAllowance());

		associate1.getSalary().setGrossSalary(associate1.getSalary().getBasicsalary()+associate1.getSalary().getHra()+associate1.getSalary().getPersonalAllowance()+associate1.getSalary().getOtherAllowance()+associate1.getSalary().getConveyenceAllowance()+associate1.getSalary().getCompanyPf()+associate1.getSalary().getEpf()+associate1.getSalary().getGratuity()+associate1.getSalary().getMonthlyTax());

		associate1.getSalary().setNetSalary(associate1.getSalary().getBasicsalary()+associate1.getSalary().getHra()+associate1.getSalary().getPersonalAllowance()+associate1.getSalary().getOtherAllowance()+associate1.getSalary().getConveyenceAllowance());

		System.out.println(associate1.getSalary().getGrossSalary());

		System.out.println(associate1.getSalary().getNetSalary());
		 */

		PayrollServices payrollServices = new PayrollServicesImpl();

		int associateId=payrollServices.acceptAssociateDetails(244,2000,"Virat","Kaushik","CSE","Sr.Con","357355","sbf254@gmail.com" ,991,"HDFC","HDFC357355",1856431, 1544,165743);

		Associate associate=payrollServices.getAssociateDetails(associateId);
		payrollServices.calculateNetSalary(associateId);
		System.out.println(associate.toString());


	}
}