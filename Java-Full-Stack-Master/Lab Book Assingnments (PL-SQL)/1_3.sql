DECLARE
	EmpRecord Emp %rowtype;
BEGIN
	SELECT * INTO EmpRecord FROM Emp
	WHERE Empno = 7369;
	              DBMS_OUTPUT.PUT_LINE(EmpRecord.Ename);
END;
/