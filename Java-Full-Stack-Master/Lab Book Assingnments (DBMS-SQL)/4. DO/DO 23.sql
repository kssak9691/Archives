create view vAccs_Dtls as select * from AccountsMaster 
where LedgerBalance>10000 and AccountType ='IND'with check option;