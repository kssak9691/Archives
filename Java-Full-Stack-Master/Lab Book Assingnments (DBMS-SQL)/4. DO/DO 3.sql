ALTER TABLE Customer
ADD Gender varchar2(1)
ADD Age number(3)
ADD phoneNo number(10);

ALTER TABLE Customer RENAME TO Cust_Table;