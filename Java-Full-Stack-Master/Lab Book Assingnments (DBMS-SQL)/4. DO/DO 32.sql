create sequence seq_emp
minvalue 1001
start with 1001;

update employee
set empno=seq_emp.nextval;

CREATE OR REPLACE TRIGGER trg_seq_emp
  BEFORE INSERT ON employee
  FOR EACH ROW
BEGIN
  :new.empno:= seq_emp.nextval;
END;