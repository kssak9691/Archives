Alter table AccountsMaster
Add constraint Cust_acc foreign key(CustomerId) references CustomerMaster(CustomerId)
on delete cascade;