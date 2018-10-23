package com.capgemini.bank.service;

import java.sql.SQLException;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.exceptions.BankingServicesDownException;
import com.capgemini.bank.exceptions.DemandDraftDetailsNotFoundException;
import com.capgemini.bank.exceptions.InvalidAmountException;

public interface IDemandDraftService {
	int addDemandDraftDetails(DemandDraft demandDraft) throws InvalidAmountException,BankingServicesDownException;
	DemandDraft getDemandDraftDetails(int transactionId) throws DemandDraftDetailsNotFoundException, BankingServicesDownException;
}
