package com.capgemini.bank.ui;
import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.exceptions.BankingServicesDownException;
import com.capgemini.bank.exceptions.DemandDraftDetailsNotFoundException;
import com.capgemini.bank.exceptions.InvalidAmountException;
import com.capgemini.bank.service.DemandDraftService;
import com.capgemini.bank.service.IDemandDraftService;
public class Client {
	static Scanner s= new Scanner(System.in); 
	public static void main(String[] args) throws InvalidAmountException, DemandDraftDetailsNotFoundException, BankingServicesDownException {
		IDemandDraftService service = new DemandDraftService();
		String customerName,inFavorOf,ddDescription;
		long phoneNumber;
		int ddAmount,choice,flag=0;
		do{
		System.out.println("1)Enter Demand Draft Details\n2)Exit");
		choice = s.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter the name of the customer : ");
			customerName = s.next();
			System.out.println("Enter customer phone number: ");
			phoneNumber =s.nextLong();
			System.out.println("In favour of:  ");
			inFavorOf = s.next();
			System.out.println("Enter Demand Draft amount (in Rs): ");
			ddAmount = s.nextInt();
			System.out.println("Enter Remarks: ");
			ddDescription = s.next();
			DemandDraft demandDraft = new DemandDraft(customerName, phoneNumber, inFavorOf, ddAmount, ddDescription);
			int transactionId=service.addDemandDraftDetails(demandDraft);
			System.out.println("Your Demand Draft request has been successfully registered along with the "+transactionId);
			System.out.println(service.getDemandDraftDetails(transactionId));
			break;
		case 2 :
			System.out.println("Bye");
			flag=1;
			break;
		default :
			System.out.println("Invalid option");
			flag=1;
			break;
		}
		}while(flag!=1);
	}
}
