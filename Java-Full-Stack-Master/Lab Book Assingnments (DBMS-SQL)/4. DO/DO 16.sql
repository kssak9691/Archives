ALTER TABLE AccountsMaster
ADD constraint Cust_acc FOREIGN KEY(CustomerId) REFERENCES CustomerMaster;