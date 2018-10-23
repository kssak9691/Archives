DECLARE
	salary employee.sal%TYPE;
	deptid employee.deptno%TYPE:=&id;
BEGIN
	SELECT sal INTO salary 
		FROM employee
			WHERE deptno=deptid;
			
	IF salary*0.3>5000
	THEN
		UPDATE employee
		SET sal=sal+5000
		WHERE deptno=deptid;
	ELSE
		UPDATE employee
		SET sal=sal+sal*0.3
		WHERE deptno=deptid;
	END IF;
END;
/