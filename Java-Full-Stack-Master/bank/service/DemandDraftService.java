package com.capgemini.bank.service;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.dao.DemandDraftDAO;
import com.capgemini.bank.dao.IDemandDraftDAO;
import com.capgemini.bank.exceptions.BankingServicesDownException;
import com.capgemini.bank.exceptions.DemandDraftDetailsNotFoundException;
import com.capgemini.bank.exceptions.InvalidAmountException;
public class DemandDraftService implements IDemandDraftService{
	IDemandDraftDAO daoService = new DemandDraftDAO();
	private static final Logger logger = Logger.getLogger(DemandDraftService.class);
	@Override
	public int addDemandDraftDetails(DemandDraft demandDraft) throws InvalidAmountException,BankingServicesDownException {
		try{
			if(demandDraft.getDdAmount()<0 || demandDraft.getDdAmount()>500000)
				throw new InvalidAmountException("Please enter correct amount");
			if(demandDraft.getDdAmount()<=5000)
				demandDraft.setDdCommission(10);
			else if(demandDraft.getDdAmount()>5000 && demandDraft.getDdAmount()<=10000)
				demandDraft.setDdCommission(41);
			else if(demandDraft.getDdAmount()>10000 && demandDraft.getDdAmount()<=100000)
				demandDraft.setDdCommission(51);
			else if(demandDraft.getDdAmount()>100000 && demandDraft.getDdAmount()<=500000)
				demandDraft.setDdCommission(306);
			int transactionId=daoService.addDemandDraftDetails(demandDraft);
			return transactionId;
		} catch(SQLException e){
			throw new BankingServicesDownException("Services down");
	}
	}

	@Override
	public DemandDraft getDemandDraftDetails(int transactionId) throws DemandDraftDetailsNotFoundException, BankingServicesDownException {
		try{
		DemandDraft demandDraft=daoService.getDemandDraftDetails(transactionId);
		if(demandDraft==null)
			throw new DemandDraftDetailsNotFoundException();
		return demandDraft;
		}catch(SQLException e){
				throw new BankingServicesDownException("Services down");
		}
	}
}

