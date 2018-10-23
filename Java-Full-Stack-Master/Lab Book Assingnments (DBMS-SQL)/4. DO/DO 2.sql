alter table Customer modify cust_name varchar2(30); 
alter table Customer rename column cust_name to customer_name;

alter table Customer rename column customer_name to CustomerName;