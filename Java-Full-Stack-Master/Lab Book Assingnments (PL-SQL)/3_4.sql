CREATE TABLE STAFF_MASTERS_BACK AS(SELECT * FROM STAFF_MASTER);
TRUNCATE TABLE STAFF_MASTERS_BACK;


create or replace procedure staff_backup(s_code in staff_master.staff_code%type)
    is
    exp number;
    v_sal staff_master.staff_sal%type;
BEGIN
    insert into staff_masters_back(select * from staff_master where staff_code=s_code);
    select staff_sal, round(months_between(sysdate,hiredate)/12) 
	into v_sal, exp from staff_master where staff_code=s_code;
 
    if v_sal IS NULL THEN
	RAISE NO_DATA_FOUND;
 
    if exp>5 then
    	v_sal := (1.25 * v_sal);
    end if;
    if exp between 2 and 5 then
    	v_sal:= (1.20 * v_sal);
    end if;
    update staff_masters set staff_sal=v_sal;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			DBMS_OUTPUT.PUT_LINE("NO DATA FOUND! PLS VERIFY");
end;
/