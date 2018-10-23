CREATE VIEW Acc_view 
	AS SELECT CustomerId AS CustomerCode, CustomerName AS AccountHolderName, 
		AccountNumber, AccountType AS Type, LedgerBalance AS Balance 
			FROM AccountsMaster NATURAL JOIN CustomerMaster;