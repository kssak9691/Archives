DECLARE
V_BONUS STAFF_MASTER.STAFF_SAL%TYPE;
V_SAL STAFF_MASTER.STAFF_SAL%TYPE;
CURSOR c_sal IS SELECT staff_sal FROM staff_master where mgr_code=100006;
BEGIN
if c_sal%ISOPEN
	then
		null;
	else
		OPEN c_sal;
	end if;
	FETCH c_sal into v_sal;
	LOOP
		FETCH c_sal into v_sal;
		exit when c_sal%NOTFOUND;
		V_BONUS:=2*V_SAL;
		DBMS_OUTPUT.PUT_LINE('STAFF SALARY IS ' || V_SAL);
		DBMS_OUTPUT.PUT_LINE('STAFF BONUS IS ' || V_BONUS);
	end loop;
EXCEPTION
WHEN NO_DATA_FOUND THEN
DBMS_OUTPUT.PUT_LINE('GIVEN CODE IS NOT VALID.ENTER VALID CODE');
END;
/