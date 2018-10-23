create table AccountsMaster
(CustomerId number(5),
AccountNumber number(10,2),
AccountType char(3),
LedgerBalance number(10,2) NOT NULL,
CONSTRAINT Acc_PK PRIMARY KEY (AccountNumber));