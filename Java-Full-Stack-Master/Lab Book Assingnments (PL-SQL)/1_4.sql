DECLARE
	scode	Staff_Master.staff_code%type;
	sname Staff_Master.staff_name%type;
	dname department_master.dept_name%type;
BEGIN
	SELECT staff_name,staff_code,dept_name INTO sname, scode,dname from Staff_Master s,department_master d
		where staff_name='&ename' and s.dept_code=d.dept_code;
	DBMS_OUTPUT.PUT_LINE(sname||' '||scode|| ' '||dname);
EXCEPTION
	WHEN NO_DATA_FOUND
	THEN DBMS_OUTPUT.PUT_LINE('NO SUCH DATA');
end;
/