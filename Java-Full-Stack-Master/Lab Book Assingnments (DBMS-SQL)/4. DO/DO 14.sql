DROP TABLE Suppliers;

create table CustomerMaster
(CustomerId number(5),
CustomerName varchar2(30) NOT NULL,
Address1 varchar2(30) NOT NULL,
Address2 varchar2(30),
Gender varchar2(1),
Age number(3),
PhoneNo number(10),
CONSTRAINT CustId_PK PRIMARY KEY (CustomerId));